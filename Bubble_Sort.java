import java.util.*;
public class Bubble_Sort
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);

		// Taking the no. of elements from user
		System.out.print("Enter the no. of elements in the array: ");
		int n = sc.nextInt();
		int[] arr1 = new int[n]; //Array Initialization

		//Printing the no. of elements
		System.out.print(" Enter the elements of the array: ");
		for(int i=0; i <arr1.length ; i++)
		{
			arr1[i] = sc.nextInt();
		}
	

		//Printing Unsorted Array
		System.out.println("The array before sorting is as follows: ");
		for(int i=0; i <arr1.length ; i++)
		{
			System.out.print(" " + arr1[i]);
		}
		System.out.println();
		
		//Applying Bubble Sort
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=0;j<arr1.length-i-1;j++)
			{
				if(arr1[j]>arr1[j+1])
				{
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}
		}
		
		// Printing Sorted Array
		System.out.println("The sorted array is as follows: ");
		for(int i=0; i <arr1.length ; i++)
		{
			System.out.print(" " + arr1[i]);
		}
	}
}