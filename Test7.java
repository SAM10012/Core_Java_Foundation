import java.util.*;
class Validator{
	public int[] studentId = { 101, 102, 103 };

	public void validateStudent(int id) {
		try {
			for (int index = 0; index <= studentId.length; index++) {
				if (id == studentId[index])
					System.out.println("P");
			}
		} finally {
			System.out.println("Q");
		}
	}
}

public class Test7 {
	public static void main(String[] args) {
		Validator validator = new Validator();
		try {
			validator.validateStudent(101);
			System.out.print("R");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("S");
		} finally {
			System.out.println("T");
		}
	}
}
 