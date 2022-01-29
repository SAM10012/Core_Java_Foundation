import java.util.*;
public class Concat1
{
	public static void main(String args[])
	{
		String s1,s2;
 		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st string: ");
 		s1=sc.nextLine();//Taking first string
 		System.out.println("Enter the 2nd string: ");
 		s2=sc.nextLine();//Taking second string
   		System.out.println("Concatenated String is ");
   		System.out.println(s1+" "+s2);//Concatenating
	}
}