import java.util.*;
public class Count
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        int count = 0;
        for(int j=0;j<n;j++)
        {
            int flag = 0;
            for(int k=0;k<j;k++)
            {
                if(array[k] > array[j])
                {
                flag = 1;
                break;
                }
            }
            if(flag == 0)
            {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}