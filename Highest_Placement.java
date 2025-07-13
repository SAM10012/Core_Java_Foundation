/* COGNIZANT QUESTION
-----------------------
Problem Statement – FOE college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year. The departments that have participated in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot

Note : If any input is negative, the output should be “Input is Invalid”.  If all department has equal number of placements, the output should be “None of the department has got the highest placement”.

Sample Input 1:

Enter the no of students placed in CSE:90
Enter the no of students placed in ECE:45
Enter the no of students placed in MECH:70
Sample Output 1:

Highest placement
CSE

Sample Input 2:

Enter the no of students placed in CSE:55
Enter the no of students placed in ECE:85
Enter the no of students placed in MECH:85
Sample Output 2:

Highest placement
ECE

MECH

Sample Input 3:

Enter the no of students placed in CSE:0
Enter the no of students placed in ECE:0
Enter the no of students placed in MECH:0
Sample Output 3:

None of the department has got the highest placement
Sample Input 4:

Enter the no of students placed in CSE:10
Enter the no of students placed in ECE:-50
Enter the no of students placed in MECH:40
Sample Output 4:

Input is Invalid */

import java.util.*;
class Highest_Placement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int i=0;
        System.out.print("Enter the no of students placed in CSE:");
        arr[i] = sc.nextInt();
        i++;
        System.out.print("Enter the no of students placed in ECE:");
        arr[i] = sc.nextInt();
        i++;
        System.out.print("Enter the no of students placed in MECH:");
        arr[i] = sc.nextInt();
        i++;
        
        if((arr[0] == arr[1] && arr[0] == arr[2]) || arr[0] < 0 || arr[1] < 0 || arr[2] < 0)
        {
            System.out.println("Input is Invalid");
            System.exit(0);
        }
        int index = 0;
        int max = arr[0];
        //int now = 0;
        for(int j=0;j<3;j++)
        {   

            if(max <= arr[j])
            {
                max = arr[j];
                index =j;
            }
        }
        
        if(index==0)
        {
            System.out.println("CSE");
            //System.out.println("ECE");

        }
        else if(index==1)
        {
             System.out.println("ECE");
             //System.out.println("MECH");
        }
        else 
        {
             
        }

        if(arr[0]==arr[1] && arr[0] > arr[2])
        {
            System.out.println("CSE");
            System.out.println("ECE");
        }
        else if(arr[1]==arr[2] && arr[1] > arr[0])
        {
            
            System.out.println("ECE");
            System.out.println("MECH");
        }
        else if(arr[0]==arr[2] && arr[0] > arr[1])
        {
            
            System.out.println("CSE");
            System.out.println("MECH");
        }
        
    }
}