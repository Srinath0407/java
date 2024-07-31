class box
{
    double width;
    double length;
    double depth; 
    void get()
    {
           width = 10.5;
           length = 20.5;
           depth = 5.5;
    }
    void volume()
    {
     double v= width*length*depth;
     System.out.print("volume of the box = "+v);
    }
}
class boxtest
{
     public static void main(String arg[])
    {
        box myBox = new box();
        myBox.get();
        myBox.volume();
     }
}