/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE78_OS_Command_Injection__database_53c.java
Label Definition File: CWE78_OS_Command_Injection.label.xml
Template File: sources-sink-53c.tmpl.java
*/
/*
 * @description
 * CWE: 78 OS Command Injection
 * BadSource: database Read data from a database
 * GoodSource: A hardcoded string
 * Sinks: exec
 *    BadSink : dynamic command execution with Runtime.getRuntime().exec()
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */







public class CWE78_OS_Command_Injection__database_53c
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE78_OS_Command_Injection__database_53d()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE78_OS_Command_Injection__database_53d()).goodG2BSink(data );
    }
}
