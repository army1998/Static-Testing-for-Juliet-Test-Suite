/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__long_rand_square_71a.java
Label Definition File: CWE190_Integer_Overflow.label.xml
Template File: sources-sinks-71a.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: rand Set data to result of rand()
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: square
 *    GoodSink: Ensure there will not be an overflow before squaring data
 *    BadSink : Square data, which can lead to overflow
 * Flow Variant: 71 Data flow: data passed as an Object reference argument from one method to another in different classes in the same package
 *
 * */






public class CWE190_Integer_Overflow__long_rand_square_71a extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        long data;

        /* POTENTIAL FLAW: Use a random value */
        data = (new java.security.SecureRandom()).nextLong();

        (new CWE190_Integer_Overflow__long_rand_square_71b()).badSink((Object)data  );
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

        (new CWE190_Integer_Overflow__long_rand_square_71b()).goodG2BSink((Object)data  );
    }

    /* goodB2G() - use badsource and goodsink */
    private void goodB2G() throws Throwable
    {
        long data;

        /* POTENTIAL FLAW: Use a random value */
        data = (new java.security.SecureRandom()).nextLong();

        (new CWE190_Integer_Overflow__long_rand_square_71b()).goodB2GSink((Object)data  );
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
