/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE526_Info_Exposure_Environment_Variables__Servlet_04.java
Label Definition File: CWE526_Info_Exposure_Environment_Variables.label.xml
Template File: point-flaw-04.tmpl.java
*/
/*
* @description
* CWE: 526 Information Exposure Through Environment Variables
* Sinks: Servlet
*    GoodSink: no exposing
*    BadSink : expose the path variable to the user
* Flow Variant: 04 Control flow: if(PRIVATE_STATIC_FINAL_TRUE) and if(PRIVATE_STATIC_FINAL_FALSE)
*
* */





import javax.servlet.http.*;

public class CWE526_Info_Exposure_Environment_Variables__Servlet_04 extends AbstractTestCaseServlet
{
    /* The two variables below are declared "final", so a tool should
     * be able to identify that reads of these will always return their
     * initialized values.
     */
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            /* FLAW: environment variable exposed */
            response.getWriter().println("Not in path: " + System.getenv("PATH"));
        }
    }

    /* good1() changes PRIVATE_STATIC_FINAL_TRUE to PRIVATE_STATIC_FINAL_FALSE */
    private void good1(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            /* FIX: error message is general */
            response.getWriter().println("Not in path");

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            /* FIX: error message is general */
            response.getWriter().println("Not in path");
        }
    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        good1(request, response);
        good2(request, response);
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
