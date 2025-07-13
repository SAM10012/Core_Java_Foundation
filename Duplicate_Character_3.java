import java.util.*;
public class Duplicate_Character_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(String.valueOf(s.charAt(i)).equals(" ") == false)
                {
            char match = s.charAt(i);
            int count = 1;
            for(int j=i+1;j<s.length();j++)
            {
                
                    if(Character.compare(match,s.charAt(j))==0)
                    {
                        count++;
                        
                    }
                }
            
            if(count>1)
            {
                s.replaceAll(String.valueOf(match)," ");
                System.out.print(match + " appears "+count+ " times. \n");
            }
                }
        }
    }
}