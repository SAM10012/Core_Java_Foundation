import java.util.*;
public class Second_Most_Freq_Char
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String input = sc.nextLine();//I will find unique characters by replacing duplicate characters. That's why for finding frequency I will need a separate copy of the original string.
        String copy = new String(input);//Keeping a copy of the original string because I need to calculate frequency of the nique characters.
        String temp;
        StringBuilder new_input = new StringBuilder("");//For string the stringwith only the unique characters.

        for(int i=0; i<input.length() ; i++)
        {
            temp = String.valueOf(input.charAt(i));
            if(!(temp.equals(" ")))//To make sure blanks are not replaced with blanks again.
            {
            for(int j=0; j<input.length() ; j++)
            {
                if(temp.equals(String.valueOf(input.charAt(j))))//Here .equals() will check the contents of the string.
                {
                    input = input.replaceAll(temp," ");//Replacing with blanks and storing in input only.
                    new_input.append(temp);//Appending unique characters to the new string.
                    break;
                }
            }
        }
        }
        
        System.out.print("\nThe modified string after removing duplicate characters is : ");
        System.out.print(new_input);
        System.out.println();

        int count = 0;
        String[][] together = new String[2][new_input.length()];//Taking a 2D Array to -keep track of the frequencies of all the unique characters together with the characters.
        for(int i=0; i < new_input.length() ; i++)
        {
            together[0][i] = String.valueOf(new_input.charAt(i));//Putting the unique characters grom new_input to together row 1.
            for(int j=0 ; j < input.length() ; j++)
            {
                String temp2 = together[0][i];
                if(temp2.equals(String.valueOf(copy.charAt(j))))//Using string copy for counting frequency of the characters.
                {
                    count++;
                }
            }
            together[1][i] = String.valueOf(count);//Assigning the frequencies under corresponding unique character.
            count = 0;//Making count zero.
        }
        int[] comp_array = new int[new_input.length()];//For sorting purpose, copying the frequencies to a separate integer array.
        for(int i=0 ; i < new_input.length() ; i++)
        {
            comp_array[i] = Integer.parseInt(together[1][i]);
        }
        //Applying Bubble Sort
        for(int i=0;i<new_input.length()-1;i++)
		{
			for(int j=0;j<new_input.length()-i-1;j++)
			{
				if(comp_array[j] > comp_array[j+1])
				{
					int temp1=comp_array[j];
					comp_array[j]=comp_array[j+1];
					comp_array[j+1]=temp1;
				}
			}
		}
        int second_max_freq = comp_array[new_input.length() - 2];//Finding out the second maximum frequency.
        for(int i = 0; i < new_input.length() ; i++)
        {
            if(together[1][i].equals(String.valueOf(second_max_freq)))//Matching the second Maximum frequency with its corresponding character.
            {
                System.out.println(" The second most frequent character of the string is: " + together[0][i]);
                break;//Here, if two characters have same frequency, the 1st second most frequent character will be printed.
            }
        }

    }
}