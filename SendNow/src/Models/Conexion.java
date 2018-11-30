/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TooDe
 */
public class Conexion {
   // Propiedades
//Conexion
   private static Connection conn = null;
   private String driver;
   private String url;
   private String usuario;
   private String password;

   // Constructor
   private Conexion() {

      String url = "jdbc:mysql://localhost:3306/sendnow";
      String driver = "com.mysql.jdbc.Driver";
      String usuario = "root";
      String password = "";

      try {
         Class.forName(driver);
         conn = (Connection) DriverManager.getConnection(url, usuario, password);
      } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
         Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
      } finally {
         cerrarConexion();
      }
   } // Fin constructor

   // Métodos
   public static Connection getConnection() {

      if (conn == null) {
         new Conexion();
      }

      return conn;
   }

   public void cerrarConexion() {
      try {
         if (conn != null) {
            conn.close();

         }
      } catch (SQLException e) {

         Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
      }
   }
}
