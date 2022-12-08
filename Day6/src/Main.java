import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> Theatres=new ArrayList<>();
        Theatres.add("Sathyam");
        Theatres.add("AGS");
        Theatres.add("Murugan");
        Theatres.add("Rakki");

        ArrayList<String> Closed=new ArrayList<>();
        Closed.add("AGS");
        Closed.add("Sathyam");

        Theatres.removeAll(Closed);
        System.out.println(Theatres);
    }
}