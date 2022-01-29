class Computation{
    public int add(int num1, int num2)
    {
        return num1+num2;
    }
    public int divide(int num1,int num2)
    {
        return num1/num2;
    }
}
public class Test Computation
{
    Computation comput = new Computation();
    @Test
    public void testAdd1()
    {
        int expected = 5;
        int actual = comput.add(2,3);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testAdd2()
    {
        int expected = 7;
        int actual = comput.add(2,5);
        Assert.assertEquals(expected,actual);
    }
}