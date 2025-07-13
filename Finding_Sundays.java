import java.util.*;
public Finding_Sundays
{
    public static int No_of_Sunday(String day,int n,String[] days)
    {
        for(int i=0;i<n;i++)
        {
            if(days[i] == day)
            {
                for(int j=i+1;j<n;j++)
            }
        }
    }
    public static void main(String args[])
    {
        String[] week = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int n = sc.nextInt();
        int sundays = No_of_Sunday(day,n,days);
        System.out.println(sundays);
    }
}