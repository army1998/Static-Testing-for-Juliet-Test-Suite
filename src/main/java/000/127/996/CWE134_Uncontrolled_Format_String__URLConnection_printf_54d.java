/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE134_Uncontrolled_Format_String__URLConnection_printf_54d.java
Label Definition File: CWE134_Uncontrolled_Format_String.label.xml
Template File: sources-sinks-54d.tmpl.java
*/
/*
 * @description
 * CWE: 134 Uncontrolled Format String
 * BadSource: URLConnection Read data from a web server with URLConnection
 * GoodSource: A hardcoded string
 * Sinks: printf
 *    GoodSink: dynamic printf format with string defined
 *    BadSink : dynamic printf without validation
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */




public class CWE134_Uncontrolled_Format_String__URLConnection_printf_54d
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE134_Uncontrolled_Format_String__URLConnection_printf_54e()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE134_Uncontrolled_Format_String__URLConnection_printf_54e()).goodG2BSink(data );
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(String data ) throws Throwable
    {
        (new CWE134_Uncontrolled_Format_String__URLConnection_printf_54e()).goodB2GSink(data );
    }
}
