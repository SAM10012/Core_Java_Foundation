/*Write a program using OOP methodology in any language to take 
valid input of Investor Name, 
Age, 
Gender, 
Investment Amount and 
Years of Investment and 
find out the Earned  interest amount based on the following
 Conditions: (a) The Compounded interest rate will be 6.75 percent Quarterly if the investment duration is less than 60 Months, else the interest rate will be 7.15 percent. 
 (b) If the compound interest is greater than Rs 10,000, deduct 1.15% from the earned interest 
 (c) If the Investor is a Senior Citizen,  0.5 percent additional interest will be added to the existing interest rate. 
 (d) If the investor is a female, 0.25 percent Additional interest will be added to the existing interest rate. 
 Note: Create separate functions for separate activities and follow OOPS concepts.
  Also, the code must be able to handle exceptions and validations should be there wherever applicable.*/
import java.util.*;
public class Question_One
{
    public static class Investor{
        String name;
        int age;
        char gender;
        double amt;
        int time;
        double earn_int;
    
    Investor(String name,
        int age,
        char gender,
        double amt,
        int time)
        {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.amt = amt;
            this.time = time;
            
        }

        public static double Calculate_Interest(double amt,int time,int age,char gender)
        {
            double ret;
            if(time < 60)
            {
                ret = (Math.pow((1 + 2.25/100),(time*3)/12) * amt) - amt;
            }
            else
            {
                ret = (Math.pow((1 + 2.38/100),(time*3)/12) * amt) - amt;
            }

            if(ret > 10000)
            {
                ret = ret - (1.15/100)* ret;
            }

            if(age >= 60)
            {
                ret = ret +(0.5/100)*ret;
            }

            if(Character.compare(gender,'F') == 0)
            {
                ret = ret +(0.25/100)*ret;
            }

            return ret;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("\n Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your gender: ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter your amount: ");
        double amt = sc.nextDouble();
        System.out.print("Enter your time in months: ");
        int time = sc.nextInt();

        Investor investor1 = new Investor(name,age,gender,amt,time);
        System.out.println("Your interest is: " + Calculate_Interest(amt,time,age,gender));

    }
}