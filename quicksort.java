/*----------------------------------------QUICK SORT------------------------------------------- */
import java.util.*;
public class quicksort
{
    
    public static int[] quick_sort(int[] arr,int n)
    {
        
        int j=0;
        int i = j-1;
        while(j>i)
        {
            int pivot = arr[n-1];
            if(arr[j] <= pivot)
            {
                i++;
                int temp = i;
                i=j;
                j=temp;
                j++;
            }
            else
            {
                j++;
            }
        }
        return arr;
    }
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
        int[] new_arr = quick_sort(arr,n);
        System.out.println("After Sorting: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(new_arr[i] + " ");
        }
    }
}