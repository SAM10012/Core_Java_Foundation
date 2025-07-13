import java.util.*;

class Left_Rotation_Of_1D_Array
{
    public static int[] Rotate_Left(int[] arr, int n, int d)
    {
        for(int j=0;j<d;j++)
        {
            int temp = arr[0];
            for(int i=1;i<n;i++)
            {
                arr[i-1] = arr[i];
            }
            arr[n-1] = temp;
        }
        return arr;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] rotated_array = Rotate_Left(arr,n,d);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}