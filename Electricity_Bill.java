import java.util.*;
public class Electricity_Bill
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
       
		if(p >= 1 && p <= 25 )
			System.out.println("$" + 1.25*p);
		else if(p >= 26 && p<=50)
			System.out.println("$" + 1.45*p);
        else if(p >= 51 && p<=75)
			System.out.println("$" + 1.65*p);
        else if(p >= 30 && p<50)
			System.out.println("$8");
        else if(p >= 76 && p<=95)
			System.out.println("$" + 1.95*p);
        else if(p > 95)
			System.out.println("$" + 2.00*p);
	}
}