package models;
import handlers.AdminHandler;
import java.util.Scanner;

public class Admin {
    public static Scanner sc=new Scanner(System.in);
    public static int option;
    public static boolean b=true;


    public static void admin_functions(){
        do{
            System.out.println("------SERVICES------\n 1.Update status of the shipment\n 2.View Detail of user ordered the product by customer id\n 3.Update  Shipment status by id\n 4.View Orders\n 5.View orders by customer id");
            System.out.println(":::::::Choose an option to continue:::::::");
            option=sc.nextInt();
            switch(option){
                case 1:
                    AdminHandler.update_status();
                    break;
                case 2:
                    AdminHandler.view_ordersbyid();
                    break;
                case 3:
                    AdminHandler.UpdateById();
                    break;
                case 4:
                    AdminHandler.DisplayOrders();
                    break;
                case 5:
                    AdminHandler.DisplayByCustomerID();
                    break;
                case 6:
                    AdminHandler.DisplayUserDetails();
                    break;
                case 7:
                    b=false;
                    System.out.println("-------***THANK YOU Visit Again***------");
            }
        }while (b);
    }
}
