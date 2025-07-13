/* 
Create a matrix and mention the elements in it. Now, divide the main matrix into two halves in such a way that the elements in index 0 are even, the elements in index 1 are odd, and so on.

Then arrange the values in ascending order for even and odd. After this, calculate the sum of the second largest numbers from both even and odd matrices.

Example
The size of the array is 5.
Element at 0 index: 3
Element at 1 index: 4
Element at 2 index: 1
Element at 3 index: 7
Element at 4 index: 9

Even array: 1,3,9
Odd array: 4,7*/
import java.util.*;
public class accenture6
{
    public static void main(String args[])
    {
        System.out.print("Enter the no. of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] even = new int[n/2+1];
        int[] odd = new int[n/2+1];
        int k = 0;
        int x = 0;
        for(int i=0;i<n;i++)
        {
            if(i%2 == 0)
            {
                even[k] = arr[i];
                k++;
            }
            else
            {
                odd[x] = arr[i];
                x++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        for(int i=0;i<odd.length;i++)
        {
            System.out.println(" ..." + odd[i]);
        }
        System.out.print("The sum is: " + (even[even.length - 2] + odd[odd.length - 2]));
    }
}