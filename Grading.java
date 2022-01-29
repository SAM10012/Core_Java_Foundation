import java.util.*;
public class Grading
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		String ch = sc.nextLine();
        String[] arr = ch.split(",");
        int m = Integer.parseInt(arr[0]);
        int fm = Integer.parseInt(arr[1]);
        int p = (m * 100)/fm;
		if(p < 25 )
			System.out.println("F");
		else if(p >= 25 && p<45)
			System.out.println("E");
        else if(p >= 45 && p<50)
			System.out.println("D");
        else if(p >= 50 && p<60)
			System.out.println("C");
        else if(p >= 60 && p<80)
			System.out.println("B");
        else if(p >= 80)
			System.out.println("A");
	}
}