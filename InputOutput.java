import java.util.Scanner;
class InputOutput
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);
        int no1=0,no2=0;
        int Ans=0;
        
        System.out.println("Enter first no:");
        no1=sobj.nextInt();

        System.out.println("Enter second no:");
        no2=sobj.nextInt();

        Ans=no1+no2;

        System.out.println("Addition is :"+Ans);


    }
}