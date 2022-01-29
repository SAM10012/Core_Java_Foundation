import java.util.*;
class Figure 
{
    double dim1;
    double dim2;
    void area(double dim1,double dim2)//Method area() to be overriden
    {
        
    }
}
class Rectangle extends Figure{
    void area(double dim1,double dim2)//area() method of Figure class is overriden
    {
        System.out.print("\n The area of the Rectangle is: "+ dim1*dim2 +" square units.\n");
        
    }
}
class Triangle extends Figure{
    void area(double dim1,double dim2)//area() method of Figure class is overriden
    {
        System.out.print("\n The area of the Rectangle is: "+0.5*dim1*dim2+" square units.\n");
        
    }

}
class Geometry
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //Taking user inputs
        System.out.print("\n Enter length of the Rectangle (in units): ");
        double length = sc.nextDouble();
        System.out.print("\n Enter breadth of the Rectangle (in units): ");
        double breadth = sc.nextDouble();
        Rectangle rectangle = new Rectangle();
        rectangle.area(length,breadth);

        System.out.print("\n Enter base of the Triangle (in units): ");
        double base = sc.nextDouble();
        System.out.print("\n Enter height of the Triangle (in units): ");
        double height = sc.nextDouble();
        Triangle triangle = new Triangle();
        triangle.area(base,height);
    }
}