/* COGNIZANT QUESTION
-----------------------
Problem Statement – To speed up his composition of generating unpredictable rhythms, Blue Bandit wants the list of prime numbers available in a range of numbers.Can you help him out?

Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).

Note

Input 1 should be lesser than Input 2. Both the inputs should be positive. 
Range must always be greater than zero.
If any of the condition mentioned above fails, then display “Provide valid input”
Use a minimum of one for loop and one while loop
Sample Input 1:

2

15

Sample Output 1:

2 3 5 7 11 13

Sample Input 2:

8

5

Sample Output 2:

Provide valid input*/

import java.util.*;
class Prime_Range
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        if((input2 - input1) <= 0 || input1 < 0 || input2 < 0)
        {
            System.out.println("Provide valid input");
            System.exit(0);
        }
        for(int i=input1;i<=input2;i++)
        {
            int j=2;
            int flag = 1;
            while(j<i)
            {
                if(i%j == 0)
                {
                    flag = 0;
                    break;
                }
                j++;
            }
            if(flag == 1)
            {
                System.out.print(" "+i+" ");
            }
        }
    }
}