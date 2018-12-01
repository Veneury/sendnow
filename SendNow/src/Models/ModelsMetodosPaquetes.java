/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TooDe
 */
public class ModelsMetodosPaquetes {
   ConexionMySQL killer = new ConexionMySQL();

   public boolean addpackage(ModelsPaquetes paquetes) {
      Connection con = killer.getConnection();

      PreparedStatement ps = null;
      if (killer.getConnection() != null) {
         String sql = "INSERT INTO paquetes (codigo_paquete,id_tipoP,nombre_paquetes,descripcion,peso,status) VALUES(?,?,?,?,?,?)";
       
         try {
            ps = con.prepareStatement(sql);
             ps.setString(1, paquetes.getCodigo());
            ps.setInt(2, paquetes.getTipo());
            ps.setString(3, paquetes.getNombre());
            ps.setString(4, paquetes.getDescripcion());
            ps.setString(5, paquetes.getPeso());
            ps.setString(6, "Recibido");
            ps.execute();
            return true;
         } catch (SQLException ex) {
            Logger.getLogger(ModelsMetodosPaquetes.class.getName()).log(Level.SEVERE, null, ex);
         }
           
            
       
      
         
      }
      return false;
   
   }

}
