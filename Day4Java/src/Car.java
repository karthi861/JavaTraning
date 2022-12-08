class Vehicle{
    final void print(){
        String name="Benz";
        System.out.println(name);
    }
    void show(){
        System.out.println("Benz is running");
    }
}

class Car extends Vehicle{

//    Over-riding final method.
//    final void print(){
//        System.out.println("Overridden method");
//    }

//    Over-riding non-final method.
    void show(){
        System.out.println("Benz is not running");
    }
    public static void main(String [] args){
        Car a=new Car();
//        a.print();
        a.show();


    }
}