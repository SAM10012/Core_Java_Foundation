import java.util.*;
public class Number_series
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] sep = s.split(",");
		int d1 = Integer.parseInt(sep[0]);
		int d2 = Integer.parseInt(sep[1]);
		int r1 = Integer.parseInt(sep[2]);
		int r2 = Integer.parseInt(sep[3]);
		System.out.println();
		for(int i=r1; i<=r2;i++)
		{
			if(i%d1 == 0 && i%d2 == 0)
			System.out.print(i + ",");
		}
	}
}