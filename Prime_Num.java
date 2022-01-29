import java.util.*;
import java.lang.Math;

public class Prime_Num
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter upto what no. the prime no.s will continue: ");
	int n = sc.nextInt();
	System.out.println("The prime no.s are as follows: ");
	System.out.print(" 2 ");
	for(int i = 3;i<n;i++)
	{
		int flag=1;
		for(int j=2;j<i;j++)
		{			
			if(i%j == 0)
			{
			flag = 0;
			break;	
			}
			
		}
			if(flag==1)
			{
			System.out.print(i+" ");	
			}
			
	
	}
	}
}