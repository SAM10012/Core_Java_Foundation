import java.util.*;
public class vowel_consonant_count
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int count_v = 0;
        int count_c = 0;
        for(int i=0;i<str.length();i++)
        {
            
            if( str.charAt(i) != ' ')
            {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u')
                {
                    count_v++;
                }
                else
                {
                    count_c++;
                }
            }
        }
        System.out.print("The no.of vowels in the string is: "+ count_v);
        System.out.print("\nThe no.of consonants in the string is: "+ count_c);
    }
}