/*
 * @description statement always evaluates to false
 * 
 * */





public class CWE570_Expression_Always_False__private_return_01 extends AbstractTestCase 
{
    private boolean privateReturnsFalse() 
    {
        return false;
    }

    public void bad()
    {
        /* FLAW: always evaluates to false */
        if (privateReturnsFalse())
        {
            IO.writeLine("never prints");
        }
    }
    
    public void good()
    {
        good1();
    }
    
    private void good1()
    {
        /* FIX: may evaluate to true or false */
        if (IO.staticReturnsTrueOrFalse() == privateReturnsFalse())
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
