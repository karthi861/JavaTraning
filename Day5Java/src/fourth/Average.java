package fourth;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        for(int i=0;i<=10;i++){
            System.out.println("Enter numbers:");
            String str = sc.nextLine();

            try {

                int a = Integer.parseInt(str);

                total+= a;

            } catch (Exception e) {
                System.out.println("Invalid Input");

            }
        }
        System.out.println("Average: " + total/10);

        sc.close();
    }
}
