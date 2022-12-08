package counter;

class increment{
    public static int count=0;

    void add(){
        count++;
    }
}
public class example {
    public static void main(String [] args){
        increment a=new increment();
        increment b=new increment();

        a.add();
        b.add();
        System.out.println(increment.count);

    }
}
