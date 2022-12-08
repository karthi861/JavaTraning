package demo;
import test.*;

class implementation implements inter{
    @Override
    public void print() {
        System.out.println("Monday");

    }

    @Override
    public void display() {
        System.out.println("Tuesday");
    }

    @Override
    public void show() {
        System.out.println("Wednesday");
    }
    public static void main(String[] args){
        implementation a=new implementation();
        a.print();
    }
}
