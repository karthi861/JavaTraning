package Fifth;

class Count {
    public void run() {
        for(int i = 1; i<=50; i++) {
            if (i%10==0) {
                System.out.println("Hello");
            } else {
                System.out.println(i);
            }}
    }
}



public class Counting {
    public static void main(String[] args) {
        Count c = new Count();
        c.run();
    }
}