public class Max_Min
{
	public static void main(String[] args)
	{	
		int[] arr1 = {-1,30,5,81,29,21,67,178,99,91}; //Array Initialization
		int temp = arr1[0];
		int max, min, max_index = 0,min_index = 0;
		
		System.out.println("The array is as follows: ");
		for(int i=0; i<arr1.length ; i++)
		{
			System.out.print(" " + arr1[i]);
		}
		System.out.println();
		
		//Calculating the Highest Value
		for(int i=0; i < arr1.length ; i++)
		{	
			if(arr1[i] > temp)
			{
				temp = arr1[i];
				max_index = i;
			}	
		}
		max = temp;
		System.out.println("The highest number is: " + max + " with index " + max_index);// Printing the max value

		//Calculating the Lowest Value
		for(int i=0; i < arr1.length ; i++)
		{	
			if(arr1[i] < temp)
			{
				temp = arr1[i];
				max_index = i;
			}	
		}
		min = temp;
		System.out.println("The lowest number is: " + min + " with index " + min_index);// Printing the min value
	}
}