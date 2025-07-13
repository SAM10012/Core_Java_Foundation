/*QUESTION
------------
A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

Note :

RxC- Size of the matrix

Elements of the matrix M should be only 0 or 1.

Example 1:

Input :

3   -> Value of R(row)

3    -> value of C(column)

[0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line.

Output :

3  -> Row 3 has maximum number of 1’s

Example 2:

input :

4 -> Value of R(row)

3 -> Value of C(column)

[0 1 0 1 1 0 1 0 1 1 1 1] -> Elements of the array M[R][C]

Output :

4  -> Row 4 has maximum number of 1’s */
import java.util.*;
class Parking_Lot
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int[] count = new int[r];
        for(int i=0 ; i < r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j] == 1)
                {
                    count[i]+=1;
                }
            }
        }
        int temp=count[0];
        int index = 0;
        for(int i=0;i<r;i++)
        {
            if(count[i] >= temp)
            {
                temp = count[i];
                index = i;
            }
        }
        System.out.println(index+1);

    }
}