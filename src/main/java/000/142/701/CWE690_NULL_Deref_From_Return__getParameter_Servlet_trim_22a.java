/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE690_NULL_Deref_From_Return__getParameter_Servlet_trim_22a.java
Label Definition File: CWE690_NULL_Deref_From_Return.label.xml
Template File: sources-sinks-22a.tmpl.java
*/
/*
 * @description
 * CWE: 690 Unchecked return value is null, leading to a null pointer dereference.
 * BadSource: getParameter_Servlet Set data to return of getParameter_Servlet
 * GoodSource: Set data to fixed, non-null String
 * Sinks: trim
 *    GoodSink: Check data for null before calling trim()
 *    BadSink : Call trim() on possibly null object
 * Flow Variant: 22 Control flow: Flow controlled by value of a public static variable. Sink functions are in a separate file from sources.
 *
 * */





import javax.servlet.http.*;

public class CWE690_NULL_Deref_From_Return__getParameter_Servlet_trim_22a extends AbstractTestCaseServlet
{
    /* The public static variable below is used to drive control flow in the sink function.
     * The public static variable mimics a global variable in the C/C++ language family. */
    public static boolean badPublicStatic = false;

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = null;

        /* POTENTIAL FLAW: data may be set to null */
        data = request.getParameter("CWE690");

        badPublicStatic = true;
        (new CWE690_NULL_Deref_From_Return__getParameter_Servlet_trim_22b()).badSink(data , request, response);
    }

    /* The public static variables below are used to drive control flow in the sink functions.
     * The public static variable mimics a global variable in the C/C++ language family. */
    public static boolean goodB2G1PublicStatic = false;
    public static boolean goodB2G2PublicStatic = false;
    public static boolean goodG2BPublicStatic = false;

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        goodB2G1(request, response);
        goodB2G2(request, response);
        goodG2B(request, response);
    }

    /* goodB2G1() - use badsource and goodsink by setting the static variable to false instead of true */
    private void goodB2G1(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = null;

        /* POTENTIAL FLAW: data may be set to null */
        data = request.getParameter("CWE690");

        goodB2G1PublicStatic = false;
        (new CWE690_NULL_Deref_From_Return__getParameter_Servlet_trim_22b()).goodB2G1Sink(data , request, response);
    }

    /* goodB2G2() - use badsource and goodsink by reversing the blocks in the if in the sink function */
    private void goodB2G2(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = null;

        /* POTENTIAL FLAW: data may be set to null */
        data = request.getParameter("CWE690");

        goodB2G2PublicStatic = true;
        (new CWE690_NULL_Deref_From_Return__getParameter_Servlet_trim_22b()).goodB2G2Sink(data , request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = null;

        /* FIX: Set data to a fixed, non-null String */
        data = "CWE690";

        goodG2BPublicStatic = true;
        (new CWE690_NULL_Deref_From_Return__getParameter_Servlet_trim_22b()).goodG2BSink(data , request, response);
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
