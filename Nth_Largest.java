import java.util.*;
public class Nth_Largest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++)
        {
            num[i] = sc.nextInt();
        }

        //Bubble Sort
        for(int j=0;j<n-1;j++)
        {
            for(int k=0;k<n-j-1;k++)
            {
                if(num[k] > num[k+1])
                {
                    int temp = num[k];
                    num[k] = num[k+1];
                    num[k+1] = temp;
                }
            }
        }
        
        
            System.out.println(num[n-largest]);
        
    }
}