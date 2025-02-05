/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE197_Numeric_Truncation_Error__int_File_to_short_71b.java
Label Definition File: CWE197_Numeric_Truncation_Error__int.label.xml
Template File: sources-sink-71b.tmpl.java
*/
/*
 * @description
 * CWE: 197 Numeric Truncation Error
 * BadSource: File Read data from file (named c:\data.txt)
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: to_short
 *    BadSink : Convert data to a short
 * Flow Variant: 71 Data flow: data passed as an Object reference argument from one method to another in different classes in the same package
 *
 * */




public class CWE197_Numeric_Truncation_Error__int_File_to_short_71b
{
    public void badSink(Object dataObject ) throws Throwable
    {
        int data = (Integer)dataObject;

        {
            /* POTENTIAL FLAW: Convert data to a short, possibly causing a truncation error */
            IO.writeLine((short)data);
        }

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(Object dataObject ) throws Throwable
    {
        int data = (Integer)dataObject;

        {
            /* POTENTIAL FLAW: Convert data to a short, possibly causing a truncation error */
            IO.writeLine((short)data);
        }

    }
}
