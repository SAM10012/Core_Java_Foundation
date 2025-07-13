import java.util.*;
 class try
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = "hello";
        String b = "hello";
        char c = sc.next().chatAt(0);
        char d = 'd';
        if(a.equals(b))
        {
            System.out.println("Equal Strings");
        }
        if(a.compareTo(b) == 0)
        {
            System.out.println("Equal Strings");
        }
        if(Character.compare(c,d) == 0)
        {
            System.out.println("Equal Characters");
        }

    }
}