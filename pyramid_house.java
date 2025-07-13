// Pyramid House
import java.util.*;
public class pyramid_house
{
    public static int count_the_cards(int lvl)
    {
        if(lvl == 0)
        return 0;
        else if(lvl ==1 )
        return 2;
        else
         return (lvl*2) + (lvl -1) + count_the_cards(lvl-1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of levels in the pyramid house: ");
        int n = sc.nextInt();
        int cards = count_the_cards(n);
        System.out.print("The no. of cards is: " + cards);
    }
}