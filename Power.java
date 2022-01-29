import java.util.*;
public class Power1
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		String ch = sc.nextLine();
        String[] arr = ch.split(",");
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        System.out.println(x^y);
	}
}