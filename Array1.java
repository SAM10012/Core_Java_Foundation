import java.util.*;
public class Array1
{
public static void main(String[] args)
{
int arr1[] = new int[5];
Scanner sc = new Scanner(System.in);
for(int i=0;i<arr1.length;i++)
{
arr1[i] = sc.nextInt();
}
for(int i=0;i<arr1.length;i++)
{
System.out.println(arr1[i]);
}
}
}