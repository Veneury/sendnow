/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TooDe
 */
public class ModelsMetodosPaquetes {

   Connection con = ConexionMySQL.getConnection();
   PreparedStatement ps = null;
   //ConexionMySQL killer = new ConexionMySQL();

   public boolean addpackage(ModelsPaquetes paquetes) {

      PreparedStatement ps = null;
      if (ConexionMySQL.getConnection() != null) {
         String sql = "INSERT INTO paquetes (codigo_paquete,Tipo_paquete,nombre_paquetes,descripcion,peso,status) VALUES(?,?,?,?,?,?)";

         try {
            ps = con.prepareStatement(sql);
            ps.setString(1, paquetes.getCodigo());
            ps.setString(2, paquetes.getTipo());
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

   public boolean editpackage(ModelsPaquetes paquetes) {

      if (ConexionMySQL.getConnection() != null) {
         String sql = "UPDATE paquetes SET Tipo_paquete=?,nombre_paquetes=?,descripcion=?,peso=? WHERE codigo_paquete=?";

         try {
            ps = con.prepareStatement(sql);

            ps.setString(1, paquetes.getTipo());
            ps.setString(2, paquetes.getNombre());
            ps.setString(3, paquetes.getDescripcion());
            ps.setString(4, paquetes.getPeso());
            ps.setString(5, paquetes.getCodigo());
            ps.execute();
            return true;
         } catch (SQLException ex) {
            Logger.getLogger(ModelsMetodosPaquetes.class.getName()).log(Level.SEVERE, null, ex);
         }

      }
      return false;

   }

   public boolean search(ModelsPaquetes paquetes) {

      try {

         ResultSet resultSet = null;

         ps = con.prepareStatement("SELECT *FROM paquetes WHERE codigo_paquete=?");
         ps.setString(1, paquetes.getCodigo());
         resultSet = ps.executeQuery();

         if (resultSet.next()) {
            paquetes.setCodigo(resultSet.getString("codigo_paquete"));
            paquetes.setNombre(resultSet.getString("nombre_paquetes"));
            paquetes.setDescripcion(resultSet.getString("descripcion"));
            paquetes.setTipo(resultSet.getString("Tipo_paquete"));
            paquetes.setPeso(resultSet.getString("peso"));
            return true;

         }
      } catch (Exception e) {
         System.err.println(e);

      }
      return false;
   }

   public boolean delete(ModelsPaquetes paquetes) {
      String sql = "DELETE FROM paquetes WHERE codigo_paquete=?";

      try {
         ps = con.prepareStatement(sql);
         ps.setString(1, paquetes.getCodigo());
         ps.execute();
         return true;
      } catch (SQLException e) {
         System.err.println(e);
       
      }
        return false;
   }
}