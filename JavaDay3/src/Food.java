class Data{
    protected int a=10;

}


class Food {
    void display(){
        Data a=new Data();
        a.a=20;
        System.out.println(a.a);
    }

    public static void main(String[] args){
        Food b=new Food();
        b.display();
    }
}
