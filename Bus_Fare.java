import java.util.*;
public class Bus_Fare
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
       
		if(p < 5 )
			System.out.println("$1");
		else if(p >= 5 && p<10)
			System.out.println("$2");
        else if(p >= 10 && p<30)
			System.out.println("$5");
        else if(p >= 30 && p<50)
			System.out.println("$8");
        else if(p >= 50 && p<80)
			System.out.println("$15");
        else if(p >= 80 && p<=100)
			System.out.println("$30");
	}
}