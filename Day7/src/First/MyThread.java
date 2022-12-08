package First;

public class MyThread implements Runnable{
    public static void main(String[] args) {
        MyThread a=new MyThread();
        Thread t1=new Thread(a);
        Thread t2=new Thread(a);


        t1.start();
        t2.start();
        t1.setName("Karthi");
        t2.setName("IT");
        System.out.println("Thread t1:"+t1.getName());
        System.out.println("Thread t2:"+t2.getName());

    }

    @Override
    public void run() {
        System.out.println("Hi "+Thread.currentThread().getName());
    }
}
