import java.util.*;
public class Armstrong_Number_1
{
public static int Check_if_Armstrong(int n)
{
int actual_num = n;
int num = n;
int rem = 0;
int sum = 0;
int count = 0;
while(n >0)
{
rem = n%10;
n = n/10;
count++;
}

while(num >  0)
{
rem = num % 10;
sum = sum + (int)Math.pow(rem,count);
num = num / 10;
}
if (actual_num == sum)
return 1;
else
return 0;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();
System.out.println("Status of " +n +" whether it is  Armstrong No. is : " + Check_if_Armstrong(n));
}
}