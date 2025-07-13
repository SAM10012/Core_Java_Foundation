import java.util.*;
public class left_rotation_of_array
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Write the no. of elements in array: ");
    int n = sc.nextInt();
    System.out.print("Write the no. of rotations: ");
    int r = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.print("Before rotation: ");
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i] + " ");
    }
    int[] safety = new int[r];
    for(int i=0;i<r;i++)
    {
        safety[i] = arr[i];
    }
    int j=0;
    for(int i=0;i<n;i++)
    {
        if(i+r >= n)
        {
            arr[i] = safety[j];
            j++;
        }
        else
        arr[i] = arr[i+r];
        
    }
    
    System.out.print("\n After rotation: ");
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i] + " ");
    }
}
}