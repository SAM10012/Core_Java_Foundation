import java.util.*;
public class Binary_Search_5
{
    public static int bin_search(int low,int high,int[] arr,int data)
    {
        while(low<=high)
       {
        int mid = (low+high)/2;
        if(arr[mid] == data)
        return mid;
        else if(arr[mid] < data)
        
            low = mid+1;
        
        else if(arr[mid] > data)
        
            high = mid - 1;
        
        
        
       }
       return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {23,34,54,67,89};
        int data = 89;
        
        int pos = bin_search(0,5,arr,data);
        if(pos == -1)
        System.out.println("Data not found!");
        else
        System.out.println("Data found at position: "+pos);
    }
}