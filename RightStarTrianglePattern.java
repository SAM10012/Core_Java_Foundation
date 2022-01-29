import java.util.*;
public class RightStarTrianglePattern
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the no. of rows: ");
int r = sc.nextInt();
for(int row=1;row<=r;row++)
{
for(int col = r-row;col>=1;col--)
{
System.out.print("  ");
}
for(int col = row;col >=1; col--)
{
System.out.print("* ");
}
System.out.println("");
}
}
}