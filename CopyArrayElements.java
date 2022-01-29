import java.util.*;
public class CopyArrayElements
{
public static void main(String[] args)
{
int arr1[] = new int[5];
int arr2[] = new int[arr1.length];
Scanner sc = new Scanner(System.in);
for(int i=0;i<arr1.length;i++)
{
System.out.print("Enter the element " + i +"  of array 1: ");
arr1[i] = sc.nextInt();
}

System.out.println("The elements of array 1 are as follows: ");
for(int i=0;i<arr1.length;i++)
{
System.out.println(arr1[i]);
}

for(int j=0;j<arr1.length;j++)
{
arr2[j] = arr1[j];
}

System.out.println("The elements of array 2 are as follows: ");
for(int j=0;j<arr1.length;j++)
{
System.out.println(arr2[j]);
}
}
}