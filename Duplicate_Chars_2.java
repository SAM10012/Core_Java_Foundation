import java.util.*;
public class Duplicate_Chars_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println();
        for(int i=0;i<s.length();i++)
        {
            char c = ' ';
            int count = 1;
            if(Character.compare(s.charAt(i),' ')!=0)
            {
            for(int j=i+1;j<s.length();j++)
            {
                if(Character.compare(s.charAt(i),s.charAt(j))==0)
                {
                    c = s.charAt(i);
                    s.replaceAll(String.valueOf(s.charAt(i))," ");
                    count++;
                }
            }
            if(count > 1)
            {
                System.out.print(c+" ");
            }
        }}
    }
}