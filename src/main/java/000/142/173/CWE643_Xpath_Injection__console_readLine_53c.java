/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE643_Xpath_Injection__console_readLine_53c.java
Label Definition File: CWE643_Xpath_Injection.label.xml
Template File: sources-sinks-53c.tmpl.java
*/
/*
 * @description
 * CWE: 643 Xpath Injection
 * BadSource: console_readLine Read data from the console using readLine()
 * GoodSource: A hardcoded string
 * Sinks:
 *    GoodSink: validate input through StringEscapeUtils
 *    BadSink : user input is used without validate
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */







public class CWE643_Xpath_Injection__console_readLine_53c
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE643_Xpath_Injection__console_readLine_53d()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE643_Xpath_Injection__console_readLine_53d()).goodG2BSink(data );
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(String data ) throws Throwable
    {
        (new CWE643_Xpath_Injection__console_readLine_53d()).goodB2GSink(data );
    }
}
