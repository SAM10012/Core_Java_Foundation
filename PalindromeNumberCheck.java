import java.util.*;
public class PalindromeNumberCheck
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);  
System.out.println("Please enter the number: ");
int num= sc.nextInt();  
int rem,n,temp=num;
int newnum=0;
while(num>0)
{
rem=num%10;
newnum = (newnum*10)+rem;
num=num/10;
}

if(temp == newnum)
{
System.out.println(temp+" is a Palindrome Number.");
}
else
{
System.out.println(temp+" is not a Palindrome Number.");
}
}
}