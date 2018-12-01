/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author TooDe
 */
public class MetodosPaquetes {
   
   public boolean addpackage(Paquetes paquetes)
   {
      PreparedStatement ps =null;
      Connection con = Conexion.getConnection();
      
      String sql="INSERT INTO paquetes (codigo,id_tipoP,nombre_paquetes,descripcion,peso,status) VALUES(?,?,?,?,?,?)";
      try {
         ps=con.prepareStatement(sql);
         ps.setString(1,"05879");
         ps.setInt(2, 1);
         ps.setString(3,"Tanque");
         ps.setString(4,"Este tanque es para mi madre");
         ps.setString(5,"30 Libras");
         ps.setString(6,"Recibido");
         ps.execute();
         return true;
         
                 
      } catch (SQLException e) {
             System.err.print(e);
            return false;
        
      }finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
   }
   
   
}
