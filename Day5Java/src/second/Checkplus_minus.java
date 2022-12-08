package second;
import java.util.InputMismatchException;
import java.util.Scanner;

class Checkplus_minus extends RuntimeException{

}

class check{
    int num;

    check(){}

    check(int num){
        if(num<0){
            throw new Checkplus_minus();
        }else {
            this.num=num;
        }
    }

    public void check_number(){
        if(this.num>0){
            System.out.println("Positive number");

        }else  {
            System.out.println("Negative number");
        }
    }
}

class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        check a=new check();
        try{
            a=new check(sc.nextInt());
            a.check_number();

        }catch (InputMismatchException e){
            System.out.println("Invalid data");
        }
        catch(Checkplus_minus except){
            System.out.println("Number cannot be negative");
        }
        catch(Exception e){
            System.out.println(e);
        }

        sc.close();

    }

}
