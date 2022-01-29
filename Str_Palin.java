import java.lang.*;
public class Str_Palin
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string: ");
	String str = sc.nextLine();
	if((str.reverse()).compareTo(str) == 0)
	System.out.println(str + " is a palindrome!");
	else
	System.out.println(str + " is not a palindrome!");

	}
}