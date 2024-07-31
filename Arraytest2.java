import java.util.*;
class Arraytest2{
public static void main(String arg[]){
int a[]=new int[5];
int i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array values:");
for( i=1;i<a.length;i++){
a[i]=sc.nextInt();
}
System.out.println("The sum of the array values are:");
int sum=0;
for( i=0;i<=a.length;i++){
sum+=i;
}
System.out.println(sum);

}
}