import java.util.*;
import java.io.IOException;

class Tester
{

    public static double[] findDetails(double[] arr1)//Method findDetails() taking a double array as argument and its returntype is also a double array.
    {
		double[] avg_sal = new double[3];//Creating the array to be returned to main().
		double avg = 0;//double type variable avg calculates the average salary.
		for(int i=0; i<arr1.length ; i++)
		{
			avg = avg + arr1[i];//Calculating the sum of the salaries.
		}
		avg = avg/(arr1.length);//Calculating the average.
		double greater_count = 0;//greater_count variable keeps track of the number of salaries greater than the average salary.
		double lesser_count=0;//lesser_count variable keeps track of the number of salaries lesser than the average salary.
		for(int i=0; i<arr1.length ; i++)
		{
			if(arr1[i] > avg)
			{
				greater_count++;//Calculating the value of greater_count.
			}
			else if(arr1[i] < avg)
			{
				lesser_count++;//Calculating the value of lesser_count.
			}
		}
		//Assigning the values to their respective positions as per question
		avg_sal[0] = avg;
		avg_sal[1] = greater_count;
		avg_sal[2] = lesser_count;
		return avg_sal;//Returning double array.
    }
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter the salaries using comma: ");//Asking for user input.
		String input = sc.nextLine();//Taking user input.
		String[] str_salary = input.split(",");//Splitting the string at the positions of comma.
		double[] salary = new double[str_salary.length];//salary array of type double.
    
		for(int i=0; i<str_salary.length ; i++)
		{
			salary[i] = Double.parseDouble(str_salary[i]);//Converting the string values to double values.
		}
		double[] reqd_arr = findDetails(salary);//Passing salary to findDetails() method.

		System.out.println("\n{"+reqd_arr[0]+","+reqd_arr[1]+","+reqd_arr[2]+"}");//Specified output
		System.out.println("\nAverage Salary: "+reqd_arr[0]);
		System.out.println("Number of salaries greater than the average salary: "+reqd_arr[1]);
		System.out.println("Number of salaries lesser than the average salary: "+reqd_arr[2]);
		
    }

}