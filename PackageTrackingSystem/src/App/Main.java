package App;
import models.Admin;
import models.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
//        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("--------Welcome to Parcel Tracking System Application--------");
            System.out.println("Are you an admin?...Yes/No");
            String a=sc.nextLine();
            if(a.equalsIgnoreCase("Yes")){
                System.out.println(":::Enter Password to continue as Admin:::");
                String Password=sc.next();
                if(Password.equals("12345678")){
                    Admin.admin_functions();
                }
            }else if(a.equalsIgnoreCase("No")){
                System.out.println("-----Please login to continue as user------");
                User.function();
            }
//        }catch(Exception e){
//            System.out.println(e);
//        }
    }
}