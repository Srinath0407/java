class Info 
{
   String name;
   int regno,s1,s2,s3,s4,s5,total,average;

Info(String x,String y ,int z,int a,int b,int c,int d, int e)
{
   name=x;
   regno=z;
   s1=a;
   s2=b;
   s3=c;
   s4=d;
   s5=e;
}
}
void display()
{
      total=s1+s2+s3+s4+s5;
      average=(total)/5;
      System.out.println(name);
      System.out.println(regno);
      System.out.println(total);
      System.out.println(average);
}
class Infotest
{
 public static void main (String arg[])
{
Info s=new Info(Srinath,192324107,4,6,7,8,9);
s.display();
}
}