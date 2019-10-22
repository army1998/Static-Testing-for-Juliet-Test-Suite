/*
 * @description statement always evaluates to true
 * 
 * */





import java.security.SecureRandom;

public class CWE571_Expression_Always_True__private_static_final_five_01 extends AbstractTestCase 
{
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    
    public void bad()
    {
        /* FLAW: always evaluates to true */
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
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
        if ((new SecureRandom()).nextInt() == PRIVATE_STATIC_FINAL_FIVE)
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
