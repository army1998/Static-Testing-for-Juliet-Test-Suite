/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE80_XSS__Servlet_connect_tcp_54e.java
Label Definition File: CWE80_XSS__Servlet.label.xml
Template File: sources-sink-54e.tmpl.java
*/
/*
 * @description
 * CWE: 80 Cross Site Scripting (XSS)
 * BadSource: connect_tcp Read data using an outbound tcp connection
 * GoodSource: A hardcoded string
 * Sinks:
 *    BadSink : Display of data in web page without any encoding or validation
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */




import javax.servlet.http.*;

public class CWE80_XSS__Servlet_connect_tcp_54e
{
    public void badSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        if (data != null)
        {
            /* POTENTIAL FLAW: Display of data in web page without any encoding or validation */
            response.getWriter().println("<br>bad(): data = " + data);
        }

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        if (data != null)
        {
            /* POTENTIAL FLAW: Display of data in web page without any encoding or validation */
            response.getWriter().println("<br>bad(): data = " + data);
        }

    }
}
