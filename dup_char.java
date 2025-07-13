import java.util.*;
public class dup_char
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder dup = new StringBuilder("");
        for(int i=0;i<input.length();i++)
        {
            int count = 1;
            for(int j=i+1;j<input.length();j++)
            {
                if(Character.compare(input.charAt(j),input.charAt(i))==0)
                {
                    count = count + 1;
                }
                if(count > 1)
                {
                    dup.append(String.valueOf(input.charAt(i)));
                    dup.append(" ");
                break;
                }
            }
        }
        System.out.println("The duplicate characters are: "+dup);
        
    }
}