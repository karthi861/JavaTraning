class A {

    //Constructor A declaration
    A() {
        System.out.println("Hi");


    }
}


    class B{

        //Constructor B
    B(){
        System.out.println("Hello");

    }
}

//class C Inheriting A
class C extends A{
    B a=new B();



    
}

public class construct{
    public static void main(String[] args) {
        C b=new C();
    }
}