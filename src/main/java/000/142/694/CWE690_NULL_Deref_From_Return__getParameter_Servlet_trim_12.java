/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE690_NULL_Deref_From_Return__getParameter_Servlet_trim_12.java
Label Definition File: CWE690_NULL_Deref_From_Return.label.xml
Template File: sources-sinks-12.tmpl.java
*/
/*
* @description
* CWE: 690 Unchecked return value is null, leading to a null pointer dereference.
* BadSource: getParameter_Servlet Set data to return of getParameter_Servlet
* GoodSource: Set data to fixed, non-null String
* Sinks: trim
*    GoodSink: Check data for null before calling trim()
*    BadSink : Call trim() on possibly null object
* Flow Variant: 12 Control flow: if(IO.staticReturnsTrueOrFalse())
*
* */





import javax.servlet.http.*;

public class CWE690_NULL_Deref_From_Return__getParameter_Servlet_trim_12 extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if(IO.staticReturnsTrueOrFalse())
        {
            /* POTENTIAL FLAW: data may be set to null */
            data = request.getParameter("CWE690");
        }
        else
        {

            /* FIX: Set data to a fixed, non-null String */
            data = "CWE690";

        }

        if(IO.staticReturnsTrueOrFalse())
        {
            /* POTENTIAL FLAW: data could be null */
            String stringTrimmed = data.trim();
            IO.writeLine(stringTrimmed);
        }
        else
        {

            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }

        }
    }

    /* goodG2B() - use goodsource and badsink by changing the first "if" so that
     * both branches use the GoodSource */
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if(IO.staticReturnsTrueOrFalse())
        {
            /* FIX: Set data to a fixed, non-null String */
            data = "CWE690";
        }
        else
        {

            /* FIX: Set data to a fixed, non-null String */
            data = "CWE690";

        }

        if(IO.staticReturnsTrueOrFalse())
        {
            /* POTENTIAL FLAW: data could be null */
            String stringTrimmed = data.trim();
            IO.writeLine(stringTrimmed);
        }
        else
        {

            /* POTENTIAL FLAW: data could be null */
            String stringTrimmed = data.trim();

            IO.writeLine(stringTrimmed);

        }
    }

    /* goodB2G() - use badsource and goodsink by changing the second "if" so that
     * both branches use the GoodSink */
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if(IO.staticReturnsTrueOrFalse())
        {
            /* POTENTIAL FLAW: data may be set to null */
            data = request.getParameter("CWE690");
        }
        else
        {

            /* POTENTIAL FLAW: data may be set to null */
            data = request.getParameter("CWE690");

        }

        if(IO.staticReturnsTrueOrFalse())
        {
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
        }
        else
        {

            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }

        }
    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        goodG2B(request, response);
        goodB2G(request, response);
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
