/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE129_Improper_Validation_of_Array_Index__getParameter_Servlet_array_size_07.java
Label Definition File: CWE129_Improper_Validation_of_Array_Index.label.xml
Template File: sources-sinks-07.tmpl.java
*/
/*
* @description
* CWE: 129 Improper Validation of Array Index
* BadSource: getParameter_Servlet Read data from a querystring using getParameter()
* GoodSource: A hardcoded non-zero, non-min, non-max, even number
* Sinks: array_size
*    GoodSink: data is used to set the size of the array and it must be greater than 0
*    BadSink : data is used to set the size of the array, but it could be set to 0
* Flow Variant: 07 Control flow: if(privateFive==5) and if(privateFive!=5)
*
* */




import javax.servlet.http.*;


import java.util.logging.Level;

public class CWE129_Improper_Validation_of_Array_Index__getParameter_Servlet_array_size_07 extends AbstractTestCaseServlet
{
    /* The variable below is not declared "final", but is never assigned
     * any other value so a tool should be able to identify that reads of
     * this will always give its initialized value. */
    private int privateFive = 5;

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;
        if (privateFive==5)
        {
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
        }
        else
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = 0;
        }

        if (privateFive==5)
        {
            int array[] = null;
            /* POTENTIAL FLAW: Verify that data is non-negative, but still allow it to be 0 */
            if (data >= 0)
            {
                array = new int[data];
            }
            else
            {
                IO.writeLine("Array size is negative");
            }
            /* do something with the array */
            array[0] = 5;
            IO.writeLine(array[0]);
        }
    }

    /* goodG2B1() - use goodsource and badsink by changing first privateFive==5 to privateFive!=5 */
    private void goodG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;
        if (privateFive!=5)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = 0;
        }
        else
        {

            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;

        }

        if (privateFive==5)
        {
            int array[] = null;
            /* POTENTIAL FLAW: Verify that data is non-negative, but still allow it to be 0 */
            if (data >= 0)
            {
                array = new int[data];
            }
            else
            {
                IO.writeLine("Array size is negative");
            }
            /* do something with the array */
            array[0] = 5;
            IO.writeLine(array[0]);
        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in first if */
    private void goodG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;
        if (privateFive==5)
        {
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
        }
        else
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = 0;
        }

        if (privateFive==5)
        {
            int array[] = null;
            /* POTENTIAL FLAW: Verify that data is non-negative, but still allow it to be 0 */
            if (data >= 0)
            {
                array = new int[data];
            }
            else
            {
                IO.writeLine("Array size is negative");
            }
            /* do something with the array */
            array[0] = 5;
            IO.writeLine(array[0]);
        }
    }

    /* goodB2G1() - use badsource and goodsink by changing second privateFive==5 to privateFive!=5 */
    private void goodB2G1(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;
        if (privateFive==5)
        {
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
        }
        else
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = 0;
        }

        if (privateFive!=5)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
            int array[] = null;

            /* FIX: Verify that data is non-negative AND greater than 0 */
            if (data > 0)
            {
                array = new int[data];
            }
            else
            {
                IO.writeLine("Array size is negative");
            }

            /* do something with the array */
            array[0] = 5;
            IO.writeLine(array[0]);

        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in second if  */
    private void goodB2G2(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;
        if (privateFive==5)
        {
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
        }
        else
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = 0;
        }

        if (privateFive==5)
        {
            /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
            int array[] = null;
            /* FIX: Verify that data is non-negative AND greater than 0 */
            if (data > 0)
            {
                array = new int[data];
            }
            else
            {
                IO.writeLine("Array size is negative");
            }
            /* do something with the array */
            array[0] = 5;
            IO.writeLine(array[0]);
        }
    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        goodG2B1(request, response);
        goodG2B2(request, response);
        goodB2G1(request, response);
        goodB2G2(request, response);
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
