import java.util.*;
class Arraytest4{
public static void main(String arg[]){
int a[]=new int[5];
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
int maxValue = a[0];
int minValue = a[0];
for( i=1;i<a.length;i++) {
    if(a[i]>maxValue) {
      maxValue = a[i];
            }
    if (a[i]<minValue) {
      minValue = a[i];
            }
        }
System.out.println("Maximum value: " + maxValue);
System.out.println("Minimum value: " + minValue);
}
}