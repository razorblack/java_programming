import java.sql.*;

public class Program20 {
    public static void main(String[] args) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            Connection con = DriverManager.getConnection("jdbc:odbc:mydsn", "", "");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("Select * from Student order by RollNo asc");

            ResultSetMetaData rsMetaData = rs.getMetaData();
            int numberOfColumns = rsMetaData.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    if (i > 1) {
                        System.out.print(", ");
                    }
                    String columnValue = rs.getString(i);
                    System.out.print(columnValue);
                }
                System.out.println("");
            }
            st.close();
            con.close();
        } catch (Exception ex) {
            System.err.print("Exception: ");
            System.err.println(ex.getMessage());
        }
    }
}
