/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE80_XSS__Servlet_File_53b.java
Label Definition File: CWE80_XSS__Servlet.label.xml
Template File: sources-sink-53b.tmpl.java
*/
/*
 * @description
 * CWE: 80 Cross Site Scripting (XSS)
 * BadSource: File Read data from file (named c:\data.txt)
 * GoodSource: A hardcoded string
 * Sinks:
 *    BadSink : Display of data in web page without any encoding or validation
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */




import javax.servlet.http.*;

public class CWE80_XSS__Servlet_File_53b
{
    public void badSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE80_XSS__Servlet_File_53c()).badSink(data , request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE80_XSS__Servlet_File_53c()).goodG2BSink(data , request, response);
    }
}
