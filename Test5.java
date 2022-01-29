import java.util.*;
public class Calculator{
    private int add(int num1, int num2){
        return num1+num2;
    }   
}

public class Test5{
    public static void main(String args[]) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(1,2));
	}
}