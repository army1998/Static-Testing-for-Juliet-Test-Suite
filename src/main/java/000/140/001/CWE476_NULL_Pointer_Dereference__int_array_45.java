/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE476_NULL_Pointer_Dereference__int_array_45.java
Label Definition File: CWE476_NULL_Pointer_Dereference.label.xml
Template File: sources-sinks-45.tmpl.java
*/
/*
 * @description
 * CWE: 476 Null Pointer Dereference
 * BadSource:  Set data to null
 * GoodSource: Set data to a non-null value
 * Sinks:
 *    GoodSink: add check to prevent possibility of null dereference
 *    BadSink : possibility of null dereference
 * Flow Variant: 45 Data flow: data passed as a private class member variable from one function to another in the same class
 *
 * */





public class CWE476_NULL_Pointer_Dereference__int_array_45 extends AbstractTestCase
{
    private int [] dataBad;
    private int [] dataGoodG2B;
    private int [] dataGoodB2G;

    private void badSink() throws Throwable
    {
        int [] data = dataBad;

        /* POTENTIAL FLAW: null dereference will occur if data is null */
        IO.writeLine("" + data.length);

    }

    public void bad() throws Throwable
    {
        int [] data;

        /* POTENTIAL FLAW: data is null */
        data = null;

        dataBad = data;
        badSink();
    }

    public void good() throws Throwable
    {
        goodG2B();
        goodB2G();
    }

    private void goodG2BSink() throws Throwable
    {
        int [] data = dataGoodG2B;

        /* POTENTIAL FLAW: null dereference will occur if data is null */
        IO.writeLine("" + data.length);

    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
    {
        int [] data;

        /* FIX: hardcode data to non-null */
        data = new int[5];

        dataGoodG2B = data;
        goodG2BSink();
    }

    private void goodB2GSink() throws Throwable
    {
        int [] data = dataGoodB2G;

        /* FIX: validate that data is non-null */
        if (data != null)
        {
            IO.writeLine("" + data.length);
        }
        else
        {
            IO.writeLine("data is null");
        }

    }

    /* goodB2G() - use badsource and goodsink */
    private void goodB2G() throws Throwable
    {
        int [] data;

        /* POTENTIAL FLAW: data is null */
        data = null;

        dataGoodB2G = data;
        goodB2GSink();
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
