/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE129_Improper_Validation_of_Array_Index__Property_array_size_31.java
Label Definition File: CWE129_Improper_Validation_of_Array_Index.label.xml
Template File: sources-sinks-31.tmpl.java
*/
/*
 * @description
 * CWE: 129 Improper Validation of Array Index
 * BadSource: Property Read data from a system property
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: array_size
 *    GoodSink: data is used to set the size of the array and it must be greater than 0
 *    BadSink : data is used to set the size of the array, but it could be set to 0
 * Flow Variant: 31 Data flow: make a copy of data within the same method
 *
 * */






import java.util.logging.Level;

public class CWE129_Improper_Validation_of_Array_Index__Property_array_size_31 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        int dataCopy;
        {
            int data;

            data = Integer.MIN_VALUE; /* Initialize data */

            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            {
                String stringNumber = System.getProperty("user.home");
                try
                {
                    data = Integer.parseInt(stringNumber.trim());
                }
                catch(NumberFormatException exceptNumberFormat)
                {
                    IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                }
            }

            dataCopy = data;
        }
        {
            int data = dataCopy;

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

    public void good() throws Throwable
    {
        goodG2B();
        goodB2G();
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
    {
        int dataCopy;
        {
            int data;

            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;

            dataCopy = data;
        }
        {
            int data = dataCopy;

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

    /* goodB2G() - use badsource and goodsink */
    private void goodB2G() throws Throwable
    {
        int dataCopy;
        {
            int data;

            data = Integer.MIN_VALUE; /* Initialize data */

            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            {
                String stringNumber = System.getProperty("user.home");
                try
                {
                    data = Integer.parseInt(stringNumber.trim());
                }
                catch(NumberFormatException exceptNumberFormat)
                {
                    IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                }
            }

            dataCopy = data;
        }
        {
            int data = dataCopy;

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
