import java.util.*;
class Least_Discount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] details = new String[4];
        String[][] divide = new String[4][3];
        for(int i=0;i<4;i++)
        {
            details[i] = sc.nextLine();
            System.out.println();
            divide[i] = details[i].split(",");
            
            //details[i][3] = String.valueOf(Integer.parseInt(details[i][1]) * (Integer.parseInt(details[i][2])/100));
        }
        for(int h=0;h<4;h++)
        {
            for(int m=0;m<3;m++)
            {
                System.out.println(divide[h][m]);
            }
        }
        /*int[] discount = new int[n+1];
        for(int j=0;j<=n;j++)
        {
            System.out.println(",,,,,,,");
            discount[j] = Integer.parseInt(divide[j][1]) * (Integer.parseInt(divide[j][2])/100);
        }
        int min = discount[0];
        for(int k=0;k<n;k++)
        {
            if(discount[k] <= min)
            {
                min = discount[k];
            }
        }
        for(int l=0;l<n;l++)
        {
            if(String.valueOf(min).equals(divide[l][3]))
            {
                System.out.println(divide[l][0]);
            }
        }*/
    }
}