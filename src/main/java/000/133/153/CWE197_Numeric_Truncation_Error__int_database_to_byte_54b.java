/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE197_Numeric_Truncation_Error__int_database_to_byte_54b.java
Label Definition File: CWE197_Numeric_Truncation_Error__int.label.xml
Template File: sources-sink-54b.tmpl.java
*/
/*
 * @description
 * CWE: 197 Numeric Truncation Error
 * BadSource: database Read data from a database
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: to_byte
 *    BadSink : Convert data to a byte
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */




public class CWE197_Numeric_Truncation_Error__int_database_to_byte_54b
{
    public void badSink(int data ) throws Throwable
    {
        (new CWE197_Numeric_Truncation_Error__int_database_to_byte_54c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data ) throws Throwable
    {
        (new CWE197_Numeric_Truncation_Error__int_database_to_byte_54c()).goodG2BSink(data );
    }
}
