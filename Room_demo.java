import java.util.*;

class Room
{
double height;
double length;
double breadth;

void set_value( double h, double l, double b)
{
height =h;
length=l;
breadth=b;
}

double volume()
{
return height*length*breadth;
}
}

class Room_demo
{
	public static void main(String[] args)
		{
			double h1,l1,b1;
			Scanner sc=new Scanner(System.in);  
			System.out.println("Please enter the height: ");
			h1= sc.nextDouble();
			System.out.println("Please enter the length: ");
			l1= sc.nextDouble();
			System.out.println("Please enter the breadth: ");
			b1= sc.nextDouble();

			Room myroom = new Room();
			myroom.set_value(h1,l1,b1);
			double vol;
			vol = myroom.volume();
			System.out.println("The volume of the room is :"+vol);
		}
}















