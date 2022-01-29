import java.util.*;

public class PrimeNumberSeries
{
public static void main(String[] args)
{
int check = 0;
Scanner sc=new Scanner(System.in);  
System.out.println("Please enter the starting number: ");
int low= sc.nextInt();  
System.out.println("Please enter upto what no. the series will go on: ");
int up= sc.nextInt();  

System.out.println("The prime numbers are as follows: ");
for(int i=low;i<=up;i++)
{
for(int n=2;n<=i/2;n++)
{
if(i%n==0)
{
check=0;		
break;
}
else
check=1;
}
if(check!=0)
System.out.println(i);
}
}
}