import java.util.*;
public class palindrome
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter your number: ");
int num = sc.nextInt();
int num1 = num;
int rev = 0;
int rem = 0;
while(num>0)
{
rem = num % 10;
rev = rev * 10 + rem;
num = num / 10;
}
//System.out.print(rev);
if(num1 == rev)
	System.out.print("Palindrome!");
else
	System.out.print("Not Palindrome!");
}
}