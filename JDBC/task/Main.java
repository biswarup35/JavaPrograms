/**
 * Main
 */
import java.sql.*;
public class Main {
   public static void main(String[] args) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/the_teachers", "root", "");
        Statement stmt = con.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT * FROM teachers");
    
        while (resultSet.next()) { 
            System.out.println(resultSet.getInt(1)+ " "+ resultSet.getString(2)+ " "+resultSet.getString(3));
            con.close();
        }  

        
    } catch (Exception e) {
        System.out.println("Sql error :"+e.getMessage());
    }
}
    
}