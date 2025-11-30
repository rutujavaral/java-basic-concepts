import java.util.*;

class ExceptionDemo6
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);

       int iNo1 = 0, iNo2 = 0, iAns = 0;
       

       System.out.println("Enter First Number : ");
       iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
       iNo2 = sobj.nextInt();
       
       try
       {
          System.out.println("Inside try block");
          iAns = iNo1 / iNo2;

       }

          catch(Exception eobj)
       {
          System.out.println("Inside Generic catch"); //generic catch
       }

       catch(ArithmeticException aobj)
       {
         System.out.println("Inside catch block"); //specific catch
         System.out.println(aobj);
       }

    

       System.out.println("Division is : "+iAns);
       

    }
}