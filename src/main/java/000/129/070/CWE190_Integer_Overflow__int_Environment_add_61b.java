/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__int_Environment_add_61b.java
Label Definition File: CWE190_Integer_Overflow__int.label.xml
Template File: sources-sinks-61b.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: Environment Read data from an environment variable
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: add
 *    GoodSink: Ensure there will not be an overflow before adding 1 to data
 *    BadSink : Add 1 to data, which can cause an overflow
 * Flow Variant: 61 Data flow: data returned from one method to another in different classes in the same package
 *
 * */






import java.util.logging.Level;

public class CWE190_Integer_Overflow__int_Environment_add_61b
{
    public int badSource() throws Throwable
    {
        int data;

        data = Integer.MIN_VALUE; /* Initialize data */

        /* get environment variable ADD */
        /* POTENTIAL FLAW: Read data from an environment variable */
        {
            String stringNumber = System.getenv("ADD");
            if (stringNumber != null) // avoid NPD incidental warnings
            {
                try
                {
                    data = Integer.parseInt(stringNumber.trim());
                }
                catch(NumberFormatException exceptNumberFormat)
                {
                    IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                }
            }
        }

        return data;
    }

    /* goodG2B() - use goodsource and badsink */
    public int goodG2BSource() throws Throwable
    {
        int data;

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2;

        return data;
    }

    /* goodB2G() - use badsource and goodsink */
    public int goodB2GSource() throws Throwable
    {
        int data;

        data = Integer.MIN_VALUE; /* Initialize data */

        /* get environment variable ADD */
        /* POTENTIAL FLAW: Read data from an environment variable */
        {
            String stringNumber = System.getenv("ADD");
            if (stringNumber != null) // avoid NPD incidental warnings
            {
                try
                {
                    data = Integer.parseInt(stringNumber.trim());
                }
                catch(NumberFormatException exceptNumberFormat)
                {
                    IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                }
            }
        }

        return data;
    }
}
