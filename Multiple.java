import java.util.*;
public class Multiple
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] arr = input.split(",");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		if(n%m == 0 )
			System.out.println("Is a multiple");
		else
			System.out.println("Is not a multiple");
	}
}