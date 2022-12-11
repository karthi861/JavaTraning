package handlers;

import Database.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AdminHandler {
    public static Scanner sc=new Scanner(System.in);
    public static int ShipmentId;
    public static int Customer_id;
    public static String status;


    //      update status of shipment
    public static void update_status(){
        try{
            Connection con=DB.get_connection();
            Statement stmt=con.createStatement();
            System.out.println("----Provide Shipment status as Y or N----");
            status=sc.next();
            if(status.equalsIgnoreCase("Y")){
                stmt.execute("UPDATE ShipmentDetails SET ShipmentStatus = 'Y' WHERE UserId=2");
            }else if(status.equalsIgnoreCase("N")){
                stmt.execute("UPDATE ShipmentDetails SET ShipmentStatus = 'N' WHERE UserId=2");
            }else{
                System.out.println("Invalid input...!");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    //      update status of shipment by its id
    public static void UpdateById(){
        try
        {
            Connection con=DB.get_connection();
            Statement stmt=con.createStatement();
            System.out.println("-----Enter the ShipmentId------");
            ShipmentId=sc.nextInt();
            System.out.println("----Provide Shipment status as Y or N----");
            status=sc.next();
            if(status.equalsIgnoreCase("Y")){
                stmt.execute("UPDATE ShipmentDetails SET ShipmentStatus = 'Y' WHERE ShipmentId="+ShipmentId);
                System.out.println("Updated Successfully");
            }else if(status.equalsIgnoreCase("N")){
                stmt.execute("UPDATE ShipmentDetails SET ShipmentStatus = 'N' WHERE ShipmentId="+ShipmentId);
                System.out.println("Updated Successfully");
            }else{
                System.out.println("Invalid input...!");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void view_ordersbyid(){
        try
        {
            Connection con=DB.get_connection();
            Statement stmt=con.createStatement();
            System.out.println("-----Enter the CustomerId------");
            Customer_id=sc.nextInt();
            String view_details="SELECT Orders.OrderId,Orders.OrderNumber,Orders.OrderName,User.Name,User.Address,User.Mobile FROM Orders INNER JOIN User ON Orders.UserId=User.UserId WHERE User.UserId='"+Customer_id+"'";
            ResultSet rs=stmt.executeQuery(view_details);
            while(rs.next()){
                System.out.println("OrderId\t\tOrderName\t\tName\t\tMobile");
                System.out.println(rs.getString("OrderId")+"\t\t\t"+rs.getString("OrderName")+"\t"+rs.getString("Name")+"\t\t"+rs.getString("Mobile"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

//    View orders by customer id
   public static void DisplayUserDetails(){
       try
       {
           Connection con=DB.get_connection();
           Statement stmt=con.createStatement();
           System.out.println("-----Enter the ShipmentId------");
           ShipmentId=sc.nextInt();
           String Update_id="UPDATE ShipmentDetails SET ShipmentStatus = 'N' WHERE ShipmentId='"+ShipmentId+"'";
           stmt.execute(Update_id);
       }
       catch(Exception e){
           System.out.println(e);
       }
    }

    //      view list of orders
    public static void DisplayOrders(){
        try
        {
            Connection con=DB.get_connection();
            Statement stmt=con.createStatement();
            String order_details="SELECT * FROM Orders";
            ResultSet rs=stmt.executeQuery(order_details);
            while(rs.next()){
                System.out.println("OderId\t\tOrderNumber\t\tOrderName\t\t\t\tUserId\t\t");
                System.out.println(rs.getString("OrderId")+"\t\t\t" +rs.getString("OrderNumber")+"\t\t\t\t"+rs.getString("OrderName")+"\t\t\t"+rs.getString("UserId"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    //      view list of orders by customer by using customer_id
    public static void DisplayByCustomerID()  {
        try
        {
            Connection con=DB.get_connection();
            Statement stmt=con.createStatement();
            System.out.println("Enter Customer id:");
            Customer_id=sc.nextInt();
            String order_detailer="SELECT  OrderId,OrderNumber,OrderName FROM Orders WHERE UserId='"+Customer_id+"'";
            ResultSet rs=stmt.executeQuery(order_detailer);
            while (rs.next()){
                System.out.println("OrderId\t\tOrderNumber\t\t\tOrderName\t\t");
                System.out.println(rs.getString("OrderId")+"\t\t\t" +rs.getString("OrderNumber")+"\t\t\t\t\t"+rs.getString("OrderName"));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }


}
