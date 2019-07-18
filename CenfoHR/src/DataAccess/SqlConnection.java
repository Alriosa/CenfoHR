/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Alriosa
 */
public class SqlConnection {
  public void dbConnect(String db_connect_string,
            String db_userid,
            String db_password)
   {
      try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection conn = DriverManager.getConnection(db_connect_string,
                  db_userid, db_password);
         System.out.println("connected");
         Statement statement = conn.createStatement();
         String queryString = "select * from sysobjects where type='u'";
         ResultSet rs = statement.executeQuery(queryString);
         while (rs.next()) {
            System.out.println(rs.getString(1));
         }
      } catch (Exception e) {
          System.out.println("No conecto");
         e.printStackTrace();
      }
   }

   public static void main(String[] args)
   {
      SqlConnection connServer = new SqlConnection();
      connServer.dbConnect("jdbc:sqlserver://<DESKTOP-VTDKB1C>", "<user>",
               "<password>");
   }
}
