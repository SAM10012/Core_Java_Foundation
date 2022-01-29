import java.util.*;
class A {
	public int var1;
	public int var2;

	public A(int value) {
		this.var1 = value;
	}

	public int method1() {
		return this.var2;
	}
}

class B extends A {
	public B() {
		super(10);
	}

	public int method1(int value1) {
		return this.var1;
	}
}

class C extends B {

	public C(int value1, int value2) {
		super();
		this.var2 = value2;
	}

	public void method1(int value1, int value2) {
		this.var2 = super.method1(value1);

	}
}

public class Test18 {
	public static void main(String args[]) {
		C obj= new C(5, 20);
		System.out.println(obj.method1(5) + obj.method1());

	}
}
 