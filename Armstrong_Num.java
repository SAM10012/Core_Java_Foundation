import java.util.*;
public class Armstrong_Num
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		String ch = sc.nextLine();
        String[] arr = ch.split(",");
        int sum = 0;
        int num=0;
        for(int i=0;i<ch.length();i++)
        {
            num = Integer.parseInt(String.valueOf(ch.charAt(i)));
            sum = sum + (num*num*num);
        }
        if(Integer.parseInt(ch) == sum)
            System.out.println("true");
        else
             System.out.println("false");
	}
}