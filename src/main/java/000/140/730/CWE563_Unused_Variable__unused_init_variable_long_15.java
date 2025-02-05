/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE563_Unused_Variable__unused_init_variable_long_15.java
Label Definition File: CWE563_Unused_Variable__unused_init_variable.label.xml
Template File: source-sinks-15.tmpl.java
*/
/*
* @description
* CWE: 563 Unused Variable
* BadSource:  Initialize data
* Sinks:
*    GoodSink: Use data
*    BadSink : do nothing
* Flow Variant: 15 Control flow: switch(7)
*
* */





public class CWE563_Unused_Variable__unused_init_variable_long_15 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        long data;

        /* POTENTIAL FLAW: Initialize, but do not use data */

        data = 5L;

        switch (7)
        {
        case 7:
            /* FLAW: Do not use the variable */
            /* do nothing */
            ; /* empty statement needed for some flow variants */
            break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
        }
    }

    /* goodB2G1() - use badsource and goodsink by changing the  switch to switch(8) */
    private void goodB2G1() throws Throwable
    {
        long data;

        /* POTENTIAL FLAW: Initialize, but do not use data */

        data = 5L;

        switch (8)
        {
        case 7:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
        default:
            /* FIX: Use data */
            IO.writeLine("" + data);
            break;
        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing the blocks in the switch  */
    private void goodB2G2() throws Throwable
    {
        long data;

        /* POTENTIAL FLAW: Initialize, but do not use data */

        data = 5L;

        switch (7)
        {
        case 7:
            /* FIX: Use data */
            IO.writeLine("" + data);
            break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
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
