class srinath1
{
    int a ;
    int b;
    int reminder=0;
    int quotient=0;
    int i;

    srinath1()
        {
           a=10;
           b=5;
        }

void answer()
{
   reminder=a%b;
   quotient=a/b;
   System.out.println("The reminder of the number is : "+reminder);
   System.out.println("The qoutient of the number is : "+quotient);
}
}
 class srinathtest1
{
    public static void main(String[] args)
    {
     srinath1 s=new srinath1();
     s.answer();
}
}