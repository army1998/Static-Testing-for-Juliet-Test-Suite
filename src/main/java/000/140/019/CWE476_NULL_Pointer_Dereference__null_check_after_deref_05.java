/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE476_NULL_Pointer_Dereference__null_check_after_deref_05.java
Label Definition File: CWE476_NULL_Pointer_Dereference.pointflaw.label.xml
Template File: point-flaw-05.tmpl.java
*/
/*
* @description
* CWE: 476 NULL Pointer Dereference
* Sinks: null_check_after_deref
*    GoodSink: Do not check for null after the object has been dereferenced
*    BadSink : Check for null after the object has already been dereferenced
* Flow Variant: 05 Control flow: if(privateTrue) and if(privateFalse)
*
* */





public class CWE476_NULL_Pointer_Dereference__null_check_after_deref_05 extends AbstractTestCase
{
    /* The two variables below are not defined as "final", but are never
     * assigned any other value, so a tool should be able to identify that
     * reads of these will always return their initialized values.
     */
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void bad() throws Throwable
    {
        if (privateTrue)
        {
            {
                String myString = null;
                myString = "Hello";
                IO.writeLine(myString.length());
                /* FLAW: Check for null after dereferencing the object. This null check is unnecessary. */
                if (myString != null)
                {
                    myString = "my, how I've changed";
                }
                IO.writeLine(myString.length());
            }
        }
    }

    /* good1() changes privateTrue to privateFalse */
    private void good1() throws Throwable
    {
        if (privateFalse)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            {
                String myString = null;
                myString = "Hello";

                IO.writeLine(myString.length());

                /* FIX: Don't check for null since we wouldn't reach this line if the object was null */
                myString = "my, how I've changed";

                IO.writeLine(myString.length());
            }

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2() throws Throwable
    {
        if (privateTrue)
        {
            {
                String myString = null;
                myString = "Hello";
                IO.writeLine(myString.length());
                /* FIX: Don't check for null since we wouldn't reach this line if the object was null */
                myString = "my, how I've changed";
                IO.writeLine(myString.length());
            }
        }
    }

    public void good() throws Throwable
    {
        good1();
        good2();
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
