class overload
{
   void display()
   {
       System.out.println("Welcome to java");

    }
   void display(String x)
   {
      for (int i = 0; i < 2; i++)
       {
          System.out.println(x);
        }
    }
    void display(String x, int y)
    {
       for (int i = 0; i < y; i++)
       {
          System.out.println(x);
        }
    }
}
class overloadtest
    {
    public static void main(String arg[]) 
    {
        overload obj = new overload();
        obj.display();
        obj.display("welcome to polymorphism");
        obj.display("welcome to overloading", 3);
  }
  }  
