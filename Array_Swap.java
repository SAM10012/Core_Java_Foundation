import java.util.*;
public class Array_Swap
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
        for(int j=0;j<n/2;j++){
            int temp = array[j];
            array[j] = array[n-1-j];
            array[n-1-j] = temp;
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}