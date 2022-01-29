import java.util.*;
public class Rev_String
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder back = new StringBuilder("");
		for(int i = s.length()-1 ; i>=0 ; i--)
		{
			back.append(s.charAt(i));
		}
		
		System.out.println(back);
	}
}