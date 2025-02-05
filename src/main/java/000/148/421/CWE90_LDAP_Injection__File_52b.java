/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE90_LDAP_Injection__File_52b.java
Label Definition File: CWE90_LDAP_Injection.label.xml
Template File: sources-sink-52b.tmpl.java
*/
/*
 * @description
 * CWE: 90 LDAP Injection
 * BadSource: File Read data from file (named c:\data.txt)
 * GoodSource: A hardcoded string
 * Sinks:
 *    BadSink : data concatenated into LDAP search, which could result in LDAP Injection
 * Flow Variant: 52 Data flow: data passed as an argument from one method to another to another in three different classes in the same package
 *
 * */







public class CWE90_LDAP_Injection__File_52b
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE90_LDAP_Injection__File_52c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE90_LDAP_Injection__File_52c()).goodG2BSink(data );
    }
}
