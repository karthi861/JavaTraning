package Eight;

 class Fibonacci extends Thread {

    public void run() {

        try {
            int n1 = 0, n2 = 1, n3, count = 10;
            System.out.print(n1 + " " + n2);
            for (int i = 2; i < count; ++i) {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



class Reverse extends Thread {
        public void run() {
            try {
                System.out.println("\t\nReverse is: ");
                System.out.println();
                for (int i = 10; i >= 1; i--) {
                    System.out.print(i + "  ");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public class FibonacciReverse {

        public static void main(String[] args) {

            try {
                Fibonacci a = new Fibonacci();
                a.start();
                a.sleep(1000);
                Reverse b=new Reverse();
                b.start();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


