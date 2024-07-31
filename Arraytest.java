import java.util.*;
class Arraytest{
public static void main(String arg[]){
int a[]=new int[10];
int i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array values:");
for( i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
System.out.println("The array values are:");
for( i=0;i<a.length;i++){
System.out.println(a[i]);
}
}
}