import java.util.*;
public class Days
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		String ch = sc.nextLine();
		
		if(ch.equals("Monday") || ch.equals("Tuesday") || ch.equals("Wednesday") || ch.equals("Thursday") || ch.equals("Friday") )
			System.out.println("Weekday");
		else if(ch.equals("Saturday") || ch.equals("Sunday"))
			System.out.println("Weekend");
	}
}