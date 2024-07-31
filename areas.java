class area
{
 double Ar(int a)
{
   return  a * a;
}
 double Ar(int l , int b)
{
return l * b;
}
double Ar(double r)
{
return 3.14 * r * r;
}
}
class areas
{
public static void main (String arg[])
{
  area s=new area();
  System.out.println("Area of square:"+ s.Ar(5));
  System.out.println("Area of rectangle:"+ s.Ar(4,5));
  System.out.println("Area of circle:"+ s.Ar(5));
}
}

 