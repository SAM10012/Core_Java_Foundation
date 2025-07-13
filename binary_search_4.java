import java.util.*;
public class binary_search_4
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int find = 2;
        int high = arr.length;
        int low = 0;
        int mid = 0;
        while(low<high)
        {
             mid = (low+high)/2;
            if(arr[mid] == find)
            {
            System.out.println(mid);
            break;
            }
            else if(find > arr[mid])
            {
                low = mid+1;
            }
            else if(find < arr[mid])
            {
                high = mid-1;
            }
        }
        
    }
}