//overloading to print multiplication table of 11 and 13
class Multiplication
{
  int n, m, j;
  void multi()
  {
    for(int i=1;i<=10;i++)
    {
       System.out.println("11 * "+i+" = "+11*i);
    }
  }
  void multi(int x)
  {
    n = x;
    for(int i=1;i<=10;i++)
    {
       System.out.println(n+" * "+i+" = "+n*i);
    }
  }

}
class Srinathtest4
{
  public static void main(String arg[])
  {
    Multiplication obj=new Multiplication();
    obj.multi(); 
    System.out.println();
    obj.multi(13);

}
}