package Sixth;
import java.io.*;

public class sample{
    public void mth1() {

        mth2();

        System.out.println("caller");

    }



    public void mth2() {

        try {
           System.out.println(10/2);

//            return;

           System.exit(0);
            System.out.println("Divide by zero");



        } catch (Exception e) {

            System.out.println("catch-mth2");

        }

        finally {

            System.out.println("finally-mth2");

        }

    }



    public static void main(String[] args) {

        sample test = new sample();

        test.mth1();

    }



}