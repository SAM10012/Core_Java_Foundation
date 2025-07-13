/* def LargeSmallSum(arr)

The function takes an integral arr which is of the size or length of its arguments. Return the sum of the second smallest element at odd position ‘arr’ and the second largest element at the even position.

Assumption

Every array element is unique.
Array is 0 indexed.
Note:

If the array is empty, return 0.
If array length is 3 or <3, return 0.
 
Example

Input:
Arr: 3 2 1 7 5 4

Output:
7
 

Explanation

The second largest element at the even position is 3.
The second smallest element at the odd position is 4.
The output is 7 (3 + 4).
*/
import java.util.*;
public class accenture2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("The elements of the array are: ");
        System.out.println();

        if(arr.length <= 3)
        {
            System.out.println("0");
        }
        else
        {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        int[] odd = new int[n/2];
        int[] even = new int[n/2];
        // Taking elements in odd position in odd array
        for(int i=0,k=1;i < odd.length;i++)
        {
            odd[i] = arr[k];
            k += 2;
            //System.out.print("\n odd " + odd[1]);
        }
        // Taking elements in even position in even array
        for(int j=0,z=0;j<even.length;j++)
        {
            even[j] = arr[z];
            z += 2;
        }
        
        // Sorting odd array
        for(int i=0;i<odd.length-1;i++)
        {
            for(int j=i+1;j<odd.length;j++)
            {
                if(odd[j] < odd[i])
                {
                    int temp = odd[i];
                    odd[i] = odd[j];
                    odd[j] = temp;
                }
            }
        }
        int sec_small = odd[1];// 2nd smallest number

        // Sorting even array
        for(int i=0;i<even.length-1;i++)
        {
            for(int j=i+1;j<even.length;j++)
            {
                if(even[j] < even[i])
                {
                    int temp = even[i];
                    even[i] = even[j];
                    even[j] = temp;
                }
            }
        }


        
        int sec_large = even[even.length -2];// 2nd largest no.

        System.out.println("\nThe sum is: " + (sec_large+sec_small));
    }
    }
}