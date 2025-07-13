import java.util.*;
public class basic_binary_search_using_recursion
{
    public static int binary_search(int[] arr,int low, int high,int data)
    {
        
        if(high>=low)
        {
        int mid = (low+high)/2;
        
        if(arr[mid] == data)
        {
            return mid;
        }
        
         if(arr[mid] > data)
        {
            return binary_search(arr,low,mid-1,data);
        }
        else 
        {
            return binary_search(arr,mid+1,high,data);
        }
        }
        return -1;
    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int output = binary_search(arr,0, n-1,data);
        
       
        if(output ==-1)
        System.out.println("Data not found");
        else 
        System.out.println("Data found at index: "+output);

    }
}