/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE563_Unused_Variable__unused_value_StringBuilder_01.java
Label Definition File: CWE563_Unused_Variable__unused_value.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 563 Unused Variable
* BadSource:  Initialize data
* GoodSource: Initialize and use data
* Sinks:
*    GoodSink: Use data
*    BadSink : re-initialize and use data
* Flow Variant: 01 Baseline
*
* */





public class CWE563_Unused_Variable__unused_value_StringBuilder_01 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        StringBuilder data;

        /* POTENTIAL FLAW: Initialize, but do not use data */

        data = new StringBuilder("Good");

        /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */

        data = new StringBuilder("Reinitialize");

        IO.writeLine(data.toString());

    }

    public void good() throws Throwable
    {
        goodG2B();
        goodB2G();
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
    {
        StringBuilder data;

        /* FIX: Initialize and use data before it is overwritten */

        data = new StringBuilder("Good");

        IO.writeLine(data.toString());

        /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */

        data = new StringBuilder("Reinitialize");

        IO.writeLine(data.toString());

    }

    /* goodB2G() - use badsource and goodsink */
    private void goodB2G() throws Throwable
    {
        StringBuilder data;

        /* POTENTIAL FLAW: Initialize, but do not use data */

        data = new StringBuilder("Good");

        /* FIX: Use data without over-writing its value */

        IO.writeLine(data.toString());

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

