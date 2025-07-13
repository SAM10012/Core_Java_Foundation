                                        /*SELECTION SORT*/
import java.util.*;
public class selection_sort_5
{
    public static void main(String[] args)
    {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}