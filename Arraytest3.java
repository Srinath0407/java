import java.util.*;
class Arraytest3{
public static void main(String arg[]){
int a[]={1,2,3,4,5};
int i;
System.out.println("Enter the array values:");
for( i=0;i<a.length;i++){
System.out.println(a[i]);
}
System.out.println("The array values are:");
for( i=a.length-1;i>=0;i--){
System.out.println(a[i]);
}
}
}