import java.util.*;
public class rev
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder rev = new StringBuilder("");
        for(int i=input.length()-1;i>=0;i--)
        {
            rev.append(String.valueOf(input.charAt(i)));
        }
        System.out.println(rev);
    }
}