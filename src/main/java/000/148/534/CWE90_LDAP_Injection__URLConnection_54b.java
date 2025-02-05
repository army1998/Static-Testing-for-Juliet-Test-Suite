/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE90_LDAP_Injection__URLConnection_54b.java
Label Definition File: CWE90_LDAP_Injection.label.xml
Template File: sources-sink-54b.tmpl.java
*/
/*
 * @description
 * CWE: 90 LDAP Injection
 * BadSource: URLConnection Read data from a web server with URLConnection
 * GoodSource: A hardcoded string
 * Sinks:
 *    BadSink : data concatenated into LDAP search, which could result in LDAP Injection
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */







public class CWE90_LDAP_Injection__URLConnection_54b
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE90_LDAP_Injection__URLConnection_54c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE90_LDAP_Injection__URLConnection_54c()).goodG2BSink(data );
    }
}
