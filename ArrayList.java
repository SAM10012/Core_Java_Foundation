import java.util.*;
public class ArrayList_qs
{
    public static void main(String[] args)
    {
        ArrayList<Integer> one = new ArrayList<Integer>(5);
        one.add(12);
        one.add(9);
        one.add(7);
        for(int i=0;i<3;i++)
        {
            System.out.println(one.get(i));
        }
    }
}