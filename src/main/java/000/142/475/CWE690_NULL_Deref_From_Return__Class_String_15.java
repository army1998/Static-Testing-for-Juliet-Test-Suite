/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE690_NULL_Deref_From_Return__Class_String_15.java
Label Definition File: CWE690_NULL_Deref_From_Return__Class.label.xml
Template File: sources-sinks-15.tmpl.java
*/
/*
* @description
* CWE: 690 Unchecked return value is null, leading to a null pointer dereference.
* BadSource:  Use a custom method which may return null
* GoodSource: Use a custom method that never returns null
* Sinks: trim
*    GoodSink: Check data for null before calling trim()
*    BadSink : Call trim() on possibly null object
* Flow Variant: 15 Control flow: switch(6) and switch(7)
*
* */





public class CWE690_NULL_Deref_From_Return__Class_String_15 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        String data;

        switch (6)
        {
        case 6:
            /* POTENTIAL FLAW: Call getStringBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBad();
            break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
            break;
        }

        switch (7)
        {
        case 7:
            /* POTENTIAL FLAW: data could be null */
            String stringTrimmed = data.trim();
            IO.writeLine(stringTrimmed);
            break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
        }
    }

    /* goodG2B1() - use goodsource and badsink by changing the first switch to switch(5) */
    private void goodG2B1() throws Throwable
    {
        String data;

        switch (5)
        {
        case 6:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
            break;
        default:
            /* FIX: call getStringGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringGood();
            break;
        }

        switch (7)
        {
        case 7:
            /* POTENTIAL FLAW: data could be null */
            String stringTrimmed = data.trim();
            IO.writeLine(stringTrimmed);
            break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing the blocks in the first switch  */
    private void goodG2B2() throws Throwable
    {
        String data;

        switch (6)
        {
        case 6:
            /* FIX: call getStringGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringGood();
            break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
            break;
        }

        switch (7)
        {
        case 7:
            /* POTENTIAL FLAW: data could be null */
            String stringTrimmed = data.trim();
            IO.writeLine(stringTrimmed);
            break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
        }
    }

    /* goodB2G1() - use badsource and goodsink by changing the second switch to switch(8) */
    private void goodB2G1() throws Throwable
    {
        String data;

        switch (6)
        {
        case 6:
            /* POTENTIAL FLAW: Call getStringBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBad();
            break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
            break;
        }

        switch (8)
        {
        case 7:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
        default:
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
            break;
        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing the blocks in the second switch  */
    private void goodB2G2() throws Throwable
    {
        String data;

        switch (6)
        {
        case 6:
            /* POTENTIAL FLAW: Call getStringBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBad();
            break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
            break;
        }

        switch (7)
        {
        case 7:
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
            break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
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
