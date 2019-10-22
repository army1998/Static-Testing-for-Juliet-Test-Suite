/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE36_Absolute_Path_Traversal__Environment_52b.java
Label Definition File: CWE36_Absolute_Path_Traversal.label.xml
Template File: sources-sink-52b.tmpl.java
*/
/*
 * @description
 * CWE: 36 Absolute Path Traversal
 * BadSource: Environment Read data from an environment variable
 * GoodSource: A hardcoded string
 * Sinks: readFile
 *    BadSink : read line from file from disk
 * Flow Variant: 52 Data flow: data passed as an argument from one method to another to another in three different classes in the same package
 *
 * */





import java.io.*;


public class CWE36_Absolute_Path_Traversal__Environment_52b
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE36_Absolute_Path_Traversal__Environment_52c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE36_Absolute_Path_Traversal__Environment_52c()).goodG2BSink(data );
    }
}
