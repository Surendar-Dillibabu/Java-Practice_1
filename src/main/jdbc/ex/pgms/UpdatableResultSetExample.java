package main.jdbc.ex.pgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdatableResultSetExample {

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

      // Update 2nd row
      // Move cursor to 2nd row
      rs.absolute(2);
      rs.updateString("EMPLOYEE_NAME", "David");
      rs.updateRow();

      System.out.println("EMPLOYEE_ID : " + rs.getInt("EMPLOYEE_ID") + " \tEMPLOYEE_NAME : " + rs.getString("EMPLOYEE_NAME"));

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
