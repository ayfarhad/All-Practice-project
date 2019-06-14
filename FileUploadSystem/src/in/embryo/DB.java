package in.embryo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class DB {

    static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    static String USERNAME = "bms";
    static String PASSWORD = "abcpass";// There is  password.

    public static Connection getConnection() {
        Connection con = null;
        try {
           // Class.forName("oracle.jdbc.driver.OracleDriver");
        	DriverManager.registerDriver(new OracleDriver());
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return con;
    }
}
