// Given an integer sorted array and a number, find a pair in that array that sums up to that given number. Return that pair. Do it in linear time.
import java.util.*;
public class sum_of_pair
{
    public static int[] get_the_pair(int[] arr, int num)
    {
        int[] ret_arr = new int[2];
        int flag = 0;

        for(int i=0,j = arr.length -1 -i; i!=j; )
        {
            if(arr[i] + arr[j] == num)
            {
            flag = 1;
            ret_arr[0] = arr[i];
            ret_arr[1] = arr[j];
            break;
            }
            else if(arr[i] + arr[j] < num)
            {
                i++;
            }
            else if(arr[i] + arr[j] > num)
            {
                j--;
            }

        }
        if(flag == 1)
            return ret_arr;
            else
            {
                System.out.print("No such pair is found! Sorry!!");
                System.exit(0);
                return ret_arr;
            }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,4,5};
        int num = 8;
        //int num = 19; // Working perfectly. But if you don't give that return statement in  else portion it will get compilation error.
        int [] pair = get_the_pair(arr,num);
        System.out.print("The pair of integers in the array which sum to " + num + " is: " + pair[0] + "," + pair[1]);
    }
}