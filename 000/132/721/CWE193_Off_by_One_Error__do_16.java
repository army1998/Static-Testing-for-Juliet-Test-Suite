/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE193_Off_by_One_Error__do_16.java
Label Definition File: CWE193_Off_by_One_Error.label.xml
Template File: point-flaw-16.tmpl.java
*/
/*
* @description
* CWE: 193 An array index is 1 off from the max array index
* Sinks: do
*    GoodSink: restrict max index value
*    BadSink : access array index outside array max
* Flow Variant: 16 Control flow: while(true)
*
* */





public class CWE193_Off_by_One_Error__do_16 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        while(true)
        {
            int[] intArray = new int[10];
            int i = 0;
            do
            {
                IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                i++;
            }
            while (i <= intArray.length);   /* FLAW: Use <= rather than < */
            break;
        }
    }

    /* good1() change the conditions on the while statements */
    private void good1() throws Throwable
    {
        while(true)
        {
            int[] intArray = new int[10];
            int i = 0;
            do
            {
                IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                i++;
            }
            while (i < intArray.length);   /* FIX: Use < to ensure no out of bounds access */
            break;
        }
    }

    public void good() throws Throwable
    {
        good1();
    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}
