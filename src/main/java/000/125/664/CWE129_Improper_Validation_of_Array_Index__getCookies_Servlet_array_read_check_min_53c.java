/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE129_Improper_Validation_of_Array_Index__getCookies_Servlet_array_read_check_min_53c.java
Label Definition File: CWE129_Improper_Validation_of_Array_Index.label.xml
Template File: sources-sinks-53c.tmpl.java
*/
/*
 * @description
 * CWE: 129 Improper Validation of Array Index
 * BadSource: getCookies_Servlet Read data from the first cookie using getCookies()
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: array_read_check_min
 *    GoodSink: Read from array after verifying that data is at least 0 and less than array.length
 *    BadSink : Read from array after verifying that data is at least 0 (but not verifying that data less than array.length)
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */




import javax.servlet.http.*;

public class CWE129_Improper_Validation_of_Array_Index__getCookies_Servlet_array_read_check_min_53c
{
    public void badSink(int data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE129_Improper_Validation_of_Array_Index__getCookies_Servlet_array_read_check_min_53d()).badSink(data , request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE129_Improper_Validation_of_Array_Index__getCookies_Servlet_array_read_check_min_53d()).goodG2BSink(data , request, response);
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(int data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE129_Improper_Validation_of_Array_Index__getCookies_Servlet_array_read_check_min_53d()).goodB2GSink(data , request, response);
    }
}
