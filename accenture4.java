/* Perform the function: Int operationchoices(int c, int n, int a, int b). This function considers three positive inputs of a, b and c.
Execute the function to get:
(a + b), if c = 1
(a / b), if c = 4
(a – b), if c = 2
(a x b), if c = 3

Example:

Input:
a: 12
b: 16
c: 1

Output:
28

Explanation
C = 1, hence the function is (a + b). Hence, the output is 28.

Sample input:
a: 16
b: 20
c: 2

Sample output:
–4 */
import java.util.*;
public class accenture4
{
    public static void operationchoices(int c, int a, int b)
    {
        while(true)
        switch(c)
        {
            case 1:
            System.out.print(a+b);
            break;
            case 2:
            System.out.print(a-b);
            break;
            case 3:
            System.out.print(a*b);
            break;
            case 4:
            System.out.print(a/b);
            break;
            case 5:
            //System.out.print("Breaking out from the loop. ");
            break;
            default:
            System.out.print("Please enter from the choices 1,2,3,4. ");
            System.exit(0);

        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter c, a and b: ");
        int c = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        operationchoices(c,a,b);

    }
}