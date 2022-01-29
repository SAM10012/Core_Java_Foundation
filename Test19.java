import java.util.*;
public class Test19{
	public static void main(String[] args) {
		int num1 = 28;
		int num2 = 36;
		int num3 = 0;
		if (~(num2 / num1) < 0 && (num1 + num2) % 4 == 0) {
			num1 = num1 + --num3;
		}
		if ((num2 / num1) > 1 || num3 == 0) {
			num1 = num1 + num3++;
		    System.out.println(num1 + --num3);
		} else {
			System.out.println(num1 + --num3);
		}
	}
}
 