import java.util.*;
public class Attendance_Record
{
	static int countFreq(String pat, String txt) {       
        int M = pat.length();       
        int N = txt.length();       
        int res = 0;
 
        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) {
            /* For current index i, check for
        pattern match */
            int j;           
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
 
            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
            if (j == M) {               
                res++;               
                j = 0;               
            }           
        }       
        return res;       
}
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int count_a = 0;
		int count_l = 0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i) == 'A')
				count_a++;
		}

		 
        		String pat = "LL";       
        		//System.out.println(countFreq(pat, input));   
		if(count_a > 1 || countFreq(pat, input) > 2)
			System.out.println("False");
		else
			System.out.println("True");


	}
}