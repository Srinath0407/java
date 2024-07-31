class srinath
{
 int num,sum=0;
 srinath(int n)
{
     num=n;
 }
    void sumofseries()
  {
       for(int i=1;i<=num;i++)
       {
           sum+=i;
       }
        System.out.println("Sum of series : "+sum);
   }
}
class srinathTest
{
    public static void main(String args[])
    {
         srinath s=new srinath(4);
         s.sumofseries();
}
}