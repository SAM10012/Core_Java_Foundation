import java.util.*;
class Dishes
{
    public static int Get_Type_Of_Dish(int n,int[] arr)
    {
        /*HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();   
        for (int j = 0; j < arr.length; j++) {   
            hashmap.put(arr[j], j);   
        }   
        System.out.println(hashmap.keySet());   
        return 0;*/
        int k=0;
        int new_arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            int count = 0;
            for(int j=0;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            if(count == 1)
            {
                new_arr[k] = arr[i];
                k++;
            }
        }
        int[] count1 = new int[k];
        int l=0;
        for(int m=0;m<n;m++)
        {
            int temp = new_arr[m];
            if(arr[m] == temp)
            {
                if(arr[m-1] != temp && arr[m+1] != temp)
                {
                    count1[l] += 1;
                    l+=1;
                }

            }
            else if(arr[m-1] != temp && arr[m+1] == temp)
            {
                    count1[l] += 1;
                    l+=1;
            }
            
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        
        while(test_case!=0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            int type = Get_Type_Of_Dish(n,arr);
            System.out.println(type);
        }
        
    }
}