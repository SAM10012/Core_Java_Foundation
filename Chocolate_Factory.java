import java.util.*;
/* QUESTION
-------------
A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

Example 1 :

N=7 and arr = [4,5,0,1.9,0,5,0].

There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

Input :

7  – Value of N

[4,5,0,1,0,0,5] – Element of arr[O] to arr[N-1],While input each element is separated by newline

Output:

4 5 1 9 5 0 0

Example 2:

Input:

6 — Value of N.

[6,0,1,8,0,2] – Element of arr[0] to arr[N-1], While input each element is separated by newline

Output:

6 1 8 2 0 0*/
class Chocolate_Factory
{
    public static void Sort_Conveyor_Belt(int n, int[] packet)
    {
        int[] new_conveyor_belt = new int[n];
        //System.out.println(new_conveyor_belt); Will give Garbage Value
        /*
        This will print 0 0 0 0 0 0
        for(int i=0;i<n;i++)
        {
        System.out.print(new_conveyor_belt[i]+" ");
        }*/
        //System.out.println();
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(packet[i] != 0)
            {
                new_conveyor_belt[j] = packet[i];
                j++;
            }
        }
        for(int i=0;i<n;i++)
        {
        System.out.print(new_conveyor_belt[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] packet = new int[n];
        int[] conveyor_belt = new int[n];
        for(int i=0; i<n ;i++)
        {
            packet[i] = sc.nextInt();
        }
        Sort_Conveyor_Belt(n,packet);
        
    }
}