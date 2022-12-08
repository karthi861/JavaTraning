import java.util.Scanner;
class Student {
    public String name;
    public int rollno;


    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the Student");
        name = sc.nextLine();
        System.out.println("Enter rollno:");
        rollno = sc.nextInt();

    }
}

class exam extends Student{
    int mark1=90;
    int mark2=35;
    int mark3=55;
}

class result extends exam{
    double total_marks;
    void calculate(){
        total_marks=mark1+mark2+mark3;
        System.out.println("Total marks obtained:"+total_marks);
    }
}

public class Main {
    public static void main(String[] args){

        result sum=new result();
        sum.input();
        sum.calculate();
    }
}