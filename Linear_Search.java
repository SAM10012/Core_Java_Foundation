import java.util.*;

class Linear_Search
{
    // Time Complexity = O(n)
    public static int Linear_Search(int[] arr, int n, int k)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i] == k)
            {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int present = Linear_Search(arr,n,k);
        if(present == 1)
        {
            System.out.println(k + " is present in the array. ");
        }
        else
            System.out.println(k + " is present in the array. ");
        

    }
}