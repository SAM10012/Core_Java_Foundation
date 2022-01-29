import java.util.*;
public class Test16 {
	public static void main(String[] args) {
		int num1 = 2, num2 = 20;
		do {
			num2 = num2 / num1;
			if (num1 > num2) {
				break;
			}
			num2--;

		} while (++num1 < 5);

		System.out.println("num1 = " + num1 + " and num2 = " + num2);
	}
}
 