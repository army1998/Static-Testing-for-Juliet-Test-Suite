/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE78_OS_Command_Injection__connect_tcp_54d.java
Label Definition File: CWE78_OS_Command_Injection.label.xml
Template File: sources-sink-54d.tmpl.java
*/
/*
 * @description
 * CWE: 78 OS Command Injection
 * BadSource: connect_tcp Read data using an outbound tcp connection
 * GoodSource: A hardcoded string
 * Sinks: exec
 *    BadSink : dynamic command execution with Runtime.getRuntime().exec()
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */







public class CWE78_OS_Command_Injection__connect_tcp_54d
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE78_OS_Command_Injection__connect_tcp_54e()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE78_OS_Command_Injection__connect_tcp_54e()).goodG2BSink(data );
    }
}
