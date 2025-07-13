/*Write a function rotate(arr[], d, n) that right rotates arr[] of size n by d elements. 
  */

import java.util.*;
class Right_Rotation_Array
{ 
    public static int[] rotate(int[] arr,int d, int n)
    {
        for(int i=0;i<d;i++)
        {
            int a = arr[n-1];
            for(int j=n-1;j>=1;j--)
            {
                arr[j] = arr[j-1];
            }
            arr[0] = a;
        }
        return arr;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        int[] result = new int[n];
        result = rotate(arr1,d,n);
        System.out.println();
        for(int p=0;p<n;p++)
        {
            System.out.print(result[p]+" ");
        }
        

        }
        
    }

