class Reversestring{
public static void main(String arg[]){
int num=4256;
int rem=0,rev=0;
while(num!=0){
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
System.out.printf("reverse string is " +rev);
}
}