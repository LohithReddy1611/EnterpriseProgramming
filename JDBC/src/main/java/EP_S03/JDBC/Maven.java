package EP_S03.JDBC;
import java.sql.*;

public class Maven {






    public static void main(String[] args) throws Exception {
        Driver drv = new oracle.jdbc.driver.OracleDriver();
        DriverManager.registerDriver(drv);

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1634");

        Statement stmt = con.createStatement();
        stmt.executeUpdate("CREATE TABLE employee11 (" +
                           "eid INT PRIMARY KEY, " +
                           "ename VARCHAR(50), " +
                           "esalary DECIMAL(10, 2)" +
                           ")");
        stmt.executeUpdate("INSERT INTO employee (ename, eid, esalary) VALUES ('sai ram', 12, 1222)");
        
        System.out.println("Table created");
        con.close();
    }
}