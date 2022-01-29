import java.util.*;
public class Test17 {
	public static void main(String[] args) {
		int num1 = -20;
		int num2 = -30;
		int num3 = 10;
		int num4 = -40;
		if (num1 + num2 >= num4) {
			if (num4 < num3) {
				if (num4 % num3 != 0) {
					System.out.println(1);
				} else {
					System.out.println(2);
				}
			}
		} else {
			if (num2 / num1 > 0) {
				if (num1 < num2 || num4 % num3 == 0) {
					System.out.println(3);
				} else {
					System.out.println(4);
				}
			}
		}
	}
}