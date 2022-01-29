import java.util.*;
public class Diamond_pattern
{
	public static void main(String args[])
	{
		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int k=4; k>=1;k--)
		{
			for(int l = k;l>=1;l--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}