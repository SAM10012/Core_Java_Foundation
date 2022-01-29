import java.util.*;
public class Bonus
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		char p = sc.next().charAt(0);
       
		if(p == 'A')
			System.out.println("$5000");
		else if(p == 'B')
			System.out.println("$4500");
        else if(p == 'C')
			System.out.println("$3000");
        else if(p == 'D')
			System.out.println("$1500");
        else if(p == 'E')
			System.out.println("$500");
        
	}
}