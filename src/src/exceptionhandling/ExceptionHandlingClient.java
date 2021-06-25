package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
/*
All these questions were asked to me in one company or other
 */
public class ExceptionHandlingClient {
    public static void main(String args[])
    {

        System.out.println("Its really fun with finally "+ funWithFinallyMethod());
    }

    private static int funWithFinallyMethod()
    {
        try {
            /*
            Try all the cases one by one, it would really be a fun!!
             */
           // System.exit(0);
           // throw new NullPointerException();
           return 7;//do you really expect me to return?

        }
        finally{
            System.out.println("You can't get rid of me hahaha");
            System.exit(0);
            return 4;
        }

    }

}

class A{
    public void testExceptionUncehcked() throws NullPointerException
    {
        System.out.println("Hey I can throw whatever I like");
    }

    public void testExceptionChecked() throws IOException
    {
        System.out.println("I am a parent so my exception should also be a parent");
    }



}
class B extends A{
    public void testExceptionUncehcked() throws RuntimeException
    {
        System.out.println("Me too it seems, its so easy for Runtime Exceptions, but I wonder why I am being thrown?");
    }

    public void testExceptionChecked() throws FileNotFoundException
    {
        System.out.println("My Exception Type must be child or lower in hierarchy otherwise I will show errors");
    }
}



