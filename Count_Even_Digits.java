import java.util.*;
public class Count_Even_Digits
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int flag = 0;
		String digits = s.replaceAll("[^02468]"," ");
		StringBuilder finalstr = new StringBuilder("");
		for(int i=0;i<digits.length();i++)
		{
			if(Character.isDigit(digits.charAt(i)))
			{
			finalstr.append(String.valueOf(digits.charAt(i)));
			flag = 1;
			}
		}
		if(flag == 0)
			System.out.println("-1");
		else
			System.out.println(finalstr);
		
	}
}