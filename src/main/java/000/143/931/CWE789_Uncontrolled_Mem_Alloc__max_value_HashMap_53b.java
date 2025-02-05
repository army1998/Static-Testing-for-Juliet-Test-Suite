/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE789_Uncontrolled_Mem_Alloc__max_value_HashMap_53b.java
Label Definition File: CWE789_Uncontrolled_Mem_Alloc.int.label.xml
Template File: sources-sink-53b.tmpl.java
*/
/*
 * @description
 * CWE: 789 Uncontrolled Memory Allocation
 * BadSource: max_value Set data to a hardcoded value of Integer.MAX_VALUE
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: HashMap
 *    BadSink : Create a HashMap using data as the initial size
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */






public class CWE789_Uncontrolled_Mem_Alloc__max_value_HashMap_53b
{
    public void badSink(int data ) throws Throwable
    {
        (new CWE789_Uncontrolled_Mem_Alloc__max_value_HashMap_53c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data ) throws Throwable
    {
        (new CWE789_Uncontrolled_Mem_Alloc__max_value_HashMap_53c()).goodG2BSink(data );
    }
}
