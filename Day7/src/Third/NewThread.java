package Third;

class Thread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Hello");
    }
}

class Thread2 extends Thread {

    @Override
    public void run() {
        System.out.println("QA Ace 2023");
    }
}



public class NewThread {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        for (int i = 0;; i++) {
            t1.run();
            t2.run();
        }
    }
}