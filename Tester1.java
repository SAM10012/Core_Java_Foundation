class Base{
    private int fun(){
        return 0;
    }
    public int run(){
        return 3;
    }
}
class Derived extends Base{
    private int fun()
    {
        return 1;
    }
    public int run()
    {
        return fun();
    }
}
class Derived1 extends Derived{
    public int fun()
    {
        return 2;
    }
}
class Tester1{
    public static void main(String args[]){
        Base baseRef = new Derived1();
        System.out.println(baseRef.run());
    }
}