/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE197_Numeric_Truncation_Error__short_listen_tcp_66b.java
Label Definition File: CWE197_Numeric_Truncation_Error__short.label.xml
Template File: sources-sink-66b.tmpl.java
*/
/*
 * @description
 * CWE: 197 Numeric Truncation Error
 * BadSource: listen_tcp Read data using a listening tcp connection
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: to_byte
 *    BadSink : Convert data to a byte
 * Flow Variant: 66 Data flow: data passed in an array from one method to another in different source files in the same package
 *
 * */




public class CWE197_Numeric_Truncation_Error__short_listen_tcp_66b
{
    public void badSink(short dataArray[] ) throws Throwable
    {
        short data = dataArray[2];

        {
            /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
            IO.writeLine((byte)data);
        }

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(short dataArray[] ) throws Throwable
    {
        short data = dataArray[2];

        {
            /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
            IO.writeLine((byte)data);
        }

    }
}
