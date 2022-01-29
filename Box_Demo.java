import java.util.*;

class Box
{
	double length, breadth, height, vol;
	Box() //non  parameterized constructor
	{
	length=0;
	breadth=0;
	height=0;
	}

	Box(double l, double b, double h) //all  parameterized constructor
	{
	length=l;
	breadth=b;
	height=h;
	}

	Box(double a) //one  parameterized constructor
	{
	length=a;
	breadth=a;
	height=a;
	}

	void volume()
	{
	vol = length*breadth*height;
	}

	void display()
	{
	System.out.println("\n Volume of the box: "+vol);
	}
}

class Box_Demo
{
	public static void main(String[] args)
		{
			Box mybox1 = new Box();//non-parameterised
			mybox1.length = 10;
			mybox1.breadth = 10;
			mybox1.height= 10;
		                 mybox1.volume();
			mybox1.display();

			Box mybox2 = new Box(15,15,15);//all parameterised
			mybox2.volume();
			mybox2.display();

			Box mybox3 = new Box(12);//one parameter
			mybox3.volume();
			mybox3.display();	
		}
}