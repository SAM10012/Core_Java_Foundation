import java.util.*;

interface triangle//interface
{
     void type_of_triangle();//abstract and public by default
}
class Equilateral_triangle implements triangle
{
    public void type_of_triangle()//overriding
    {
        System.out.println(" 3 sides are equal ");
    }
}
class Isosceles_triangle implements triangle
{
    public void type_of_triangle()//overriding
    {
        System.out.println(" 2 sides are equal ");
    }
}
class Scalene_triangle implements triangle
{
    public void type_of_triangle()//overriding
    {
        System.out.println(" 3 sides are different ");
    }
}

public class triangle_interface_demo
{
    public static void main(String args[])
	{
        //Creating a reference of interface
        //And using that reference to create objects of all the classes
		triangle obj = new Equilateral_triangle();
        obj.type_of_triangle();
		obj = new Isosceles_triangle();
		obj.type_of_triangle();
		obj = new Scalene_triangle();
		obj.type_of_triangle();
}
}