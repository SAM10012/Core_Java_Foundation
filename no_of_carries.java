// No. of carries in a sum of numbers as strings.
import java.util.*;
public class no_of_carries
{
    public static int count_the_carry(int n1, int n2)
    {
        String s1 = Integer.toString(n1);
        String s2 = Integer.toString(n2);
        char[] num1 = s1.toCharArray();
        char[] num2 = s2.toCharArray();

        int i = num1.length -1;
        int j = num2.length - 1;

        String f = "";
        int carry = 0;
        int count = 0;

        while(i>=0 || j>=0)
        {
            if(i>=0 && j>=0)
            {
                f = f+ String.valueOf((char)(((int)num1[i] - 48 + (int)num2[j] - 48 + carry)%10 + 48));
                carry = ((int)num1[i] - 48 + (int)num2[j] - 48 + carry)/10 ;
                if(carry != 0)
                count++;

                i--;
                j--;
            }
            else if(i>=0 && j<0)
            {
                f = f+ String.valueOf((char)(((int)num1[i] - 48  + carry)%10 + 48));
                carry = ((int)num1[i] - 48  + carry)/10 ;
                if(carry != 0)
                count++;

                i--;
                
            }
            else if(i<0 && j>=0)
            {
                f = f+ String.valueOf((char)(((int)num2[j] - 48  + carry)%10 + 48));
                carry = ((int)num2[j] - 48  + carry)/10 ;
                if(carry != 0)
                count++;

                j--;
            }
        }
        if(carry !=0)
        f = f+ String.valueOf(carry);
        System.out.print("\n"+f);
        return count;


    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 and number 2: ");
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        int ans = count_the_carry(n1,n2);
        System.out.print("The no. of carries are: " + ans);
    }
}