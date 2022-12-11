package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public static String DB_URL="jdbc:mysql://localhost:3306/details";
    public static String USER="root";
    public static String PASSWORD="10041968";

    public static Connection get_connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
//            System.out.println(con);
            return con;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
