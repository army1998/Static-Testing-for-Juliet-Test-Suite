/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE129_Improper_Validation_of_Array_Index__Property_array_read_no_check_68b.java
Label Definition File: CWE129_Improper_Validation_of_Array_Index.label.xml
Template File: sources-sinks-68b.tmpl.java
*/
/*
 * @description
 * CWE: 129 Improper Validation of Array Index
 * BadSource: Property Read data from a system property
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: array_read_no_check
 *    GoodSink: Read from array after verifying index
 *    BadSink : Read from array without any verification of index
 * Flow Variant: 68 Data flow: data passed as a member variable in the "a" class, which is used by a method in another class in the same package
 *
 * */






public class CWE129_Improper_Validation_of_Array_Index__Property_array_read_no_check_68b
{
    public void badSink() throws Throwable
    {
        int data = CWE129_Improper_Validation_of_Array_Index__Property_array_read_no_check_68a.data;

        /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
        int array[] = { 0, 1, 2, 3, 4 };

        /* POTENTIAL FLAW: Attempt to read from array at location data, which may be outside the array bounds */
        IO.writeLine(array[data]);

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink() throws Throwable
    {
        int data = CWE129_Improper_Validation_of_Array_Index__Property_array_read_no_check_68a.data;

        /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
        int array[] = { 0, 1, 2, 3, 4 };

        /* POTENTIAL FLAW: Attempt to read from array at location data, which may be outside the array bounds */
        IO.writeLine(array[data]);

    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink() throws Throwable
    {
        int data = CWE129_Improper_Validation_of_Array_Index__Property_array_read_no_check_68a.data;

        /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
        int array[] = { 0, 1, 2, 3, 4 };

        /* FIX: Verify index before reading from array at location data */
        if (data >= 0 && data < array.length)
        {
            IO.writeLine(array[data]);
        }
        else
        {
            IO.writeLine("Array index out of bounds");
        }

    }
}
