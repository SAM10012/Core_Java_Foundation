import java.util.*;
public class Test10 {
	public static void main(String s[]) {
		int[] employeesSalary = { 1350, 2342, 6754, 1200, 1363 };
		int count = 0;
		for (int salary : employeesSalary) {
			switch (salary % 2) {
			default:
				employeesSalary[count] = salary + 1;
			case 0:
				employeesSalary[count] = salary + 1;
				count++;
			case 1:
				employeesSalary[count] = salary + 1;
				break;
			}
		}
		for (int i = 0; i < employeesSalary.length; i++) {
			System.out.print(employeesSalary[i] + " ");
		}
	}
}
 