import java.util.*;
public class Palin_String_Iteration
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();//Taking string
		StringBuilder back = new StringBuilder("");
		for(int i = s.length()-1 ; i>=0 ; i--)//From end appending characters to the new string iteratively
		{
			back.append(s.charAt(i));//Appending
		}
		
		if(((back.toString()).compareTo(s) == 0) || s.isEmpty())//If string is empty or two strings are equal
		{
			System.out.println(s+" is a palindrome! ");
		}
		else
		{
			System.out.println(s+" is not a palindrome.");
		}
	}
}