
class Hello
{

    public int i;
    public Hello(int no)
    {
        System.out.println("Inside hello constructor");
        this.i=no+1;

    }
    public void Display()
    {
      System.out.println("Inside Hello Display"); 

    }
}
class Demo extends Hello
{
   public int i;
   

   public Demo(int a)
   {
      super(a);
      System.out.println("Inside demo constructor");
      this.i=a;

   }
   

   public void Display()
   {
      int i=0;
      System.out.println("Inside Inside Display"+i);//0
      System.out.println("Inside Inside Display"+this.i);// 51
      System.out.println("Inside Inside Display"+Super.i);
      super.Display();  third use
   }
}

class SuperDemo
{
    public static void main (String A[])
    {
       Demo dobj=new Demo(51);
       dobj.Display();
       
    }
}