import java.util.*;
class star
{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
int n=sc.nextInt();
int i,j;
for( i = n; i >= 1; i--){
 for( j = n; j > i ; j--){
  System.out.print(" ");
}
for( j = 1 ; j <= i ; j++ ){
System.out.print("* ");
}
System.out.println();

}

}
}