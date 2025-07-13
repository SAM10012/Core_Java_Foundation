import java.util.*;
public class freq_of_array_elements
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int[] arr = new int[6];

for(int i=0;i<=5;i++)
{
arr[i] = sc.nextInt();
}

System.out.print("Arr contains: ");
for(int i=0;i<=5;i++)
{
System.out.print(arr[i] + " ");
}
System.out.println();
int[] info = new int[2*arr.length];
int k=0;
for(int i=0;i<=5;)
{
if(arr[i] != -1)
{
int count = 1;
for(int j=i+1; j<=5; j++)
{
if(arr[i] == arr[j])
{
count++;
arr[j] = -1;
}
}
info[k] = arr[i];
k++;
info[k] = count;
k++;
i++;
}
else
{
i=i+1;
}
}

System.out.print("Info contains: ");
for(int i=0;i<info.length && info[i] != 0;i++)
{
System.out.print(info[i] + " ");
}
}
}