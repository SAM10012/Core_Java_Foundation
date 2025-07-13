import java.util.*;
public class basic_binary_search
{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int low = 0;
        int high = n-1;
        int flag = 0;
        while(low<high)
        {
            
            int mid = (low+high)/2;
            if(data == arr[mid])
            {
                flag = 1;
                
                break;
            }
            else if(arr[mid]< data)
            {
                low = mid + 1;
            }
            else if(arr[mid] > data)
            {
                high = mid - 1;
            }
        }
        if(flag == 1)
        System.out.println("Data Found.");
        else
        System.out.println("Data Not Found.");
    }
}