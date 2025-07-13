/*Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. For example, in an array A: 

Example : 

Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
Output: 3 
3 is an equilibrium index, because: 
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

Input: A[] = {1, 2, 3} 
Output: -1 
  */

import java.util.*;
class Equilibrium_Index
{ 
    public static int sum_of_left_values(int[] arr,int low, int high)
    {
        int sum = 0;
        for(int i=low;i<=high;i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static int sum_of_right_values(int[] arr,int low, int high)
    {
        int sum = 0;
        for(int i=low;i<=high;i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static int find_equilibrium_index(int[] arr,int n)
    {
        int low=0;
        int high = n-1;
        int mid = 0;
        while(low<high)
        {
            mid = (low+high)/2;
            int l_sum = sum_of_left_values(arr,low,mid-1);
            int r_sum = sum_of_right_values(arr,mid+1,n-1);
            if(l_sum == r_sum)
            return mid;
            else if(l_sum > r_sum)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return mid;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        int result = 0;
        result = find_equilibrium_index(arr1,n);
        System.out.println();
        System.out.print(result);
        
        

        }
        
    }

