import java.util.*;
public class String_Validation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		if(input.length() >= 3)
		{
			if(Character.isAlphabetic(input.charAt(1)) == true)
			{
				char ch = input.charAt(1);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
					System.out.println("Vowel");
				else
					System.out.println("Consonent");
			}
			else if(Character.isDigit(input.charAt(1)) == true)
			{
				System.out.println("Digit");
			}
		}
		else if(input.length() < 3)
		{
			System.out.println("Invalid");
		}

	}
}