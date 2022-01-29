import java.util.*;
public class Odd_or_Even
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input % 2 == 0 )
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}