package main.jdbc.ex.pgms;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.internal.OracleTypes;

public class CallableStatementProcedureCursorEx {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    String jdbcURL = "jdbc:oracle:thin:@localhost:1521:ORCL";
    String userName = "dev_user";
    String password = "devuser";
    String sqlQuery = "{call PR_GET_ALL_EMPLOYEE_DETAILS(?)}";

    Class.forName("oracle.jdbc.driver.OracleDriver");

    try (Connection conn = DriverManager.getConnection(jdbcURL, userName, password);
        CallableStatement cstmt = conn.prepareCall(sqlQuery)) {

      // declaring the out param values
      cstmt.registerOutParameter(1, OracleTypes.CURSOR);

      // executing the query
      cstmt.execute();

      ResultSet rs = (ResultSet) cstmt.getObject(1);
      if (rs == null || rs.next() == false) {
        System.out.println("No records found in the database");
      } else {
        System.out.println("Employee details present in the database");
        do {
          System.out.println("Employee id :" + rs.getInt(1) + "\t\tEmployee name :" + rs.getString(2) + "\t\tsalary :"
              + rs.getInt(3) + "\t\tdeptId :" + rs.getInt(4) + "\t\tjoining date :" + rs.getDate(5));
        } while (rs.next());
      }
    }
  }
}
