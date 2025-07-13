/*Write a function rotate(arr[], d, n) that right rotates arr[] of size n by d elements. 
  */

import java.util.*;
class One_Array_Is_Subset_Of_Another_Array
{ 
    public static int Is_a_Subset(int[] arr1,int n1, int[] arr2, int n2)
    {
        int flag = 0;
        for(int i=0;i<n2;i++)
        {
            
            for(int j=0;j<n1;j++)
            {
                if(arr2[i] == arr1[j])
                {
                    flag = 1;
                }
                
            }
            
        }
        if(flag == 0)
            return 0;
        else
        return 1;
            
            


        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        System.out.println();
        int[] arr1 = new int[n1];

        int n2 = sc.nextInt();
        System.out.println();
        int[] arr2 = new int[n2];

        System.out.println();
        for(int i=0;i<n1;i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println();
        for(int j=0;j<n2;j++)
        {
            arr2[j] = sc.nextInt();
        }

        System.out.println();
        int res = Is_a_Subset(arr1,n1,arr2,n2);
        if(res == 1)
        System.out.println("arr2 is a subset of arr1");
        else
        System.out.println("arr2 is not a subset of arr1");
        

        }
        
    }

