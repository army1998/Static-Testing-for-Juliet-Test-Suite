/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE80_XSS__CWE182_Servlet_listen_tcp_42.java
Label Definition File: CWE80_XSS__CWE182_Servlet.label.xml
Template File: sources-sink-42.tmpl.java
*/
/*
 * @description
 * CWE: 80 Cross Site Scripting (XSS)
 * BadSource: listen_tcp Read data using a listening tcp connection
 * GoodSource: A hardcoded string
 * BadSink:  Display of data in web page after using replaceAll() to remove script tags, which will still allow XSS (CWE 182: Collapse of Data into Unsafe Value)
 * Flow Variant: 42 Data flow: data returned from one method to another in the same class
 *
 * */




import javax.servlet.http.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;

import java.util.logging.Level;

public class CWE80_XSS__CWE182_Servlet_listen_tcp_42 extends AbstractTestCaseServlet
{
    private String badSource(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        data = ""; /* Initialize data */

        /* Read data using a listening tcp connection */
        {
            ServerSocket listener = null;
            Socket socket = null;
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;

            /* Read data using a listening tcp connection */
            try
            {
                listener = new ServerSocket(39543);
                socket = listener.accept();

                /* read input from socket */

                readerInputStream = new InputStreamReader(socket.getInputStream(), "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);

                /* POTENTIAL FLAW: Read data using a listening tcp connection */
                data = readerBuffered.readLine();
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
            finally
            {
                /* Close stream reading objects */
                try
                {
                    if (readerBuffered != null)
                    {
                        readerBuffered.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                }

                try
                {
                    if (readerInputStream != null)
                    {
                        readerInputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }

                /* Close socket objects */
                try
                {
                    if (socket != null)
                    {
                        socket.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                }

                try
                {
                    if (listener != null)
                    {
                        listener.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing ServerSocket", exceptIO);
                }
            }
        }

        return data;
    }

    /* use badsource and badsink */
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = badSource(request, response);

        if (data != null)
        {
            /* POTENTIAL FLAW: Display of data in web page after using replaceAll() to remove script tags, which will still allow XSS with strings like <scr<script>ipt> (CWE 182: Collapse of Data into Unsafe Value) */
            response.getWriter().println("<br>bad(): data = " + data.replaceAll("(<script>)", ""));
        }

    }

    private String goodG2BSource(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        /* FIX: Use a hardcoded string */
        data = "foo";

        return data;
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = goodG2BSource(request, response);

        if (data != null)
        {
            /* POTENTIAL FLAW: Display of data in web page after using replaceAll() to remove script tags, which will still allow XSS with strings like <scr<script>ipt> (CWE 182: Collapse of Data into Unsafe Value) */
            response.getWriter().println("<br>bad(): data = " + data.replaceAll("(<script>)", ""));
        }

    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        goodG2B(request, response);
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
