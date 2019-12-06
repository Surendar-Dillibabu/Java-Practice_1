package main.jdbc.ex.pgms;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementGetEx {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    String jdbcURL = "jdbc:oracle:thin:@localhost:1521:ORCL";
    String userName = "dev_user";
    String password = "devuser";
    int employeeId = 3;
    String sqlQuery = "{call PR_GET_EMPLOYEE_DET_BY_ID(?, ?, ?, ?, ?)}";

    Class.forName("oracle.jdbc.driver.OracleDriver");

    try (Connection conn = DriverManager.getConnection(jdbcURL, userName, password);
        CallableStatement cstmt = conn.prepareCall(sqlQuery)) {
      cstmt.setInt(1, employeeId);

      // declaring the out param values
      cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
      cstmt.registerOutParameter(3, java.sql.Types.NUMERIC);
      cstmt.registerOutParameter(4, java.sql.Types.NUMERIC);
      cstmt.registerOutParameter(5, java.sql.Types.DATE);

      // executing the query
      cstmt.execute();

      String employeeName = cstmt.getString(2);
      int salary = cstmt.getInt(3);
      int deptId = cstmt.getInt(4);
      Date date = cstmt.getDate(5);

      System.out.println("Employee details for the employee id :" + employeeId);
      System.out.println(
          "Employee name :" + employeeName + " salary :" + salary + " deptId :" + deptId + " joining date :" + date);
    }
  }
}
