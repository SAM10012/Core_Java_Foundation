import java.util.*;
public class Seq_Removal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i =0;
		StringBuilder s1 = new StringBuilder("");
		while(i!=s.length())
		{
			if(i==2 || i==4 || i==8)
			{
			i++;
			continue;
			}
			else
			{
				s1.append(String.valueOf(s.charAt(i)));
			}
			i++;
		}
		System.out.println(s1);
	}
}