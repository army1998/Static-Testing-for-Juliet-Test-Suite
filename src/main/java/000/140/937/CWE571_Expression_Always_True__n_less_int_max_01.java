/*
 * @description statement always evaluates to true
 * 
 * */




import java.security.SecureRandom;

public class CWE571_Expression_Always_True__n_less_int_max_01 extends AbstractTestCase 
{
    public void bad()
    {
        int intSecureRandom = (new SecureRandom()).nextInt();
        /* FLAW: always evaluates to true */
        if (intSecureRandom < Integer.MAX_VALUE)
        {
            IO.writeLine("always prints");
        }
    }
    
    public void good()
    {
        good1();
    }
    
    private void good1()
    {
        /* FIX: may evaluate to true or false */
        int intSecureRandom = (new SecureRandom()).nextInt();
        if (intSecureRandom < 5000)
        {
            IO.writeLine("sometimes prints");
        }
    }

    /* Below is the main(). It is only used when building this testcase on 
     * its own for testing or for building a binary to use in testing binary 
     * analysis tools. It is not used when compiling all the testcases as one 
     * application, which is how source code analysis tools are tested. 
	 */ 
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        mainFromParent(args);
    }
}
