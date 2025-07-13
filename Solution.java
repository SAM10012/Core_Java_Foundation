// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            int[] res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.length;ii++)
                System.out.print(res[ii] + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
         
        // Your code here
        int[] arr1 = new int[2];
       
        int flag = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i] + arr[j] + arr[k] == n)
                    {
                        arr1[0] = i+1;
                        arr1[1] = k+1;
                        flag = 1;
                       
                        return arr1;
                    }
                    break;
                }
                break;
            }
        }
        if(flag == 0)
        {
            arr1[0] = -1;
            
            return arr1;
        }
    
    }
}