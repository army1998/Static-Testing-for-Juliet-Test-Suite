/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE191_Integer_Underflow__long_min_multiply_53a.java
Label Definition File: CWE191_Integer_Underflow.label.xml
Template File: sources-sinks-53a.tmpl.java
*/
/*
 * @description
 * CWE: 191 Integer Underflow
 * BadSource: min Set data to the max value for long
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: multiply
 *    GoodSink: Ensure there will not be an underflow before multiplying data by 2
 *    BadSink : If data is negative, multiply by 2, which can cause an underflow
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */




public class CWE191_Integer_Underflow__long_min_multiply_53a extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        long data;

        /* POTENTIAL FLAW: Use the maximum size of the data type */
        data = Long.MIN_VALUE;

        (new CWE191_Integer_Underflow__long_min_multiply_53b()).badSink(data );
    }

    public void good() throws Throwable
    {
        goodG2B();
        goodB2G();
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
    {
        long data;

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2;

        (new CWE191_Integer_Underflow__long_min_multiply_53b()).goodG2BSink(data );
    }

    /* goodB2G() - use badsource and goodsink */
    private void goodB2G() throws Throwable
    {
        long data;

        /* POTENTIAL FLAW: Use the maximum size of the data type */
        data = Long.MIN_VALUE;

        (new CWE191_Integer_Underflow__long_min_multiply_53b()).goodB2GSink(data );
    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }

}
