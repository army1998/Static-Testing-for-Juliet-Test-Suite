/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__byte_console_readLine_add_72b.java
Label Definition File: CWE190_Integer_Overflow.label.xml
Template File: sources-sinks-72b.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: console_readLine Read data from the console using readLine
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: add
 *    GoodSink: Ensure there will not be an overflow before adding 1 to data
 *    BadSink : Add 1 to data, which can cause an overflow
 * Flow Variant: 72 Data flow: data passed in a Vector from one method to another in different source files in the same package
 *
 * */



import java.util.Vector;



public class CWE190_Integer_Overflow__byte_console_readLine_add_72b
{
    public void badSink(Vector<Byte> dataVector ) throws Throwable
    {
        byte data = dataVector.remove(2);

        /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
        byte result = (byte)(data + 1);

        IO.writeLine("result: " + result);

    }

    /* goodG2B() - use GoodSource and BadSink */
    public void goodG2BSink(Vector<Byte> dataVector ) throws Throwable
    {
        byte data = dataVector.remove(2);

        /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
        byte result = (byte)(data + 1);

        IO.writeLine("result: " + result);

    }

    /* goodB2G() - use BadSource and GoodSink */
    public void goodB2GSink(Vector<Byte> dataVector ) throws Throwable
    {
        byte data = dataVector.remove(2);

        /* FIX: Add a check to prevent an overflow from occurring */
        if (data < Byte.MAX_VALUE)
        {
            byte result = (byte)(data + 1);
            IO.writeLine("result: " + result);
        }
        else
        {
            IO.writeLine("data value is too large to perform addition.");
        }

    }
}
