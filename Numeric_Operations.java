import java.util.*;
public class Numeric_Operations
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int n = Integer.parseInt(String.valueOf(input.charAt(0)));
		if(input.length() > 1)
		{
			int sec = Integer.parseInt(String.valueOf(input.charAt(1)));
			if(sec%2 == 0 && sec%4 == 0)
				System.out.println("24");
			else if(sec%2 == 0)
				System.out.println("2");
			else if(sec%2 != 0)
				System.out.println("1");
		}
		else if(n >=1 && n < 10)
		{
			
			System.out.println(n*n);
		}

	}
}