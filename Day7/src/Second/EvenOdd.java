package Second;

class Evennumbers extends Thread {
    public void run(int i)
    {
        if (i % 2 == 0)
        {
            System.out.println("Even thread " + i);
        }
    }
}

class Oddnumbers extends Thread {
    public void run(int i)
    {
        if (i % 2 != 0) {
            System.out.println("Odd thread " + i);
        }
    }
}

public class EvenOdd extends Thread
{
    public static void main(String[] args)
    {
        //odd numbers
        Oddnumbers t1 = new Oddnumbers();
        //even numbers
        Evennumbers t2 = new Evennumbers();
        for (int i = 1; i<=100; i++) {
            t1.run(i);
            t2.run(i);
        }
    }
}