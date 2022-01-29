import java.util.*;
public class Rev_Num_Array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(",");
        int[] int_arr = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int_arr[i] = Integer.parseInt(arr[i]);
        }
        for(int i=0;i<=(arr.length/2);i++)
        {
           int temp = int_arr[i];
           int_arr[i] = int_arr[arr.length-1-i];
           int_arr[arr.length-1-i] = temp;

        }
        System.out.print("[");
        for(int j=0;j<arr.length;j++)
        {
            if(j==arr.length-1)
                System.out.print(int_arr[j]);
            else
                System.out.print(int_arr[j] + ",");
        }
        System.out.print("]");
       
    }
}