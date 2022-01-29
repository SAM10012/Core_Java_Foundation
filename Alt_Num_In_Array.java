import java.util.*;
public class Alt_Num_In_Array
{
    public static void main(String args[])
    {
        int[] final1 = new int[6];
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] arr = input.split("#");
        String[] A1 = arr[0].split(",");
        String[] A2 = arr[1].split(",");
        int j=0;
        for(int i=0; i<3 ;i++)
        {
            final1[j] = Integer.parseInt(A1[i]);
            j++;
            final1[j] = Integer.parseInt(A2[i]);
            j++;
        }
        System.out.print("[");
        for(int k=0;k<6;k++)
        {
            if(k==5)
                System.out.print(final1[k]);
            else
                System.out.print(final1[k] + ",");
        }
        System.out.print("]");
    }
}