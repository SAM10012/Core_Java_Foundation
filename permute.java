import java.util.*;
public class permute
{
    public static void permute_s(String s,String ans)
    {
        if(s.length() == 0)
        {
        System.out.println(ans + " ");
        return ;
        }
        
            for(int i=0;i<s.length();i++)
            {
                char ch = s.charAt(i);
                String ros = s.substring(0,i) + s.substring(i+1);

                permute_s(ros,ans+ch);
            }
        
    }
    public static void main(String[] args)
    {
        String s = "abb";
        permute_s(s,"");
    }
}