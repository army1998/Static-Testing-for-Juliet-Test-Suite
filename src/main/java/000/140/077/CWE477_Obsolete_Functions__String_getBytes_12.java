/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE477_Obsolete_Functions__String_getBytes_12.java
Label Definition File: CWE477_Obsolete_Functions.label.xml
Template File: point-flaw-12.tmpl.java
*/
/*
* @description
* CWE: 477 Use of Obsolete Functions
* Sinks: String_getBytes
*    GoodSink: Use of preferred java.lang.String.getBytes() method
*    BadSink : Use of deprecated java.lang.String.getBytes(int, int, byte[], int) method
* Flow Variant: 12 Control flow: if(IO.staticReturnsTrueOrFalse())
*
* */





public class CWE477_Obsolete_Functions__String_getBytes_12 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            String sentence = "Convert this to bytes";
            byte[] sentenceAsBytes = new byte[sentence.length()];
            /* FLAW: Use of deprecated String.getBytes(int, int, byte[], int) method */
            sentence.getBytes(0, sentence.length(), sentenceAsBytes, 0);
            IO.writeLine(IO.toHex(sentenceAsBytes)); /* Use sentenceAsBytes */
        }
        else
        {

            String sentence = "Convert this to bytes";

            /* FIX: Use preferred String.getBytes() method */
            byte[] sentenceAsBytes = sentence.getBytes("UTF-8");

            IO.writeLine(IO.toHex(sentenceAsBytes)); /* Use sentenceAsBytes */

        }
    }

    /* good1() changes the "if" so that both branches use the GoodSink */
    private void good1() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            String sentence = "Convert this to bytes";
            /* FIX: Use preferred String.getBytes() method */
            byte[] sentenceAsBytes = sentence.getBytes("UTF-8");
            IO.writeLine(IO.toHex(sentenceAsBytes)); /* Use sentenceAsBytes */
        }
        else
        {

            String sentence = "Convert this to bytes";

            /* FIX: Use preferred String.getBytes() method */
            byte[] sentenceAsBytes = sentence.getBytes("UTF-8");

            IO.writeLine(IO.toHex(sentenceAsBytes)); /* Use sentenceAsBytes */

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
