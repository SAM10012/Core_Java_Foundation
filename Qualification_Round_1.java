import java.util.*;

class Qualification_Round_1
{
    public static StringBuilder Reverse(String input)
{
    StringBuilder rev = new StringBuilder("");
    for(int i= input.length()-1 ; i>=0 ; i--)
    {
        rev.append(String.valueOf(input.charAt(i)));
    }
    return rev;
}

public static String Sum(String a, StringBuilder b)
{
    int n1 = Integer.parseInt(a);
    int n2 = Integer.parseInt(String.valueOf(b));
    int sum = n1 + n2;
    String final_string = String.valueOf(sum);
    return final_string;
}

public static int ChkPalin(StringBuilder a, String b)
{
    if((String.valueOf(a)).compareTo(b) == 0)
    {
        return 1;
    }
    else{
        return 0;
    }
}

public static int Check_Again(String string1)
{
    
        int check1 = ChkPalin(Reverse(Sum(string1,Reverse(string1))),Sum(string1,Reverse(string1)));
        if( check1 == 1)
        {
            System.out.println(Sum(string1,Reverse(string1)));
            return 0;
        }
        else
        {
            Check_Again(Sum(string1,Reverse(string1)));
            return 0;
        
    }
}

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String user_input = sc.nextLine();
        int j = Check_Again(user_input);
        
    }
}
    


