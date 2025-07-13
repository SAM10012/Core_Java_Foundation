import java.util.*;
public class fibonacci_without_rec
{
public static void main(String args[])
{
System.out.print("Enter the no. upto which the series should continue: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a=0, b=1, c=0;
System.out.print("0 1 ");
for(int i=0;i<n-2;i++)
{
c = a + b;
a = b;
b = c;
System.out.print(c + " ");
}
}
}