import java.util.*;
public class vowel
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			System.out.println("Vowel");
		else
			System.out.println("Not a vowel");
	}
}