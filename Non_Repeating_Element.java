/*Find the first non-repeating element in a given array of integers.

Examples:

Input : -1 2 -1 3 2
Output : 3
Explanation : The first number that does not 
repeat is : 3

Input : 9 4 9 6 7 4
Output : 6 */

import java.util.*;
class Non_Repeating_Element
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int num = 0;
        for(int j=0;j<n;j++)
        {
            int count = 0;
            for(int k=0;k<n;k++)
            {
                if(arr[j] == arr[k])
                {
                    count = count + 1;
                }
            }
            if(count==1)
            {
                num = arr[j];
                break;
            }

        }
        System.out.println("The first non-repeating number is: "+num);
    }
}