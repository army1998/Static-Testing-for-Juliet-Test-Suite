/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE90_LDAP_Injection__connect_tcp_54c.java
Label Definition File: CWE90_LDAP_Injection.label.xml
Template File: sources-sink-54c.tmpl.java
*/
/*
 * @description
 * CWE: 90 LDAP Injection
 * BadSource: connect_tcp Read data using an outbound tcp connection
 * GoodSource: A hardcoded string
 * Sinks:
 *    BadSink : data concatenated into LDAP search, which could result in LDAP Injection
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */







public class CWE90_LDAP_Injection__connect_tcp_54c
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE90_LDAP_Injection__connect_tcp_54d()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE90_LDAP_Injection__connect_tcp_54d()).goodG2BSink(data );
    }
}
