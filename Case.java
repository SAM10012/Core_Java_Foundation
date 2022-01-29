import java.util.*;
public class Poverty_Line
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		if(ch > 6250 )
			System.out.println("Above Poverty Line");
		else 
			System.out.println("Below Poverty Line");
	}
}