class Thread1 extends Thread
{
    /*public void start()//Overriding start() Method
    {
        super.start();
        System.out.println("\n Wallahhh!");
    }*/
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("\n Child Thread");
        }
    }
}
    class ThreadDemo
    {
        public static void main(String args[])
        {
            Thread t1 = new Thread1();
            t1.start();
            for(int i=0; i<5; i++)
             {
            System.out.println("\n main Thread");
        }
        }
    }
