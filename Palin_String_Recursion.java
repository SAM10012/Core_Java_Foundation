import java.util.*;
public class Palin_String_Recursion
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1 = sc.nextLine();
		boolean ans = Recur_String(str1);
		if(ans == true)
		System.out.println(str1 + "is a palindrome!");
		else
		System.out.println(str1 + "is not a palindrome!");
	}

	public static boolean Recur_String(String str)
	{
		if(str == "" || str.isEmpty())
		{
			return true;
		}
		else
		{
			return Recur_String( str.charAt(str.length() - 1) + str.substring(0,str.length() -1) );
		}
	}
}