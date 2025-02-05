/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE789_Uncontrolled_Mem_Alloc__getCookies_Servlet_HashMap_74b.java
Label Definition File: CWE789_Uncontrolled_Mem_Alloc.int.label.xml
Template File: sources-sink-74b.tmpl.java
*/
/*
 * @description
 * CWE: 789 Uncontrolled Memory Allocation
 * BadSource: getCookies_Servlet Read data from the first cookie using getCookies()
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: HashMap
 *    BadSink : Create a HashMap using data as the initial size
 * Flow Variant: 74 Data flow: data passed in a HashMap from one method to another in different source files in the same package
 *
 * */



import java.util.HashMap;

import javax.servlet.http.*;


public class CWE789_Uncontrolled_Mem_Alloc__getCookies_Servlet_HashMap_74b
{
    public void badSink(HashMap<Integer,Integer> dataHashMap , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data = dataHashMap.get(2);

        /* POTENTIAL FLAW: Create a HashMap using data as the initial size.  data may be very large, creating memory issues */
        HashMap intHashMap = new HashMap(data);

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(HashMap<Integer,Integer> dataHashMap , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data = dataHashMap.get(2);

        /* POTENTIAL FLAW: Create a HashMap using data as the initial size.  data may be very large, creating memory issues */
        HashMap intHashMap = new HashMap(data);

    }
}
