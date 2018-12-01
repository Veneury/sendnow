/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

   
/*private final String base = "sendnow";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    public Connection con = null;
    public PreparedStatement ps= null;
    
   
    
    public Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("Conexion establecida");
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
    }*/

