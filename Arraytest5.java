import java.util.*;
class Arraytest5{
public static void main(String arg[]){
int a[]=new int[5];
int i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array values:");
for( i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
for( i=0;i<a.length-1;i++) {
    for(int j=0;j<a.length-i-1;j++) {
          if(a[j]>a[j+1]){
             int temp = a[j];
             a[j] =a[j + 1];
             a[j + 1] = temp;
                }
            }
        }
System.out.println("Elements of array sorted :");
    for(int num : a){
            System.out.print(num + " ");
        }
    }
}
