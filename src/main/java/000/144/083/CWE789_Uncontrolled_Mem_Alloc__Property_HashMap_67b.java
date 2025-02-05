/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE789_Uncontrolled_Mem_Alloc__Property_HashMap_67b.java
Label Definition File: CWE789_Uncontrolled_Mem_Alloc.int.label.xml
Template File: sources-sink-67b.tmpl.java
*/
/*
 * @description
 * CWE: 789 Uncontrolled Memory Allocation
 * BadSource: Property Read data from a system property
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: HashMap
 *    BadSink : Create a HashMap using data as the initial size
 * Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
 *
 * */






import java.util.HashMap;

public class CWE789_Uncontrolled_Mem_Alloc__Property_HashMap_67b
{
    public void badSink(CWE789_Uncontrolled_Mem_Alloc__Property_HashMap_67a.Container dataContainer ) throws Throwable
    {
        int data = dataContainer.containerOne;

        /* POTENTIAL FLAW: Create a HashMap using data as the initial size.  data may be very large, creating memory issues */
        HashMap intHashMap = new HashMap(data);

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(CWE789_Uncontrolled_Mem_Alloc__Property_HashMap_67a.Container dataContainer ) throws Throwable
    {
        int data = dataContainer.containerOne;

        /* POTENTIAL FLAW: Create a HashMap using data as the initial size.  data may be very large, creating memory issues */
        HashMap intHashMap = new HashMap(data);

    }
}
