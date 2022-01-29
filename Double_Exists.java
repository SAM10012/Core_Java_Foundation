import java.util.*;
public class Double_Exists
{
    public static void main(String args[])
    {
       
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(",");
        int flag = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(input.contains(String.valueOf(2*Integer.parseInt(arr[i]))))
            {
                flag = 1;
                break;
            }
        }
        if(flag==1)
            System.out.println("True");
        else
            System.out.println("False");
       
    }
}