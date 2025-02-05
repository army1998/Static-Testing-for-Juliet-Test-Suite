/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE197_Numeric_Truncation_Error__short_console_readLine_54b.java
Label Definition File: CWE197_Numeric_Truncation_Error__short.label.xml
Template File: sources-sink-54b.tmpl.java
*/
/*
 * @description
 * CWE: 197 Numeric Truncation Error
 * BadSource: console_readLine Read data from the console using readLine
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: to_byte
 *    BadSink : Convert data to a byte
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */




public class CWE197_Numeric_Truncation_Error__short_console_readLine_54b
{
    public void badSink(short data ) throws Throwable
    {
        (new CWE197_Numeric_Truncation_Error__short_console_readLine_54c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(short data ) throws Throwable
    {
        (new CWE197_Numeric_Truncation_Error__short_console_readLine_54c()).goodG2BSink(data );
    }
}
