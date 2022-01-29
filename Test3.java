import java.util.*;
class Parent{
    public final void displayMessage() {
        System.out.println("displayMessage() method of Parent invoked");
    }
}

class Child extends Parent{
    public void displayMessage() {  
        System.out.println("displayMessage() method of Child invoked");
    }
}

public class Test3{
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.displayMessage();
    }
}