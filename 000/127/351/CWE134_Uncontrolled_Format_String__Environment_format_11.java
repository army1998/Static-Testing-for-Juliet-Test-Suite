/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE134_Uncontrolled_Format_String__Environment_format_11.java
Label Definition File: CWE134_Uncontrolled_Format_String.label.xml
Template File: sources-sinks-11.tmpl.java
*/
/*
* @description
* CWE: 134 Uncontrolled Format String
* BadSource: Environment Read data from an environment variable
* GoodSource: A hardcoded string
* Sinks: format
*    GoodSink: dynamic formatted stdout with string defined
*    BadSink : dynamic formatted stdout without validation
* Flow Variant: 11 Control flow: if(IO.staticReturnsTrue()) and if(IO.staticReturnsFalse())
*
* */




public class CWE134_Uncontrolled_Format_String__Environment_format_11 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        String data;
        if (IO.staticReturnsTrue())
        {
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
        }
        else
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
        }

        if(IO.staticReturnsTrue())
        {
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
        }
    }

    /* goodG2B1() - use goodsource and badsink by changing first IO.staticReturnsTrue() to IO.staticReturnsFalse() */
    private void goodG2B1() throws Throwable
    {
        String data;
        if (IO.staticReturnsFalse())
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
        }
        else
        {

            /* FIX: Use a hardcoded string */
            data = "foo";

        }

        if (IO.staticReturnsTrue())
        {
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in first if */
    private void goodG2B2() throws Throwable
    {
        String data;

        if (IO.staticReturnsTrue())
        {
            /* FIX: Use a hardcoded string */
            data = "foo";
        }
        else
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
        }

        if (IO.staticReturnsTrue())
        {
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
        }
    }

    /* goodB2G1() - use badsource and goodsink by changing second IO.staticReturnsTrue() to IO.staticReturnsFalse() */
    private void goodB2G1() throws Throwable
    {
        String data;
        if (IO.staticReturnsTrue())
        {
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
        }
        else
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
        }

        if (IO.staticReturnsFalse())
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            if (data != null)
            {
                /* FIX: explicitly defined string formatting */
                System.out.format("%s%n", data);
            }

        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in second if  */
    private void goodB2G2() throws Throwable
    {
        String data;
        if (IO.staticReturnsTrue())
        {
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
        }
        else
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
        }

        if (IO.staticReturnsTrue())
        {
            if (data != null)
            {
                /* FIX: explicitly defined string formatting */
                System.out.format("%s%n", data);
            }
        }
    }

    public void good() throws Throwable
    {
        goodG2B1();
        goodG2B2();
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
