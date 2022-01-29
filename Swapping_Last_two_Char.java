import java.util.*;
public class Swapping_Last_two_Char
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] new_input = input.split("");
        if(input.length() >= 2)
        {
            String temp;
            temp = new_input[input.length()-1];
            new_input[input.length()-1] = new_input[input.length()-2];
            new_input[input.length()-2] = temp;
        }
        for(int i=0; i< new_input.length ; i++)
        {
            System.out.print(new_input[i]);
        }
        

    }
}