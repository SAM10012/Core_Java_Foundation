import java.util.*;
public class prime_within_range_1
{
public static void main(String args[])
{
System.out.print("Enter the range: ");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
for(int i=a;i<=b;i++)
{
int flag = 0;
for(int j=2; j<=i/2;j++)
{
if(i%j == 0)
{
flag = 1;
break;
}
}

if (flag == 0)
{
System.out.print( i + " " );
}
}
}
}