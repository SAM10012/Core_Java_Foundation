public class Password_Generation
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringBuilder password = "";
		if(input.length() % 2 == 0)
		{
			password = input.charAt(input.length() - 1) + input.length() + "@" + input.charAt(0)+"654"+input.charAt(input.length() - 1);
		}
		else if(input.length() % 2 1= 0)
		{
			password = input.charAt(input.length() - 1) + input.length() + "1" + input.charAt(0)+"432"+input.charAt(input.length() - 1);
			
		}

	}
}