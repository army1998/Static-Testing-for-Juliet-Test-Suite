/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE83_XSS_Attribute__Servlet_getCookies_Servlet_31.java
Label Definition File: CWE83_XSS_Attribute__Servlet.label.xml
Template File: sources-sink-31.tmpl.java
*/
/*
 * @description
 * CWE: 83 Cross Site Scripting (XSS) in attributes; Examples(replace QUOTE with an actual double quote): ?img_loc=http://www.google.comQUOTE%20onerror=QUOTEalert(1) and ?img_loc=http://www.google.comQUOTE%20onerror=QUOTEjavascript:alert(1)
 * BadSource: getCookies_Servlet Read data from the first cookie using getCookies()
 * GoodSource: A hardcoded string
 * Sinks: printlnServlet
 *    BadSink : XSS in img src attribute
 * Flow Variant: 31 Data flow: make a copy of data within the same method
 *
 * */





import javax.servlet.http.*;


public class CWE83_XSS_Attribute__Servlet_getCookies_Servlet_31 extends AbstractTestCaseServlet
{
    /* uses badsource and badsink */
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String dataCopy;
        {
            String data;

            data = ""; /* initialize data in case there are no cookies */

            /* Read data from cookies */
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null)
                {
                    /* POTENTIAL FLAW: Read data from the first cookie value */
                    data = cookieSources[0].getValue();
                }
            }

            dataCopy = data;
        }
        {
            String data = dataCopy;

            if (data != null)
            {
                /* POTENTIAL FLAW: Input is not verified/sanitized before use in an image tag */
                response.getWriter().println("<br>bad() - <img src=\"" + data + "\">");
            }

        }
    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        goodG2B(request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String dataCopy;
        {
            String data;

            /* FIX: Use a hardcoded string */
            data = "foo";

            dataCopy = data;
        }
        {
            String data = dataCopy;

            if (data != null)
            {
                /* POTENTIAL FLAW: Input is not verified/sanitized before use in an image tag */
                response.getWriter().println("<br>bad() - <img src=\"" + data + "\">");
            }

        }
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
