import java.util.*;
public class Duplicate_Characters
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        
        System.out.println();
        for(int i=0;i<s.length();i++)
        {
            int flag = 0;
            for(int j=i+1;j<s.length();j++)
            {
                
                char c = '\0';
                if(Character.compare(arr[i],'\0')!=0)
                {
                if(Character.compare(arr[i],arr[j])==0)
                {
                    flag = 1;
                    c = arr[i];
                    arr[i] = '\0';
                    arr[j] = '\0';
                }
            }
            
            if(flag == 1)
            {
                System.out.print(c + " ");
            }
        }
    }
}
}