package multiple;

interface social{
    public  void show();

}

interface social1{
    public void display();
}

class social_media implements social,social1{

    @Override
    public void show() {
        System.out.println("Facebook");

    }

    @Override
    public void display() {
        System.out.println("Instagram");

    }
}

public class example{
    public static void main(String[] args) {
        social_media a=new social_media();
        a.display();
        a.show();
    }
}