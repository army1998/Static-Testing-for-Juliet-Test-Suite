/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE36_Absolute_Path_Traversal__getCookies_Servlet_67a.java
Label Definition File: CWE36_Absolute_Path_Traversal.label.xml
Template File: sources-sink-67a.tmpl.java
*/
/*
 * @description
 * CWE: 36 Absolute Path Traversal
 * BadSource: getCookies_Servlet Read data from the first cookie using getCookies()
 * GoodSource: A hardcoded string
 * Sinks: readFile
 *    BadSink : read line from file from disk
 * Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
 *
 * */





import java.io.*;
import javax.servlet.http.*;


public class CWE36_Absolute_Path_Traversal__getCookies_Servlet_67a extends AbstractTestCaseServlet
{
    static class Container
    {
        public String containerOne;
    }

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
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

        Container dataContainer = new Container();
        dataContainer.containerOne = data;
        (new CWE36_Absolute_Path_Traversal__getCookies_Servlet_67b()).badSink(dataContainer , request, response );
    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        goodG2B(request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        /* FIX: Use a hardcoded string */
        data = "foo";

        Container dataContainer = new Container();
        dataContainer.containerOne = data;
        (new CWE36_Absolute_Path_Traversal__getCookies_Servlet_67b()).goodG2BSink(dataContainer , request, response );
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
