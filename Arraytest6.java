import java.util.*;
class Arraytest6{
public static void main(String arg[]){
int a[]=new int[10];
int i,find,flag=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array values:");
for( i=0;i<5;i++){
a[i]=sc.nextInt();
}
System.out.println("Enter The array values to find:");
find=sc.nextInt();
for( i=0;i<5;i++){
   if(a[i]==find){
       flag=1;
       break;
}
}
if(flag==1){
System.out.println(find+ " value is present in the array:");
System.out.println(find+ " value is present in the "+i+" position");
}
else{
System.out.println(find+ " value is not present in the array:");
}
}
}
