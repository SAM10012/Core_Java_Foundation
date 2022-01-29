public class Replace1
{
	public static void main(String args[])
	{
		String s1= "Hello World Hello People";
		String s2 = "";
		for(int i =0; i < s1.length() ; i++)
		{
			char ch = s1.charAt(i);
			if(ch == 'l')
				s2 += 'L';//Replacing with L
			else
				s2 += ch;//Remaining same
		}
		System.out.println("After Replacement of l with L: " + s2 );
		
	}
}