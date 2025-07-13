/* There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.

 

Example 1:

Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.*/
import java.util.*;
public class candy
{
    public static int candy(int[] ratings) {

        int[] left = new int[ratings.length];
        Arrays.fill(left,1);
        int[] right = new int[ratings.length];
        Arrays.fill(right,1);
        int min_candies = 0;
        
        for(int i=1;i<ratings.length;i++)
        {
            if(ratings[i] > ratings[i-1])
            {
                left[i] = left[i-1] + 1;
            }
            
        }
        /*System.out.println();
        for(int i=0;i<left.length;i++)
        {
            System.out.print(left[i] + " ");
        }*/
        for(int i=ratings.length -2;i>=0;i--)
        {
            if(ratings[i] > ratings[i+1])
            {
                right[i] = right[i+1] + 1;
            }
        }

        /*for(int i=0;i<left.length;i++)
        {
            System.out.print(left[i] + " ");
        }
        System.out.println();
        for(int i=0;i<right.length;i++)
        {
            System.out.print(right[i] + " ");
        }*/

        for(int i=0;i<ratings.length;i++)
        {
            if(left[i] >= right[i])
            {
                min_candies += left[i];
            }
            else if(right[i] > left[i])
            {
                min_candies += right[i];
            }
        }
        
        return min_candies;
    }
    public static void main(String args[])
    {
        int[] ratings = {1,2,87,87,87,2,1};
        int ans = candy(ratings);
        System.out.print(ans);
    }
}