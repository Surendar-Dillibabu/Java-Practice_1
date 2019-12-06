package main.jdbc.ex.pgms;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementInsertEx {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:ORCL";
    String username = "dev_user";
    String password = "devuser";
    String sql = "{call PR_INSERT_EMP_DETAILS(?, ?, ?, ?, ?)}";
    Class.forName("oracle.jdbc.driver.OracleDriver");
    long d = System.currentTimeMillis();
    Date date = new Date(d);

    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        CallableStatement cstmt = conn.prepareCall(sql);) {
      cstmt.setString(1, "Vasugi");
      cstmt.setInt(2, 10000);
      cstmt.setInt(3, 4);
      cstmt.setDate(4, date);

      // setting the out param before executing the procedure
      cstmt.registerOutParameter(5, java.sql.Types.NUMERIC);

      // executing the update
      cstmt.executeUpdate();

      int employeeId = cstmt.getInt(5);

      System.out.println("Employee id for the inserted employee details :" + employeeId);
    }
  }
}
