
import java.util.*;

public class Discount
{
	public static void main(String[] args)
	{
		int pay;
		Scanner sc=new Scanner(System.in);  
		System.out.println("Please enter the balance: ");
		int balance= sc.nextInt();  

		if(balance >= 50000)
		{
			pay = 50000 -((15*50000)/100);
			System.out.println("After 15% discount, the payable amount is Rs." + pay);
		}

		else if(balance >= 25000)
		{
			pay = 50000 -((10*50000)/100);
			System.out.println("After 10% discount, the payable amount is Rs." + pay);
		}

		else if(balance >= 10000)
		{
			pay = 50000 -((5*50000)/100);
			System.out.println("After 5% discount, the payable amount is Rs." + pay);
		}

		else if(balance >= 5000)
		{
			pay = 50000 -((2*50000)/100);
			System.out.println("After 2% discount, the payable amount is Rs." + pay);
		}

		else if(balance < 5000)
		{
			System.out.println("There is no discount available, the payable amount is Rs." + balance);
		}
	}
	}