import java.util.*;
public class Array_Swap_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        //int temp = 0;
        for(int i=0;i<n/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}