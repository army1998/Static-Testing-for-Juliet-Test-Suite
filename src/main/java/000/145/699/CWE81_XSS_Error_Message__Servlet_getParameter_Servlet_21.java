/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE81_XSS_Error_Message__Servlet_getParameter_Servlet_21.java
Label Definition File: CWE81_XSS_Error_Message__Servlet.label.xml
Template File: sources-sink-21.tmpl.java
*/
/*
 * @description
 * CWE: 81 Cross Site Scripting (XSS) in Error Message
 * BadSource: getParameter_Servlet Read data from a querystring using getParameter()
 * GoodSource: A hardcoded string
 * Sinks: sendErrorServlet
 *    BadSink : XSS in sendError
 * Flow Variant: 21 Control flow: Flow controlled by value of a private variable. All functions contained in one file.
 *
 * */





import javax.servlet.http.*;


public class CWE81_XSS_Error_Message__Servlet_getParameter_Servlet_21 extends AbstractTestCaseServlet
{
    /* The variable below is used to drive control flow in the source function */
    private boolean badPrivate = false;

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        badPrivate = true;
        data = bad_source(request, response);

        if (data != null)
        {
            /* POTENTIAL FLAW: script code (e.g. id=<script>alert('xss')</script>) is sent to the client;
            * The built-in J2EE server automatically does some HTML entity encoding.
            * Therefore, to test this, change response.sendError to response.getWriter().println and remove the 404,
            */
            response.sendError(404, "<br>bad() - Parameter name has value " + data);
        }

    }

    private String bad_source(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        if (badPrivate)
        {
            /* POTENTIAL FLAW: Read data from a querystring using getParameter */
            data = request.getParameter("name");
        }
        else
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null;
        }

        return data;
    }

    /* The variables below are used to drive control flow in the source functions. */
    private boolean goodG2B1_private = false;
    private boolean goodG2B2_private = false;

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        goodG2B1(request, response);
        goodG2B2(request, response);
    }

    /* goodG2B1() - use goodsource and badsink by setting the variable to false instead of true */
    private void goodG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        goodG2B1_private = false;
        data = goodG2B1_source(request, response);

        if (data != null)
        {
            /* POTENTIAL FLAW: script code (e.g. id=<script>alert('xss')</script>) is sent to the client;
            * The built-in J2EE server automatically does some HTML entity encoding.
            * Therefore, to test this, change response.sendError to response.getWriter().println and remove the 404,
            */
            response.sendError(404, "<br>bad() - Parameter name has value " + data);
        }

    }

    private String goodG2B1_source(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = null;

        if (goodG2B1_private)
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

        return data;
    }

    /* goodG2B2() - use goodsource and badsink by reversing the blocks in the if in the sink function */
    private void goodG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        goodG2B2_private = true;
        data = goodG2B2_source(request, response);

        if (data != null)
        {
            /* POTENTIAL FLAW: script code (e.g. id=<script>alert('xss')</script>) is sent to the client;
            * The built-in J2EE server automatically does some HTML entity encoding.
            * Therefore, to test this, change response.sendError to response.getWriter().println and remove the 404,
            */
            response.sendError(404, "<br>bad() - Parameter name has value " + data);
        }

    }

    private String goodG2B2_source(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = null;

        if (goodG2B2_private)
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

        return data;
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
