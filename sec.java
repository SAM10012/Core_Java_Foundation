import java.util.*;
public class sec
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder new1 = new StringBuilder("");
        int first_pos = input.indexOf("e",0);
        int sec_pos = input.indexOf("e",first_pos+1);
        for(int i=0;i<input.length();i++)
        {
            if(i== sec_pos)
            new1.append("@");

            new1.append(String.valueOf(input.charAt(i)));
        }
        System.out.println(new1);
    }
}