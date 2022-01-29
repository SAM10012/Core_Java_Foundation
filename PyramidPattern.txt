import java.util.*;
public class PyramidPattern
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the no. of rows: ");
int r = sc.nextInt();
for(int row=1;row<=r;row++)
{
for(int col = 1;col<=5-row;col++)
{
System.out.print("  ");
}
for(int col = 1;col <=2*row-1; col++)
{
System.out.print("* ");
}
System.out.println("");
}
}
}