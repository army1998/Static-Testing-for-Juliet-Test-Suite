/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE80_XSS__Servlet_getQueryString_Servlet_68b.java
Label Definition File: CWE80_XSS__Servlet.label.xml
Template File: sources-sink-68b.tmpl.java
*/
/*
 * @description
 * CWE: 80 Cross Site Scripting (XSS)
 * BadSource: getQueryString_Servlet Parse id param out of the URL query string (without using getParameter())
 * GoodSource: A hardcoded string
 * BadSink:  Display of data in web page without any encoding or validation
 * Flow Variant: 68 Data flow: data passed as a member variable in the "a" class, which is used by a method in another class in the same package
 *
 * */




import javax.servlet.http.*;

public class CWE80_XSS__Servlet_getQueryString_Servlet_68b
{
    public void badSink(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = CWE80_XSS__Servlet_getQueryString_Servlet_68a.data;

        if (data != null)
        {
            /* POTENTIAL FLAW: Display of data in web page without any encoding or validation */
            response.getWriter().println("<br>bad(): data = " + data);
        }

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = CWE80_XSS__Servlet_getQueryString_Servlet_68a.data;

        if (data != null)
        {
            /* POTENTIAL FLAW: Display of data in web page without any encoding or validation */
            response.getWriter().println("<br>bad(): data = " + data);
        }

    }
}
