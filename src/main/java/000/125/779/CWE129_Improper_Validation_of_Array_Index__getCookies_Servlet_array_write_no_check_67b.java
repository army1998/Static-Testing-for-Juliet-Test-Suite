/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE129_Improper_Validation_of_Array_Index__getCookies_Servlet_array_write_no_check_67b.java
Label Definition File: CWE129_Improper_Validation_of_Array_Index.label.xml
Template File: sources-sinks-67b.tmpl.java
*/
/*
 * @description
 * CWE: 129 Improper Validation of Array Index
 * BadSource: getCookies_Servlet Read data from the first cookie using getCookies()
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: array_write_no_check
 *    GoodSink: Write to array after verifying index
 *    BadSink : Write to array without any verification of index
 * Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
 *
 * */




import javax.servlet.http.*;

public class CWE129_Improper_Validation_of_Array_Index__getCookies_Servlet_array_write_no_check_67b
{
    public void badSink(CWE129_Improper_Validation_of_Array_Index__getCookies_Servlet_array_write_no_check_67a.Container dataContainer , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data = dataContainer.containerOne;

        /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
        int array[] = { 0, 1, 2, 3, 4 };

        /* POTENTIAL FLAW: Attempt to write to array at location data, which may be outside the array bounds */
        array[data] = 42;

        /* Skip reading back data from array since that may be another out of bounds operation */

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(CWE129_Improper_Validation_of_Array_Index__getCookies_Servlet_array_write_no_check_67a.Container dataContainer , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data = dataContainer.containerOne;

        /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
        int array[] = { 0, 1, 2, 3, 4 };

        /* POTENTIAL FLAW: Attempt to write to array at location data, which may be outside the array bounds */
        array[data] = 42;

        /* Skip reading back data from array since that may be another out of bounds operation */

    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(CWE129_Improper_Validation_of_Array_Index__getCookies_Servlet_array_write_no_check_67a.Container dataContainer , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data = dataContainer.containerOne;

        /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
        int array[] = { 0, 1, 2, 3, 4 };

        /* FIX: Verify index before writing to array at location data */
        if (data >= 0 && data < array.length)
        {
            array[data] = 42;
        }
        else
        {
            IO.writeLine("Array index out of bounds");
        }

    }
}
