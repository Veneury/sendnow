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
  private static Connection con=null;
   public static Connection getConnection(){
      try{
         if( con == null ){
            String driver="com.mysql.jdbc.Driver"; //el driver varia segun la DB que usemos
            String url="jdbc:mysql://localhost/sendnow?autoReconnect=true";
            String pwd="";
            String usr="";
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url,usr,pwd);
            System.out.println("Conectionesfull");
         }
     }
     catch(ClassNotFoundException | SQLException ex){
        ex.printStackTrace();
     }
     return con;
   }   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Propiedades
//Conexion

   /* private static Connection conn = null;
    private final String base = "sendnow";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;

    // Constructor
    public Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(this.url, this.user, this.password);

        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    } // Fin constructor

    // Métodos
    public static Connection getConnection() {

        if (conn == null) {
            new Conexion();
            System.out.println("Conexion bien jjjj");
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
    }*/
}