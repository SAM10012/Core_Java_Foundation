import java.util.*;
public class Common_Elements
{
    public static void main(String args[])
    {
       
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] arr = input.split("#");
        String[] A1 = arr[0].split(",");
        String[] A2 = arr[1].split(",");
        int max = (A1.length > A2.length) ? A1.length : A2.length;
        
        int count=0;
       for(int i=0;i<max;i++)
       {
          
               if(String.valueOf(arr[0]).contains(String.valueOf(A2[i])))
               {
                    count = count + 1;
                    
               }
              
       }
       System.out.println(count);
        
    }
}