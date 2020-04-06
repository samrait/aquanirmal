package servlet;

import java.sql.Connection;
import java.sql.SQLException;

public class connectionClass
{
  public connectionClass() {}
  
  public Connection getConnection()
  {
    Connection con = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
    }
    catch (ClassNotFoundException e) {
      System.out.println("Where is your MySQL JDBC Driver?");
      e.printStackTrace();
      throw new RuntimeException(e.getMessage());
    } catch (SQLException e) {
      System.out.println("Connection Failed! Check output console");
      e.printStackTrace();
      throw new RuntimeException(e.getMessage());
    }
    return con;
  }
}