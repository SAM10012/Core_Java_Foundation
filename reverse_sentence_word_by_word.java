//Reverse string word by word
import java.util.*;
public class reverse_sentence_word_by_word
{
    public static String Reverse_String(String str)
    {
        StringBuilder new_str = new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--)
        {
            new_str.append(String.valueOf(str.charAt(i)));
            
        }
        //System.out.println(new_str.toString());
        return new_str.toString();
    }
    public static String Reverse_Sentence(String[] arr)
    {
        String temp = new String("");
        for(int i=0;i<=arr.length/2;i++)
        {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return String.join(" ",arr);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = Reverse_String(arr[i]);
            //System.out.print("    6666666 ");
        }
        //System.out.print(Arrays.toString(arr));
        //System.out.print(String.join(" ",arr));
        String final_str = Reverse_Sentence(arr);
        System.out.print("The reversed string word by word is: " + final_str);
    }
}