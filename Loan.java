import java.util.*;
public class Loan
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input >= 40000 )
			System.out.println("Eligible");
		else
			System.out.println("Not Eligible");
	}
}