/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE563_Unused_Variable__unused_uninit_variable_StringBuilder_02.java
Label Definition File: CWE563_Unused_Variable__unused_uninit_variable.label.xml
Template File: source-sinks-02.tmpl.java
*/
/*
* @description
* CWE: 563 Unused Variable
* BadSource:  don't initialize data
* Sinks:
*    GoodSink: init and use data
*    BadSink : do nothing
* Flow Variant: 02 Control flow: if(true) and if(false)
*
* */





public class CWE563_Unused_Variable__unused_uninit_variable_StringBuilder_02 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        StringBuilder data;

        /* POTENTIAL FLAW: Don't initialize or use data */
        ; /* empty statement needed for some flow variants */

        if (true)
        {
            /* FLAW: Don't initialize or use data */
            /* do nothing */
            ; /* empty statement needed for some flow variants */
        }
    }

    /* goodB2G1() - use badsource and goodsink by changing true to false */
    private void goodB2G1() throws Throwable
    {
        StringBuilder data;

        /* POTENTIAL FLAW: Don't initialize or use data */
        ; /* empty statement needed for some flow variants */

        if (false)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            /* FIX: Initialize then use data */

            data = new StringBuilder("Good");

            IO.writeLine(data.toString());

        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in if  */
    private void goodB2G2() throws Throwable
    {
        StringBuilder data;

        /* POTENTIAL FLAW: Don't initialize or use data */
        ; /* empty statement needed for some flow variants */

        if (true)
        {
            /* FIX: Initialize then use data */
            data = new StringBuilder("Good");
            IO.writeLine(data.toString());
        }
    }

    public void good() throws Throwable
    {
        goodB2G1();
        goodB2G2();
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
