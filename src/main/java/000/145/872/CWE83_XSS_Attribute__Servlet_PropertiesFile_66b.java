/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE83_XSS_Attribute__Servlet_PropertiesFile_66b.java
Label Definition File: CWE83_XSS_Attribute__Servlet.label.xml
Template File: sources-sink-66b.tmpl.java
*/
/*
 * @description
 * CWE: 83 Cross Site Scripting (XSS) in attributes; Examples(replace QUOTE with an actual double quote): ?img_loc=http://www.google.comQUOTE%20onerror=QUOTEalert(1) and ?img_loc=http://www.google.comQUOTE%20onerror=QUOTEjavascript:alert(1)
 * BadSource: PropertiesFile Read data from a .properties file (in property named data)
 * GoodSource: A hardcoded string
 * Sinks: printlnServlet
 *    BadSink : XSS in img src attribute
 * Flow Variant: 66 Data flow: data passed in an array from one method to another in different source files in the same package
 *
 * */





import javax.servlet.http.*;

public class CWE83_XSS_Attribute__Servlet_PropertiesFile_66b
{
    public void badSink(String dataArray[] , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataArray[2];

        if (data != null)
        {
            /* POTENTIAL FLAW: Input is not verified/sanitized before use in an image tag */
            response.getWriter().println("<br>bad() - <img src=\"" + data + "\">");
        }

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String dataArray[] , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataArray[2];

        if (data != null)
        {
            /* POTENTIAL FLAW: Input is not verified/sanitized before use in an image tag */
            response.getWriter().println("<br>bad() - <img src=\"" + data + "\">");
        }

    }
}
