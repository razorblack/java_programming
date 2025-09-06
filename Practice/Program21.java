import java.sql.*;

public class Program21 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver is loaded");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
            System.out.println("Connection is established");
            Statement stmt= con.createStatement();
            System.out.println("System object is created");
            // Query
            stmt.executeUpdate("create table stud (sid number(3), sname varchar2(30), sadd varchar2(30))");
            System.out.println("Table is created");
            con.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}