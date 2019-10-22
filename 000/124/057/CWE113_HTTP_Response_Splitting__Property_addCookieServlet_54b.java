/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE113_HTTP_Response_Splitting__Property_addCookieServlet_54b.java
Label Definition File: CWE113_HTTP_Response_Splitting.label.xml
Template File: sources-sinks-54b.tmpl.java
*/
/*
 * @description
 * CWE: 113 HTTP Response Splitting
 * BadSource: Property Read data from a system property
 * GoodSource: A hardcoded string
 * Sinks: addCookieServlet
 *    GoodSink: URLEncode input
 *    BadSink : querystring to addCookie()
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */




import javax.servlet.http.*;

public class CWE113_HTTP_Response_Splitting__Property_addCookieServlet_54b
{
    public void badSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE113_HTTP_Response_Splitting__Property_addCookieServlet_54c()).badSink(data , request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE113_HTTP_Response_Splitting__Property_addCookieServlet_54c()).goodG2BSink(data , request, response);
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE113_HTTP_Response_Splitting__Property_addCookieServlet_54c()).goodB2GSink(data , request, response);
    }
}
