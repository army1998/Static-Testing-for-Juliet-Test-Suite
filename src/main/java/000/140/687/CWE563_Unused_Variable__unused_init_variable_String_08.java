/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE563_Unused_Variable__unused_init_variable_String_08.java
Label Definition File: CWE563_Unused_Variable__unused_init_variable.label.xml
Template File: source-sinks-08.tmpl.java
*/
/*
* @description
* CWE: 563 Unused Variable
* BadSource:  Initialize data
* Sinks:
*    GoodSink: Use data
*    BadSink : do nothing
* Flow Variant: 08 Control flow: if(privateReturnsTrue()) and if(privateReturnsFalse())
*
* */





public class CWE563_Unused_Variable__unused_init_variable_String_08 extends AbstractTestCase
{
    /* The methods below always return the same value, so a tool
     * should be able to figure out that every call to these
     * methods will return true or return false.
     */
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void bad() throws Throwable
    {
        String data;

        /* POTENTIAL FLAW: Initialize, but do not use data */

        data = "Good";

        if (privateReturnsTrue())
        {
            /* FLAW: Do not use the variable */
            /* do nothing */
            ; /* empty statement needed for some flow variants */
        }
    }

    /* goodB2G1() - use badsource and goodsink by changing privateReturnsTrue() to privateReturnsFalse() */
    private void goodB2G1() throws Throwable
    {
        String data;

        /* POTENTIAL FLAW: Initialize, but do not use data */

        data = "Good";

        if (privateReturnsFalse())
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            /* FIX: Use data */

            IO.writeLine(data);

        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in if  */
    private void goodB2G2() throws Throwable
    {
        String data;

        /* POTENTIAL FLAW: Initialize, but do not use data */

        data = "Good";

        if (privateReturnsTrue())
        {
            /* FIX: Use data */
            IO.writeLine(data);
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
