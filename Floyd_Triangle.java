import java.util.*;
public class Floyd_Triangle
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        for(int i=1,k=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k + " ");
                k=k+1;
            }
            System.out.println();
        }
		
	}
}