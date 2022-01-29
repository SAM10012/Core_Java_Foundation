import java.util.*;
public class Min_Sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(",");
        int[] int_arr = new int[4];
        for(int i=0;i<4;i++)
        {
            int_arr[i] = Integer.parseInt(arr[i]);
        }
        for(int i=0;i<4;i++)
		{
			for(int j=0;j<4-i-1;j++)
			{
				if(int_arr[j]>int_arr[j+1])
				{
					int temp=int_arr[j];
					int_arr[j]=int_arr[j+1];
					int_arr[j+1]=temp;
				}
			}
		}
        int sum = 0;
        for(int i=0;i<4-1;i++)
            sum = sum + int_arr[i];
        
        System.out.println(sum);
    }
}