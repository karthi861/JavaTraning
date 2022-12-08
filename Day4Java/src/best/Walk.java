package best;
import last.*;

public class Walk extends Cycle{
    public static void main(String[] args) {
        Cycle a= new Cycle();

        //accessing protected method from Cycle.java
        a.run();
    }
}
