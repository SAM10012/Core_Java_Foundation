                                        /*BUBBLE SORT*/
import java.util.*;
public class bubble_sort_5
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
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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