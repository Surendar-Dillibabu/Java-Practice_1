package main.jdbc.ex.pgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteRowUsingResultSetExample {

  public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:ORCL";
    String username = "dev_user";
    String password = "devuser";
    String sql = "select EMPLOYEE_ID, EMPLOYEE_NAME from employee_details";
    Class.forName("oracle.jdbc.driver.OracleDriver");

    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery()) {

      // Move cursor to last row
      // Delete last row
      rs.last();
      rs.deleteRow();

      // Move cursor to 2nd row
      // Delete 2nd row
      rs.absolute(2);
      rs.deleteRow();

      // move the cursor and update the second row
      rs.absolute(2);
      rs.updateString("EMPLOYEE_NAME", "David");
      rs.updateRow();

      // Move cursor to before the first row.
      rs.beforeFirst();

      System.out.println("Employee details after deleting and updating the records :");
      while (rs.next()) {
        System.out.println(
            "EMPLOYEE_ID : " + rs.getInt("EMPLOYEE_ID") + " \tEMPLOYEE_NAME : " + rs.getString("EMPLOYEE_NAME"));
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
