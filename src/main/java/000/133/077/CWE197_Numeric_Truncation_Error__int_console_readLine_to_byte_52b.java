/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE197_Numeric_Truncation_Error__int_console_readLine_to_byte_52b.java
Label Definition File: CWE197_Numeric_Truncation_Error__int.label.xml
Template File: sources-sink-52b.tmpl.java
*/
/*
 * @description
 * CWE: 197 Numeric Truncation Error
 * BadSource: console_readLine Read data from the console using readLine
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: to_byte
 *    BadSink : Convert data to a byte
 * Flow Variant: 52 Data flow: data passed as an argument from one method to another to another in three different classes in the same package
 *
 * */




public class CWE197_Numeric_Truncation_Error__int_console_readLine_to_byte_52b
{
    public void badSink(int data ) throws Throwable
    {
        (new CWE197_Numeric_Truncation_Error__int_console_readLine_to_byte_52c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data ) throws Throwable
    {
        (new CWE197_Numeric_Truncation_Error__int_console_readLine_to_byte_52c()).goodG2BSink(data );
    }
}
