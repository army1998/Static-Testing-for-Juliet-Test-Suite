/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE81_XSS_Error_Message__Servlet_getParameter_Servlet_54c.java
Label Definition File: CWE81_XSS_Error_Message__Servlet.label.xml
Template File: sources-sink-54c.tmpl.java
*/
/*
 * @description
 * CWE: 81 Cross Site Scripting (XSS) in Error Message
 * BadSource: getParameter_Servlet Read data from a querystring using getParameter()
 * GoodSource: A hardcoded string
 * Sinks: sendErrorServlet
 *    BadSink : XSS in sendError
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */





import javax.servlet.http.*;

public class CWE81_XSS_Error_Message__Servlet_getParameter_Servlet_54c
{
    public void badSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE81_XSS_Error_Message__Servlet_getParameter_Servlet_54d()).badSink(data , request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE81_XSS_Error_Message__Servlet_getParameter_Servlet_54d()).goodG2BSink(data , request, response);
    }
}
