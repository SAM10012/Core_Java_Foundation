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
        int p=1;
        for(int i=1; i<= y;i++)
        {
            
            p = p*x;
        }
        System.out.println(p);
	}
}