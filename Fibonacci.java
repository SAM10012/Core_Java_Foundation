import java.util.*;
public class Fibonacci
{
public static void main(String[] args)
{
int a=0,b=1;
Scanner sc=new Scanner(System.in);  
System.out.println("Please enter upto what no. the series will go on: ");
int num= sc.nextInt();  

System.out.print(" "+a+" "+b+" ");

for(int i=0;i<num;i++)
{
int c=a+b;
System.out.print(c);
System.out.print(" ");
a=b;
b=c;
}
}
}