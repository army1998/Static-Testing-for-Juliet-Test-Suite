/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE191_Integer_Underflow__long_min_sub_53b.java
Label Definition File: CWE191_Integer_Underflow.label.xml
Template File: sources-sinks-53b.tmpl.java
*/
/*
 * @description
 * CWE: 191 Integer Underflow
 * BadSource: min Set data to the max value for long
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: sub
 *    GoodSink: Ensure there will not be an underflow before subtracting 1 from data
 *    BadSink : Subtract 1 from data, which can cause an Underflow
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */




public class CWE191_Integer_Underflow__long_min_sub_53b
{
    public void badSink(long data ) throws Throwable
    {
        (new CWE191_Integer_Underflow__long_min_sub_53c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(long data ) throws Throwable
    {
        (new CWE191_Integer_Underflow__long_min_sub_53c()).goodG2BSink(data );
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(long data ) throws Throwable
    {
        (new CWE191_Integer_Underflow__long_min_sub_53c()).goodB2GSink(data );
    }
}
