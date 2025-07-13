import java.util.*;
class Movie_Theatre_Discount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int tickets = sc.nextInt();

        if (tickets < 5 || tickets > 40)
        {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            System.exit(0);
        }
        //System.out.println();
        String ref = sc.nextLine();
        //System.out.println();
        String coupon = sc.nextLine();
        //System.out.println();
        String class = sc.nextLine();
        //System.out.println();
        double price = 0.0;
        if(class != "k" && class != "q")
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        
        if(class.equalsTo("k"))
        {
            price = tickets*75;
            if(ref == "y")
            {
                price = price + (tickets*50);
            }
            
        }
        else if(class == "q")
        {
            price = tickets*150;
            if(ref == "y")
            {
                price = price + (tickets*50);
            }
            
        }
        if(coupon == "y")
        {
            price = price - (.02 * price);
        }
        if(tickets > 20)
        {
            price = price - (0.1 * price);
        }
        System.out.println(String.format("%.2f",price));

    }
}