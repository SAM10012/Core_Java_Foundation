import java.util.*;
public class Reverse_using_Recursion
{
	
	public static StringBuilder reverse(StringBuilder str)
	{
		return String.valueOf(str.charAt(str.length()-1))+ reverse(str.substring(0,str.length()-1));
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder revstr = new StringBuilder("");
		revstr.append(str);
		revstr = reverse(str);
		if(str.equals(revstr))
		System.out.println("It is a palindrome!!!");
		//System.out.println(revstr);
		
	}
}