package main.jdbc.ex.pgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BackwardForwardResultSetTraversingEx {

  public static void main(String[] args) throws ClassNotFoundException {
    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:ORCL";
    String username = "dev_user";
    String password = "devuser";
    String sql = "select EMPLOYEE_ID, EMPLOYEE_NAME from employee_details";
    Class.forName("oracle.jdbc.driver.OracleDriver");

    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery()) {

      // Move cursor to 1st row
      rs.absolute(2);
      System.out
          .println("EMPLOYEE_ID : " + rs.getInt("EMPLOYEE_ID") + " \tEMPLOYEE_NAME : " + rs.getString("EMPLOYEE_NAME"));

      // Move cursor to 4th row
      rs.absolute(4);
      System.out
          .println("EMPLOYEE_ID : " + rs.getInt("EMPLOYEE_ID") + " \tEMPLOYEE_NAME : " + rs.getString("EMPLOYEE_NAME"));

      // Move cursor to first row
      rs.first();
      System.out
          .println("EMPLOYEE_ID : " + rs.getInt("EMPLOYEE_ID") + " \tEMPLOYEE_NAME : " + rs.getString("EMPLOYEE_NAME"));

      // Move cursor to last row
      rs.last();
      System.out
          .println("EMPLOYEE_ID : " + rs.getInt("EMPLOYEE_ID") + " \tEMPLOYEE_NAME : " + rs.getString("EMPLOYEE_NAME"));

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
