import java.util.*;

abstract class triangle
{
    abstract void type_of_triangle();
}
class Equilateral_triangle extends triangle
{
    public void type_of_triangle()
    {
        System.out.println(" 3 sides are equal ");
    }
}
class Isosceles_triangle extends triangle
{
    public void type_of_triangle()
    {
        System.out.println(" 2 sides are equal ");
    }
}
class Scalene_triangle extends triangle
{
    public void type_of_triangle()
    {
        System.out.println(" 3 sides are different ");
    }
}

public class triangle_demo
{
    public static void main(String args[])
    {
        Equilateral_triangle t1 = new Equilateral_triangle();
        Isosceles_triangle t2 = new Isosceles_triangle();
        Scalene_triangle t3 = new Scalene_triangle();
        t1.type_of_triangle();
        t2.type_of_triangle();
        t3.type_of_triangle();
    }
}