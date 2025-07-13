import java.util.*;

class Pair_Of_Elements_With_Equal_Difference
{
    public static int No_Of_Difference(int[] arr, int n, int d)
    {
        int count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]-arr[j] == d || arr[j]-arr[i] == d)
                {
                    count+=1;
                }
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i==j)
                {
                    System.exit(0);
                }
            }
        }
        int result = No_Of_Difference(arr,n,d);
        System.out.print(result+" ");
        
    }
}