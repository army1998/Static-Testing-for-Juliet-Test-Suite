/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE197_Numeric_Truncation_Error__int_Environment_to_byte_67b.java
Label Definition File: CWE197_Numeric_Truncation_Error__int.label.xml
Template File: sources-sink-67b.tmpl.java
*/
/*
 * @description
 * CWE: 197 Numeric Truncation Error
 * BadSource: Environment Read data from an environment variable
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: to_byte
 *    BadSink : Convert data to a byte
 * Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
 *
 * */




public class CWE197_Numeric_Truncation_Error__int_Environment_to_byte_67b
{
    public void badSink(CWE197_Numeric_Truncation_Error__int_Environment_to_byte_67a.Container dataContainer ) throws Throwable
    {
        int data = dataContainer.containerOne;

        {
            /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
            IO.writeLine((byte)data);
        }

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(CWE197_Numeric_Truncation_Error__int_Environment_to_byte_67a.Container dataContainer ) throws Throwable
    {
        int data = dataContainer.containerOne;

        {
            /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
            IO.writeLine((byte)data);
        }

    }
}
