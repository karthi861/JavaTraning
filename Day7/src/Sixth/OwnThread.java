package Sixth;

import java.util.ArrayList;
import java.util.List;

public class OwnThread {
    public static void main(String[] args) throws InterruptedException {
        Shop ab = new Shop();
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    ab.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ab.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}


class Shop {

    List<Integer> list = new ArrayList<>();
    public void produce() throws InterruptedException {

        int val = 0;
        while(true) {
            synchronized (this) {
                if(list.size() != 0)
                    this.wait();
                System.out.println("Produced : " + val);
                list.add(val++);
                notify();
                Thread.sleep(2000);
            }
        }
    }


    public void consume() throws InterruptedException {

        while(true) {
            synchronized (this) {
                if(list.size() == 0)
                    this.wait();
                System.out.println("Consumed : " + list.get(0));
                list.remove(0);
                notify();
                Thread.sleep(2000);
            }
        }
    }
}