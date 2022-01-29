import java.util.*;
public class Insert_Element
{
    public static void main(String args[])
    {
       
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] arr = input.split("#");
        String[] A1 = arr[0].split(",");
       
        int[] int_arr = new int[A1.length + 1];
        int element = Integer.parseInt(arr[1]);
        int index = Integer.parseInt(arr[2]);
        
        for(int i=0;i<A1.length;i++)
        {
            int_arr[i] = Integer.parseInt(A1[i]);
            
        }
       

        for(int i=A1.length;i>=0;i--)
        {
            if(i > index)
            {
                int_arr[i]=int_arr[i-1];
                //break;
                //System.out.print("Testingggggg33333");
            }
            
        }
        int_arr[index]=element;
        
         for(int i=0;i<A1.length+1;i++)
        {
            if(i==A1.length)
                System.out.print(int_arr[i]);
            else
                System.out.print(int_arr[i]+",");

            
        }
    }
}