package models;
import Database.DB;
import handlers.UserHandler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class User {

    public static String getUsername() {
        return username;
    }

    public static String username;
    public static String password;

    public static void function()  {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your username : ");
        username= sc.next();
        System.out.print("Enter your password : ");
        password= sc.next();
        System.out.println();
        try
        {
            Connection con= DB.get_connection();
            Statement stmt=con.createStatement();
            String view = "SELECT * FROM Credentials WHERE Username='"+username+"' and Password='"+password+"'";
            ResultSet rs = stmt.executeQuery(view);

            if(rs.next()) {
                System.out.println("-------Welcome   "+username+"-------");
                System.out.println("\n********Your Details of shipment********\n");
                UserHandler.show_details();
            }else{
                System.out.println("Invalid Username or Password");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
