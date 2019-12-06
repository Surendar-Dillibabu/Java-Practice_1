package main.jdbc.ex.pgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetUserDetails {

  public static void main(String args[]) throws ClassNotFoundException {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try (
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "dev_user", "devuser")) {      
      Statement stmt = conn.createStatement();

      // step4 execute query
      ResultSet rs = stmt.executeQuery("select * from employee_details");
      while (rs.next())
        System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

      // step5 close the connection object
      conn.close();

    } catch (SQLException se) {
      se.printStackTrace();
    }
  }
}
