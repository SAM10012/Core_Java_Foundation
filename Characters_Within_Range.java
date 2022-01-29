import java.util.*;
public class Characters_Within_Range
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] arr = input.split(",");
		int n1 = Integer.parseInt(arr[1]);
		int n2 = Integer.parseInt(arr[2]);
		if(n1 >=1 && n2<=100 && n1 < n2 && n2 < arr[0].length())
			System.out.println(input.substring(n1,n2+1));
		else
			System.out.println("Invalid");

	}
}