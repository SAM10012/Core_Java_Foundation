import java.util.*;
public class Binary_Rec_Search_5
{
    public static int bin_search(int low,int high,int[] arr,int data)
    {
        if(low<=high)
        {
        int mid = (low+high)/2;
        
        if(arr[mid] == data)
        return mid;
        else if(arr[mid] > data)
        {
            return bin_search(low,mid-1,arr,data);
            
        }
        else if(data > arr[mid])
        {
            return bin_search(mid+1,high,arr,data);
            
        }
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