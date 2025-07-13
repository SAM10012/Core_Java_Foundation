import java.util.*;
public class replace_second_occurence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder replaced = new StringBuilder("");
        int first = s.indexOf('a',0);
        int second = s.indexOf('a',first+1);
        for(int i=0;i<s.length();i++)
        {
            if(i == second)
            {
                replaced.append("@");
            }
            else
            replaced.append(String.valueOf(s.charAt(i)));
        }
        System.out.println(replaced);
        
    }
}