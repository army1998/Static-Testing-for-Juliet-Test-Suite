/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE80_XSS__Servlet_URLConnection_51b.java
Label Definition File: CWE80_XSS__Servlet.label.xml
Template File: sources-sink-51b.tmpl.java
*/
/*
 * @description
 * CWE: 80 Cross Site Scripting (XSS)
 * BadSource: URLConnection Read data from a web server with URLConnection
 * GoodSource: A hardcoded string
 * BadSink:  Display of data in web page without any encoding or validation
 * Flow Variant: 51 Data flow: data passed as an argument from one function to another in different classes in the same package
 *
 * */




import javax.servlet.http.*;

public class CWE80_XSS__Servlet_URLConnection_51b
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
