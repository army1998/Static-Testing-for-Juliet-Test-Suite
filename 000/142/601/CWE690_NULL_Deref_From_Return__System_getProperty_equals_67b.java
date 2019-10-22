/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE690_NULL_Deref_From_Return__System_getProperty_equals_67b.java
Label Definition File: CWE690_NULL_Deref_From_Return.label.xml
Template File: sources-sinks-67b.tmpl.java
*/
/*
 * @description
 * CWE: 690 Unchecked return value is null, leading to a null pointer dereference.
 * BadSource: System_getProperty Set data to return of System.getProperty
 * GoodSource: Set data to fixed, non-null String
 * Sinks: equals
 *    GoodSink: Call equals() on string literal (that is not null)
 *    BadSink : Call equals() on possibly null object
 * Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
 *
 * */







public class CWE690_NULL_Deref_From_Return__System_getProperty_equals_67b
{
    public void badSink(CWE690_NULL_Deref_From_Return__System_getProperty_equals_67a.Container dataContainer ) throws Throwable
    {
        String data = dataContainer.containerOne;

        /* POTENTIAL FLAW: data could be null */
        if(data.equals("CWE690"))
        {
            IO.writeLine("data is CWE690");
        }

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(CWE690_NULL_Deref_From_Return__System_getProperty_equals_67a.Container dataContainer ) throws Throwable
    {
        String data = dataContainer.containerOne;

        /* POTENTIAL FLAW: data could be null */
        if(data.equals("CWE690"))
        {
            IO.writeLine("data is CWE690");
        }

    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(CWE690_NULL_Deref_From_Return__System_getProperty_equals_67a.Container dataContainer ) throws Throwable
    {
        String data = dataContainer.containerOne;

        /* FIX: call equals() on string literal (that is not null) */
        if("CWE690".equals(data))
        {
            IO.writeLine("data is CWE690");
        }

    }
}
