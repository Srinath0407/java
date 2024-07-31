import java.util.*;
class Matrixaddition {
   public static void main(String arg[]) {
       int a[][] = new int[10][10];
       int b[][] = new int[10][10];
       int c[][] = new int[10][10];
       int i,j;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter A matrix values");
       for( i=0;i<2;i++ ){
            for( j=0;j<2;j++ ){
                  a[i][j]=sc.nextInt();
                 }
       }
       System.out.println("enter B matrix values");
       for( i=0;i<2;i++ ){
            for( j=0;j<2;j++ ){
                  b[i][j]=sc.nextInt();
                 }
       }
       for( i=0;i<2;i++ ){
            for( j=0;j<2;j++ ){
                  c[i][j]=a[i][j]+b[i][j];
                 }
       }
       System.out.println("Addition of two matrix A and B :");
       for( i=0;i<2;i++ ){
            for( j=0;j<2;j++ ){
                  System.out.print(c[i][j]+" ");
                 }
                 System.out.println("");
       }
}
}