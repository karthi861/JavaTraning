package Fourth;
public class sample extends Thread
{
    public void run()
    {
        System.out.println("Running");
    }
    public static void main(String args[])
    {
        sample t1=new sample();
        t1.start();
        t1.start();
    }
}