// Longest recurring sequence in string
import java.util.*;
public class longest_reoccurring_sequence
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //Take the string
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        //Find out the array containing all the substrings
        int val = (str.length() * (str.length() + 1))/2;//No. of substrings of a string of length n is (n*(n+1))/2

        String[] substrings = new String[val];
        int k=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j = i+1; j<=str.length();j++)
            {
                substrings[k] = str.substring(i,j);
                k++;
            }
        }
        //Print the array of substrings
        /*for(int i=0;i<val;i++)
        {
            System.out.println(substrings[i]);
        }*/

        // Make an array of substrings along with their frequencies
        // a 3 ab 2 aba 1 abac 1 abaca 1 abacab 1......
        //Make array freq_of_substrings[] of datatype String

        int kk=0;
        String[] freq_of_substrings = new String[2*val];
        for(int i=0;i<val;i++)
        {
            int count = 1;
            if(substrings[i] != " ")
            {
                for(int j=i+1;j<val;)
                {
                    if(substrings[j] != " ")
                    {
                    if((substrings[i]).equals(substrings[j]) == true)
                    {
                        count++;
                        //System.out.print(count + " ");
                        substrings[j] = " ";
                    }
                    else
                    {
                        j++;    
                    }
                }
                else
                {
                    j++;
                }
                }
                
                freq_of_substrings[kk] = substrings[i];
                kk++;
                freq_of_substrings[kk] = String.valueOf(count);
                kk++;

                
                
            }
            else
            {
                i++;
            }
        }

        //Print the array of freq_of_substrings
        /*for(int i=0;i<freq_of_substrings.length;i++)
        {
            System.out.print(freq_of_substrings[i] + " ");
        }*/



        //Finding the substring with max length and storing its details
        int max_length = 0;
        int occurrence = 0;
        String s = new String(" ");
        int flag = 0;
        for(int i=0;i<freq_of_substrings.length && freq_of_substrings[i] != null;i+=2)
        {
            if((freq_of_substrings[i]).length() > max_length  &&  Integer.parseInt(freq_of_substrings[i+1]) > 1  &&  freq_of_substrings[i].length() > 1)
            {
                max_length = (freq_of_substrings[i]).length();
                s = freq_of_substrings[i];
                occurrence = Integer.parseInt(freq_of_substrings[i+1]);
                flag = 1;
            }

        }
        if(flag == 0)
        System.out.print("\nThere is no such sequence");
        else
        System.out.print("\nThe longest reoccurring substring is: " + s +". It occurred " + occurrence + " times.");
    }

}
