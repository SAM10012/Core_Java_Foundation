import java.util.*;
public class Mobile_Number
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		if(input.length() == 10 )
			System.out.println("True");
		else
			System.out.println("False");
	}
}