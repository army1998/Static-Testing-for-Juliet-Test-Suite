/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE191_Integer_Underflow__short_rand_sub_51b.java
Label Definition File: CWE191_Integer_Underflow.label.xml
Template File: sources-sinks-51b.tmpl.java
*/
/*
 * @description
 * CWE: 191 Integer Underflow
 * BadSource: rand Set data to result of rand()
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: sub
 *    GoodSink: Ensure there will not be an underflow before subtracting 1 from data
 *    BadSink : Subtract 1 from data, which can cause an Underflow
 * Flow Variant: 51 Data flow: data passed as an argument from one function to another in different classes in the same package
 *
 * */




public class CWE191_Integer_Underflow__short_rand_sub_51b
{
    public void badSink(short data ) throws Throwable
    {

        /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
        short result = (short)(data - 1);

        IO.writeLine("result: " + result);

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(short data ) throws Throwable
    {

        /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
        short result = (short)(data - 1);

        IO.writeLine("result: " + result);

    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(short data ) throws Throwable
    {

        /* FIX: Add a check to prevent an overflow from occurring */
        if (data > Short.MIN_VALUE)
        {
            short result = (short)(data - 1);
            IO.writeLine("result: " + result);
        }
        else
        {
            IO.writeLine("data value is too small to perform subtraction.");
        }

    }
}
