/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE319_Cleartext_Tx_Sensitive_Info__URLConnection_kerberosKey_67b.java
Label Definition File: CWE319_Cleartext_Tx_Sensitive_Info.label.xml
Template File: sources-sinks-67b.tmpl.java
*/
/*
 * @description
 * CWE: 319 Cleartext Transmission of Sensitive Information
 * BadSource: URLConnection Read password from a web server with URLConnection
 * GoodSource: Set password to a hardcoded value (one that was not sent over the network)
 * Sinks: kerberosKey
 *    GoodSink: Decrypt password before using in KerberosKey()
 *    BadSink : Use password directly in KerberosKey()
 * Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
 *
 * */





import javax.security.auth.kerberos.KerberosPrincipal;
import javax.security.auth.kerberos.KerberosKey;

import javax.crypto.Cipher;

import javax.crypto.spec.SecretKeySpec;

public class CWE319_Cleartext_Tx_Sensitive_Info__URLConnection_kerberosKey_67b
{
    public void badSink(CWE319_Cleartext_Tx_Sensitive_Info__URLConnection_kerberosKey_67a.Container passwordContainer ) throws Throwable
    {
        String password = passwordContainer.containerOne;

        if (password != null)
        {
            KerberosPrincipal principal = new KerberosPrincipal("test");
            /* POTENTIAL FLAW: Use password directly in KerberosKey() */
            KerberosKey key = new KerberosKey(principal, password.toCharArray(), null);
            IO.writeLine(key.toString());
        }

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(CWE319_Cleartext_Tx_Sensitive_Info__URLConnection_kerberosKey_67a.Container passwordContainer ) throws Throwable
    {
        String password = passwordContainer.containerOne;

        if (password != null)
        {
            KerberosPrincipal principal = new KerberosPrincipal("test");
            /* POTENTIAL FLAW: Use password directly in KerberosKey() */
            KerberosKey key = new KerberosKey(principal, password.toCharArray(), null);
            IO.writeLine(key.toString());
        }

    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(CWE319_Cleartext_Tx_Sensitive_Info__URLConnection_kerberosKey_67a.Container passwordContainer ) throws Throwable
    {
        String password = passwordContainer.containerOne;

        if (password != null)
        {
            KerberosPrincipal principal = new KerberosPrincipal("test");
            /* FIX: Decrypt password before using in KerberosKey() */
            {
                Cipher aesCipher = Cipher.getInstance("AES");
                /* INCIDENTAL: CWE-321: Use of Hard-coded Cryptographic Key */
                SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
                aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
                password = new String(aesCipher.doFinal(password.getBytes("UTF-8")), "UTF-8");
            }
            KerberosKey key = new KerberosKey(principal, password.toCharArray(), null);
            IO.writeLine(key.toString());
        }

    }
}
