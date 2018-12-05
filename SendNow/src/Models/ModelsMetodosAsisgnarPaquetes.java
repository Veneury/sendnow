/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Views.frmAsignarPaquetes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TooDe
 */
public class ModelsMetodosAsisgnarPaquetes extends ConexionMySQL {
   private Date fecha;

   public Date getFecha() {
      return fecha;
   }

   public void setFecha(Date fecha) {
      this.fecha = fecha;
   }
   
   Connection con = ConexionMySQL.getConnection();
   PreparedStatement ps = null;
   frmAsignarPaquetes asig = new frmAsignarPaquetes();
   public boolean asigpackage(ModelsPaquetes paquetes,Personas personas) {
      if (ConexionMySQL.getConnection() != null) {
         String sql = "INSERT INTO asignarpaquetes (id_paquete,id_cliente,fecha) VALUES(?,?,?)";

         try {
           
            ps = con.prepareStatement(sql);
            ps.setInt(1, paquetes.getId());
            ps.setInt(2, personas.getId());
            ps.setDate(3, new java.sql.Date(getFecha().getTime()));
            ps.execute();
            return true;
         } catch (SQLException ex) {
            Logger.getLogger(ModelsMetodosPaquetes.class.getName()).log(Level.SEVERE, null, ex);
         }

      }
      return false;

   }
   
   

   
}
   
