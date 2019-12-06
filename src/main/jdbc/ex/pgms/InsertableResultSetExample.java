package main.jdbc.ex.pgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertableResultSetExample {
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

      // Save the current cursor position, and move cursor to the insert row,
      rs.moveToInsertRow();
      // Set columns values
      rs.updateInt("EMPLOYEE_ID", 15);
      rs.updateString("EMPLOYEE_NAME", "Tom Hardy");
      // Insert new row
      rs.insertRow();

      // Move cursor back to saved position
      rs.moveToCurrentRow();
      
      System.out.println("Row inserted successfully");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
