package third;
import java.util.InputMismatchException;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0;; i++) {
            try {
            System.out.println("Enter numerator: ");
            int num = sc.nextInt();
            System.out.println("Enter divisor: ");
            int div = sc.nextInt();
            System.out.println(num/div);

            }
            catch(ArithmeticException except){
                System.out.println("We can't divide by zero");
            }
            catch(NumberFormatException ex){
                System.out.println("Can't convert string into numeric");
            }
            catch (InputMismatchException e) {
                System.out.println(e);

                System.out.println("Invalid Input Data");
                break;
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        sc.close();
    }
}