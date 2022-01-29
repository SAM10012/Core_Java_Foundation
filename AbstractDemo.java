abstract class A{
    abstract void callme();
    void callmeout()
    {
        System.out.println("This is a concrete method");
    }
}
    class B extends A{
        void callme()
        {
            System.out.println("B's implementation of method callme");
        }
    }

class AbstractDemo
{
    public static void main(String args[])
    {
        B b = new B();
        b.callme();// Will print "B's implementation of method callme"
        b.callmeout();// Will print "This is a concrete method"
    }
}