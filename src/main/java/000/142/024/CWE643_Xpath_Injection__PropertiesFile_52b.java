/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE643_Xpath_Injection__PropertiesFile_52b.java
Label Definition File: CWE643_Xpath_Injection.label.xml
Template File: sources-sinks-52b.tmpl.java
*/
/*
 * @description
 * CWE: 643 Xpath Injection
 * BadSource: PropertiesFile Read data from a .properties file (in property named data)
 * GoodSource: A hardcoded string
 * Sinks:
 *    GoodSink: validate input through StringEscapeUtils
 *    BadSink : user input is used without validate
 * Flow Variant: 52 Data flow: data passed as an argument from one method to another to another in three different classes in the same package
 *
 * */







public class CWE643_Xpath_Injection__PropertiesFile_52b
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE643_Xpath_Injection__PropertiesFile_52c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE643_Xpath_Injection__PropertiesFile_52c()).goodG2BSink(data );
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(String data ) throws Throwable
    {
        (new CWE643_Xpath_Injection__PropertiesFile_52c()).goodB2GSink(data );
    }
}
