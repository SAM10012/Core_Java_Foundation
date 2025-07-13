import java.util.*;
public class Binary_Search_Recursion_3
{
    public static int Binary_search(int low,int high, int[] arr, int data)
    {
        if(low<high)
       {
        int mid = (low+high)/2;
        if(arr[mid] == data)
        return mid;
        else if(arr[mid] < data)
        
            return Binary_search(mid+1,high,arr,data);
        
        else if(arr[mid] > data)
        
            return Binary_search(low,mid - 1,arr,data);
        
        
        
       }
       return -1;
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
        int low = 0;
        int high = n;
       int k = Binary_search(low,high,arr,3);
       System.out.println("The position of the data is: "+k);
    }
}