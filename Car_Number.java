/* COGNIZANT QUESTION
-----------------------
Problem Statement – Chaman planned to choose a four digit lucky number for his car. His lucky numbers are 3,5 and 7. Help him find the number, whose sum is divisible by  3 or 5 or 7. Provide a valid car number, Fails to provide a valid input then display that number is not a valid car number. 

Note : The input other than 4 digit positive number[includes negative and 0] is considered as invalid.

Refer the samples, to read and display the data.

Sample Input 1:

Enter the car no:1234
Sample Output 1:

Lucky Number
Sample Input 2:

Enter the car no:1214
Sample Output 2:

Sorry its not my lucky number
Sample Input 3:

Enter the car no:14
Sample Output 3:

14 is not a valid car number*/

import java.util.*;
class Car_Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        if(num.length() != 4 || Integer.parseInt(num) < 0)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int nummy = Integer.parseInt(num);
        if(num.charAt(num.length()-1) == '5' || num.charAt(num.length()-1) == '0')
        {
            System.out.println("Lucky Number");
        }
        int sum =0;
        for(int i=0;i<num.length();i++)
        {
            sum = sum + Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        if(sum % 3 == 0 ||  sum % 7 == 0)
        {
            
            System.out.println("Lucky Number");
        
        }
        else
        {
            System.out.println("Sorry it is not my Lucky Number");
        
        }
    }
}