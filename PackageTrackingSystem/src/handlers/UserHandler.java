package handlers;

import Database.DB;

import java.sql.*;
import java.util.Scanner;

import static models.User.username;

public class UserHandler {
//    create multiple users and do
//    view details of shipment by entering customer_id
    public static int customer_id;
    public static Scanner sc=new Scanner(System.in);
    public static void show_details() throws Exception{

            Connection con= DB.get_connection();
            Statement stmt=con.createStatement();
            String query = "SELECT UserId FROM User WHERE Name = '"+username+"'";
//            String view = "SELECT ShipmentDetails.ShipmentId,ShipmentDetails.ShippedAt,ShipmentDetails.ShipmentStatus,User.Name FROM ShipmentDetails  INNER JOIN  User ON ShipmentDetails.UserId=User.UserId WHERE User.UserId=" + customer_id ;
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                customer_id=rs.getInt("UserId");
            }
            String view="SELECT ShipmentDetails.ShipmentId,ShipmentDetails.ShippedAt,ShipmentDetails.ShipmentStatus,User.Name FROM ShipmentDetails INNER JOIN User ON ShipmentDetails.UserId=User.UserId WHERE User.UserId="+customer_id;
            ResultSet rs1= stmt.executeQuery(view);
            while (rs1.next()) {
                System.out.println("ShipmentId----ShippedAt-----ShipmentStatus");
                System.out.println(rs1.getString("ShipmentId") + "\t\t\t" + rs1.getString("ShippedAt") + "\t\t" + rs1.getString("ShipmentStatus"));
            }

    }

}
