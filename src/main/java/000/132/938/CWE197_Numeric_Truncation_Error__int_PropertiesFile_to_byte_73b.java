/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE197_Numeric_Truncation_Error__int_PropertiesFile_to_byte_73b.java
Label Definition File: CWE197_Numeric_Truncation_Error__int.label.xml
Template File: sources-sink-73b.tmpl.java
*/
/*
 * @description
 * CWE: 197 Numeric Truncation Error
 * BadSource: PropertiesFile Read data from a .properties file (in property named data)
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: to_byte
 *    BadSink : Convert data to a byte
 * Flow Variant: 73 Data flow: data passed in a LinkedList from one method to another in different source files in the same package
 *
 * */



import java.util.LinkedList;

public class CWE197_Numeric_Truncation_Error__int_PropertiesFile_to_byte_73b
{
    public void badSink(LinkedList<Integer> dataLinkedList ) throws Throwable
    {
        int data = dataLinkedList.remove(2);

        {
            /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
            IO.writeLine((byte)data);
        }

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(LinkedList<Integer> dataLinkedList ) throws Throwable
    {
        int data = dataLinkedList.remove(2);

        {
            /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
            IO.writeLine((byte)data);
        }

    }
}
