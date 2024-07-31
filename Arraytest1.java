import java.util.*;
class Arraytest1{
public static void main(String arg[]){
int a[]=new int[10];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array values:");
for(int i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
System.out.println("The array values are:");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}
System.out.println("The array values are in reverse order:");
for(int i=a.length-1;i>=0;i--){
System.out.println(a[i]);
}
}
}