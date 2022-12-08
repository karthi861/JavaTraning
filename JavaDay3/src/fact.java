import java.util.Scanner;
public class fact {
    public static int factorial(int n) {
        int result;
        if(n==1){
            return 1;
        }
        result= n*factorial(n-1);
        return result;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int data=factorial(n);
        System.out.println("Factorial of given number is:"+data);






    }
}
