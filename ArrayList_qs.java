import java.util.*;
public class ArrayList_qs
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrli = new ArrayList<Integer>(5);
        for(int i=0;i<arrli.size();i++)
        {
            arrli.add(i);
        }
        System.out.println();
        System.out.print(arrli);
        /*arrli.add(6);
        arrli.remove(6);
        arrli.add(3,6);
        for(int i=0;i<arrli.size();i++)
        System.out.println(arrli.get(i));*/
    }
}