package custom;

//creating my custom exception
public class DifferentColor extends Exception{
    String color;

    DifferentColor(String color2){
        color=color2;

    }
//toString method to throw some msg
//    public String toString(){
//        return ("Exception Color =  "+color) ;
//    }
//
//
//
}




class main{
    public static void main(String[] args) {
        try{
            throw new DifferentColor("Red");
        }
        catch (DifferentColor e) {
            System.out.println(e);

        }

    }
}
