/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE643_Xpath_Injection__Property_54b.java
Label Definition File: CWE643_Xpath_Injection.label.xml
Template File: sources-sinks-54b.tmpl.java
*/
/*
 * @description
 * CWE: 643 Xpath Injection
 * BadSource: Property Read data from a system property
 * GoodSource: A hardcoded string
 * Sinks:
 *    GoodSink: validate input through StringEscapeUtils
 *    BadSink : user input is used without validate
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */







public class CWE643_Xpath_Injection__Property_54b
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE643_Xpath_Injection__Property_54c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE643_Xpath_Injection__Property_54c()).goodG2BSink(data );
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(String data ) throws Throwable
    {
        (new CWE643_Xpath_Injection__Property_54c()).goodB2GSink(data );
    }
}
