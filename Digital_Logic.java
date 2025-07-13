/* QUESTION
-------------
Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.

Constrains-

1<=N<=100

Example 1:

Input :

10  -> Integer

Output :

5    -> result- Integer

Explanation:

Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.*/import java.util.*;
class Digital_Logic
{
    public static StringBuilder Convert_To_Binary(int n)
    {
        
        int j=0,rem=0;
        StringBuilder arr = new StringBuilder("");
        while(n!=0)
        {
            rem = n%2;
            arr.append(String.valueOf(rem));
            j++;
            n=n/2;
        }
        return arr;
    }
    public static int Convert_To_Decimal(StringBuilder binary)
    {
       
        
        String one = binary.toString();
        //char[] arr1 = one.toCharArray();
        /*for(int i=0;i<one.length();i++)
        {
            System.out.println(arr1[i]);
        }*/
        int sum = 0;
        int j= one.length()-1;
            for(int i=0; i<one.length() ;i++)
            {
                int a = Integer.parseInt(String.valueOf(one.charAt(i)));
                //Math.pow(a,b) = a^b returns double
                //(int) - changing double datatype to int datatype
                sum = sum + a*((int)(Math.pow(2,j)));
                //System.out.print(sum + " " + a + " " +j+" ");
                j--;
                
                //System.out.println(sum);
            }
        
        return sum;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder binary = Convert_To_Binary(n);
        //System.out.println(binary);
        int decimal = Convert_To_Decimal(binary);
        System.out.println(decimal);
    }
}