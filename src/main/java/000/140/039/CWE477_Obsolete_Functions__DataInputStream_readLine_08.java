/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE477_Obsolete_Functions__DataInputStream_readLine_08.java
Label Definition File: CWE477_Obsolete_Functions.label.xml
Template File: point-flaw-08.tmpl.java
*/
/*
* @description
* CWE: 477 Use of Obsolete Functions
* Sinks: DataInputStream_readLine
*    GoodSink: Use of preferred BufferedReader.readLine() method
*    BadSink : Use deprecated DataInputStream.readLine() method
* Flow Variant: 08 Control flow: if(privateReturnsTrue()) and if(privateReturnsFalse())
*
* */





import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataInputStream;

public class CWE477_Obsolete_Functions__DataInputStream_readLine_08 extends AbstractTestCase
{
    /* The methods below always return the same value, so a tool
     * should be able to figure out that every call to these
     * methods will return true or return false.
     */
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void bad() throws Throwable
    {
        if (privateReturnsTrue())
        {
            /* Read a line of user input from console with deprecated DataInputStream.readLine() method */
            {
                /* FLAW: Read input from the console using DataInputStream.readLine() */
                DataInputStream streamDataInput = new DataInputStream(System.in);
                String myString = streamDataInput.readLine();
                IO.writeLine(myString); /* Use myString */
                /* NOTE: Tools may report a flaw here because streamDataInput is not closed.  Unfortunately, closing that will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
            }
        }
    }

    /* good1() changes privateReturnsTrue() to privateReturnsFalse() */
    private void good1() throws Throwable
    {
        if (privateReturnsFalse())
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            /* Read a line of user input from console with preferred BufferedReader.readLine() method */
            {
                InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                BufferedReader readerBuffered = new BufferedReader(readerInputStream);

                /* FIX: Read input from the console using preferred method BufferedReader.readLine() */
                String myString = readerBuffered.readLine();

                IO.writeLine(myString); /* Use myString */

                /* NOTE: Tools may report a flaw here because readerBuffered and readerInputStream are not closed.  Unfortunately, closing those will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
            }

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2() throws Throwable
    {
        if (privateReturnsTrue())
        {
            /* Read a line of user input from console with preferred BufferedReader.readLine() method */
            {
                InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                BufferedReader readerBuffered = new BufferedReader(readerInputStream);
                /* FIX: Read input from the console using preferred method BufferedReader.readLine() */
                String myString = readerBuffered.readLine();
                IO.writeLine(myString); /* Use myString */
                /* NOTE: Tools may report a flaw here because readerBuffered and readerInputStream are not closed.  Unfortunately, closing those will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
            }
        }
    }

    public void good() throws Throwable
    {
        good1();
        good2();
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
