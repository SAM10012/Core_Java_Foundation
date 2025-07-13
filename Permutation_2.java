import java.util.*;
public class Permutation_2
{
    public static void Permute(String s, String ans)
    {
        if(s.length() == 0)
        {
            System.out.println(ans + " ");
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            String ros = s.substring(0,i) + s.substring(i+1);
            Permute(ros,ch+ans);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Permute(s," ");
        
    }
}