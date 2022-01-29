import java.util.*;
import java.lang.Math;
public class Area
{
		double base,height,radius;
		Area(double base, double height)//Overloading the constructor Area with 2 parameters for triangle
		{
			double area;
			this.base = base;//Using this keyword to initialize data mamber base with user input
			this.height = height;//Using this keyword to initialize data mamber height with user input
			
			
			area =  (base*height)/2;//Calculating Area of the triangle
			System.out.println("Area of the triangle is: " + area + " square unit");//Printing the Area
		}
		Area(double radius)//Overloading the constructor Area with 1 parameter for circle
		{
			double area;
			this.radius = radius;//Using this keyword to initialize data mamber radius with user input
			area = Math.PI * this.radius * this.radius;//Calculating Area of the Circle
			System.out.println("Area of the circle is: " + area + " square unit");//Printing the Area
		}
	
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.print("Enter the base: ");
			double base = sc.nextDouble();//Taking user input for base
			System.out.println();
			System.out.print("Enter the height: ");
			double height = sc.nextDouble();//Taking user input for height
			System.out.println();
			
			Area obj1 = new Area(base,height);//Creating object for triangle
			System.out.print("Enter the radius: ");
			double radius = sc.nextDouble();//Taking user input for radius
			System.out.println();
			Area obj2 = new Area(radius);//Creating object for Circle
		}
	
}