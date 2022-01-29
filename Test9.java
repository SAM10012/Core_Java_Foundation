import java.util.*;
public class Test9 {
	public static void main(String args[]) {
		String input1 = "warner";
		String input2 = new String("WARNER");
		input2.toLowerCase();
		if (input1 == input2) {
			System.out.println(" Welcome " + input1);
		} else if (input1.equals(input2)) {
			System.out.println(" Welcome " + input2);
		} else {
			System.out.println("Welcome");
		}
	}
}
 