/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__long_max_add_66b.java
Label Definition File: CWE190_Integer_Overflow.label.xml
Template File: sources-sinks-66b.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: max Set data to the max value for long
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: add
 *    GoodSink: Ensure there will not be an overflow before adding 1 to data
 *    BadSink : Add 1 to data, which can cause an overflow
 * Flow Variant: 66 Data flow: data passed in an array from one method to another in different source files in the same package
 *
 * */






public class CWE190_Integer_Overflow__long_max_add_66b
{
    public void badSink(long dataArray[] ) throws Throwable
    {
        long data = dataArray[2];

        /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
        long result = (long)(data + 1);

        IO.writeLine("result: " + result);

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(long dataArray[] ) throws Throwable
    {
        long data = dataArray[2];

        /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
        long result = (long)(data + 1);

        IO.writeLine("result: " + result);

    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(long dataArray[] ) throws Throwable
    {
        long data = dataArray[2];

        /* FIX: Add a check to prevent an overflow from occurring */
        if (data < Long.MAX_VALUE)
        {
            long result = (long)(data + 1);
            IO.writeLine("result: " + result);
        }
        else
        {
            IO.writeLine("data value is too large to perform addition.");
        }

    }
}
