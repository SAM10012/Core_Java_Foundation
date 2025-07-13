/* COGNIZANT QUESTION
------------------------
Problem Statement – Raj wants to know the maximum marks scored by him in each semester. The mark should be between 0 to 100 ,if goes beyond the range display “You have entered invalid mark.”

Sample Input 1:

Enter no of semester:
3

Enter no of subjects in 1 semester:
3

Enter no of subjects in 2 semester:
4

Enter no of subjects in 3 semester:
2

Marks obtained in semester 1:
50
60
70

Marks obtained in semester 2:
90
98
76
67

Marks obtained in semester 3:
89
76

 

Sample Output 1:

Maximum mark in 1 semester:70
Maximum mark in 2 semester:98
Maximum mark in 3 semester:89
Sample Input 2:

Enter no of semester:
3

Enter no of subjects in 1 semester:
3

Enter no of subjects in 2 semester:
4

Enter no of subjects in 3 semester:
2

Marks obtained in semester 1:
55
67
98

Marks obtained in semester 2:
67
-98

Sample Output 2:

You have entered invalid mark.*/

import java.util.*;
class Max_Sem_Marks
{
    public static void Find_Max_Marks(int[] marks,int n)
    {
        int max = marks[0];
        for(int k=0;k<n;k++)
        {
            if(marks[k] >= max)
            {
                max = marks[k];
            }
        }
        System.out.println(max);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sem[] = new int[n];
        for(int i=0;i<n;i++)
        {
            sem[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            int marks[] = new int[sem[i]];
            for(int j=0;j<sem[i];j++)
            {
                marks[j] = sc.nextInt();
            }
            Find_Max_Marks(marks,sem[i]);
        }
    }
}