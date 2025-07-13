import java.util.*;
public class punc_count
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            //Go for punctuations only otherwise have to check conditions
            //for letters, digits, inverted commas, special characters.
            if(Character.isLetter(str.charAt(i)) == false && Character.isDigit(str.charAt(i)) == false && str.charAt(i) != ' ')
            {
                count++;
            }
        }
        System.out.print("The no.of punctuations in the string is: "+ count);
    }
}