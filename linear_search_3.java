import java.util.*;
public class linear_search_3
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int find = 7;
        int flag = 0;
        for(int i=0;i<5;i++)
        {
            if(arr[i] == find)
            {
                flag = 1;
                System.out.println(i);
            }
        }
        if(flag == 0)
        System.out.println("Not found!");
    }
}