/* COGNIZANT QUESTION
-----------------------
Problem Statement – Rhea Pandey’s teacher has asked her to prepare well for the lesson on seasons. When her teacher tells a month, she needs to say the season corresponding to that month. Write a program to solve the above task.

Spring – March to May,
Summer – June to August,
Autumn – September to November and,
Winter – December to February.
Month should be in the range 1 to 12.  If not the output should be “Invalid month”.

Sample Input 1:

Enter the month:11
Sample Output 1:

Season:Autumn
Sample Input 2:

Enter the month:13
Sample Output 2:

Invalid month*/
import java.util.*;
class Seasons
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month:");
        int input = sc.nextInt();
        if(input<1 || input>12)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.print("Season:");
        if(input >=3 && input <= 5)
        {
            System.out.print("Spring");
        }
        if(input >=6 && input <= 8)
        {
            System.out.print("Summer");
        }
        if(input >=9 && input <= 11)
        {
            System.out.print("Autumn");
        }
        if(input ==12 || input == 1 || input == 2)
        {
            System.out.print("Winter");
        }
    }
}