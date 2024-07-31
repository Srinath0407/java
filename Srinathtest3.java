//area of triangle using static variable 
class triangle
{
  static double b=3,h=4,area;
  public static void call()
  {
     area=0.5 * b *h ;
     System.out.println("Area of triangle:" +area);
   }
}
class Srinathtest3
   {
     public static void main(String arg[])
     {
         triangle.call();
      }
    }   