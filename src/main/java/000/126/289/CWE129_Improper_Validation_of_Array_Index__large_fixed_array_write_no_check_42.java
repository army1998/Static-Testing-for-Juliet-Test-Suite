/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE129_Improper_Validation_of_Array_Index__large_fixed_array_write_no_check_42.java
Label Definition File: CWE129_Improper_Validation_of_Array_Index.label.xml
Template File: sources-sinks-42.tmpl.java
*/
/*
 * @description
 * CWE: 129 Improper Validation of Array Index
 * BadSource: large_fixed Set data to a value greater than the size of the array
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: array_write_no_check
 *    GoodSink: Write to array after verifying index
 *    BadSink : Write to array without any verification of index
 * Flow Variant: 42 Data flow: data returned from one method to another in the same class
 *
 * */






public class CWE129_Improper_Validation_of_Array_Index__large_fixed_array_write_no_check_42 extends AbstractTestCase
{
    private int badSource() throws Throwable
    {
        int data;

        /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
        data = 100;

        return data;
    }

    public void bad() throws Throwable
    {
        int data = badSource();

        /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
        int array[] = { 0, 1, 2, 3, 4 };

        /* POTENTIAL FLAW: Attempt to write to array at location data, which may be outside the array bounds */
        array[data] = 42;

        /* Skip reading back data from array since that may be another out of bounds operation */

    }

    /* goodG2B() - use goodsource and badsink */
    private int goodG2BSource() throws Throwable
    {
        int data;

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2;

        return data;
    }

    private void goodG2B() throws Throwable
    {
        int data = goodG2BSource();

        /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
        int array[] = { 0, 1, 2, 3, 4 };

        /* POTENTIAL FLAW: Attempt to write to array at location data, which may be outside the array bounds */
        array[data] = 42;

        /* Skip reading back data from array since that may be another out of bounds operation */

    }

    /* goodB2G() - use badsource and goodsink */
    private int goodB2GSource() throws Throwable
    {
        int data;

        /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
        data = 100;

        return data;
    }

    private void goodB2G() throws Throwable
    {
        int data = goodB2GSource();

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

    public void good() throws Throwable
    {
        goodG2B();
        goodB2G();
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
