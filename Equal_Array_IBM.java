import java.util.*;
public class Equal_Array_IBM
{
    public static void main(String[] args)
    {
        int[] A = {5,5,5};
        int[] B = {5,5,5};
        int n = 3;
        int flag = 0;
        for(int i=0;i<n;i++)
        {
            int val = A[i];
            int count1 = 1;
            
            for(int j = i+1;j<n;j++)
            {
                if(A[j] != -1  && A[j] == val)
                {
                    count1++;
                    A[j] = -1;
                }
            }
            int count2 = 0;
            for(int k=0;k<n;k++)
            {
                if(B[k] != -1 && val == B[k])
                {
                    count2++;
                    B[k] = -1;
                }
            }
            if(count1 == count2)
                flag = 1;
            else
                {
                    flag = 0;
                    break;
                }
        }
        if(flag == 1)
        System.out.println(" 1 ");
        else
        System.out.println(" 0 ");
    }

}