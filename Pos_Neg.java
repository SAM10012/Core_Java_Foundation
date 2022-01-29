import java.util.*;
public class Pos_Neg
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
        
		if(ch > 0 )
			System.out.println("Positive");
		else if(ch < 0 )
			System.out.println("Negative");
	}
}