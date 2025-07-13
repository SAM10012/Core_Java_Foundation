// Autobiographical Number
import java.util.*;
public class Autobiographical_Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // Number is taken as String
        System.out.print("Please enter the number: ");
        String num_str = sc.nextLine();
        // Converted to Character Array
        char[] char_arr = num_str.toCharArray();
        int[] num_arr = new int[num_str.length()];
        // Make an integer array
        for(int i=0;i<num_str.length();i++)
        {
            num_arr[i] = Character.getNumericValue(char_arr[i]);
        }
        // Print the Integer Array
        System.out.print("\nThe elements of the integer array are: ");
        for(int i=0;i<num_str.length();i++)
        {
            System.out.print(num_arr[i] + " ");
        }
        // Calculate the freq of natural no.s respectively in the given no.and store them in array freq sequentially.
        int[] freq = new int[num_str.length()];
        for(int k=0;k<num_str.length();k++)
        {
            int count = 0;
            for(int j=0;j<num_str.length();j++)
            {
                if(num_arr[j] == k)
                {
                    count++;
                }
            }
            freq[k] = count;
        }
        // Check whether the contents of given no. and that of the freq array are equal or not.
        // If equal => Autobiography Number else otherwise.
        int flag = 1;
        for(int i=0;i<num_str.length();i++)
        {
            if(num_arr[i] == freq[i])
            {
                flag = 0;
            }
            else{
                flag = 1;
                break;
            }
        }
        int real_count = 0;// No. of distinct digits in the Number.
        if(flag == 0)
        {
            for(int i=0;i<num_str.length();i++)
            {
                if(freq[i] != 0)// Finding those digits whose frequency is not zero in the user input.
                {
                    real_count++;
                }
            }
            System.out.print("\nIt is an Autobiographical Number.\nThe no. of distinct elements is: "+String.valueOf(real_count));
        }
        else
        {
            System.out.println("\nIt is not an Autobiographical Number.");
        }
    }
}