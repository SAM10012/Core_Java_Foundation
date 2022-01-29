import java.util.*;
public class Red_Or_Black
{

    public static String Color(String input)
    {
        if(input.startsWith("red"))
        {
            return "red";
        }
        else if (input.startsWith("black"))
        {
            return "black";
        }
        else
        {
            return " ";
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = Color(input);
        System.out.println(output);
        

    }
}