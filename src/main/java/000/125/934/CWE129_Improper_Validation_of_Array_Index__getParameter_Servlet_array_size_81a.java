/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE129_Improper_Validation_of_Array_Index__getParameter_Servlet_array_size_81a.java
Label Definition File: CWE129_Improper_Validation_of_Array_Index.label.xml
Template File: sources-sinks-81a.tmpl.java
*/
/*
 * @description
 * CWE: 129 Improper Validation of Array Index
 * BadSource: getParameter_Servlet Read data from a querystring using getParameter()
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: array_size
 *    GoodSink: data is used to set the size of the array and it must be greater than 0
 *    BadSink : data is used to set the size of the array, but it could be set to 0
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */




import javax.servlet.http.*;


import java.util.logging.Level;

public class CWE129_Improper_Validation_of_Array_Index__getParameter_Servlet_array_size_81a extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;

        data = Integer.MIN_VALUE; /* Initialize data */

        /* POTENTIAL FLAW: Read data from a querystring using getParameter() */
        {
            String stringNumber = request.getParameter("name");

            try
            {
                data = Integer.parseInt(stringNumber.trim());
            }
            catch(NumberFormatException exceptNumberFormat)
            {
                IO.logger.log(Level.WARNING, "Number format exception reading data from parameter 'name'", exceptNumberFormat);
            }
        }

        CWE129_Improper_Validation_of_Array_Index__getParameter_Servlet_array_size_81_base baseObject = new CWE129_Improper_Validation_of_Array_Index__getParameter_Servlet_array_size_81_bad();
        baseObject.action(data , request, response);
    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        goodG2B(request, response);
        goodB2G(request, response);
    }

    /* goodG2B() - use GoodSource and BadSink */
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2;

        CWE129_Improper_Validation_of_Array_Index__getParameter_Servlet_array_size_81_base baseObject = new CWE129_Improper_Validation_of_Array_Index__getParameter_Servlet_array_size_81_goodG2B();
        baseObject.action(data , request, response);
    }

    /* goodB2G() - use BadSource and GoodSink */
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;

        data = Integer.MIN_VALUE; /* Initialize data */

        /* POTENTIAL FLAW: Read data from a querystring using getParameter() */
        {
            String stringNumber = request.getParameter("name");

            try
            {
                data = Integer.parseInt(stringNumber.trim());
            }
            catch(NumberFormatException exceptNumberFormat)
            {
                IO.logger.log(Level.WARNING, "Number format exception reading data from parameter 'name'", exceptNumberFormat);
            }
        }

        CWE129_Improper_Validation_of_Array_Index__getParameter_Servlet_array_size_81_base baseObject = new CWE129_Improper_Validation_of_Array_Index__getParameter_Servlet_array_size_81_goodB2G();
        baseObject.action(data , request, response);
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
