// Remove all White Spaces in a string
import java.util.*;
public class remove_White_Spaces
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String new_str = str.replaceAll("\\s+","");
        System.out.println("The string after removal of all the white spaces is: " + new_str);
    }
}