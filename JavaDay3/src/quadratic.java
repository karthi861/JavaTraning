import java.lang.Math;
class Calculatefunc{

    public int a;
    public int b;
    public int c;

    Calculatefunc(){

        a=1;
        b=1;
        c=1;
    }


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    Calculatefunc(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;


    }


    public double compute(int x){
        double f=a*Math.pow(x,2)+Math.multiplyExact(b,x)+c;
        return f;

    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
}
public class quadratic {
    public static void main(String[] args){
        Calculatefunc input=new Calculatefunc(1,2,3);
        System.out.println(input.compute(2));
//        input.setA(2);
//        input.setB(3);
//        input.setC(4);
//        System.out.println("a:"+input.getA());
//        System.out.println("b:"+input.getB());
//        System.out.println("c:"+input.getC());
//        System.out.println(input.compute(2));






    }
}
