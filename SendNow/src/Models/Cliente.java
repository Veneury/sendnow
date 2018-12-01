
package Models;

import Models.Conexion;
import Models.Personas;
import Views.AgreCL;
import Views.EliminarCL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Cliente extends Conexion {
    Conexion conex= new Conexion();
    
    

   
    public boolean Add(Personas per) {
      
        
        
        
        try{
         
          Connection con = null;
          con = getConexion();
          getConexion();
          
          
            ps= con.prepareStatement("INSERT INTO clientes (cedula, nombre, apellido, sexo, estado_civil, calle, barrio, sector, municipio, ciudad, estado, codigoPostal, pais, telefono, celular, correo)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, per.getCedula());
            ps.setString(2, per.getNombre());
            ps.setString(3, per.getApellido());
            ps.setString(4, per.getSexo());
            //conex.ps.setDate(5,Date.valueOf(S.txtFecha.getText()));
            ps.setString(5, per.getEstado_civil());
            ps.setString(6, per.getCalle());
            ps.setString(7, per.getBarrio());
            ps.setString(8, per.getSector());
            ps.setString(9, per.getMunicipio());
            ps.setString(10, per.getCiudad());
            ps.setString(11, per.getEstado());
            ps.setString(12, per.getCodigo_postal());
            ps.setString(13, per.getPais());
            ps.setString(14, per.getTelefono());
            ps.setString(15, per.getCelular());
            ps.setString(16, per.getCorreo());
            ps.execute();
            return true;
                
        }catch(Exception e){
        System.err.println(e);
        return false;
        }finally{
        try{
            con.close();
            
            
        }catch(SQLException e){
        System.err.println(e);
        }
        }
        
        
    }

   
    public void Wach() {
        
    }

   
    public boolean delete(Personas per ) {
        Connection con = null;
          con = getConexion();
          getConexion();
        
        try{
           con=conex.getConexion();
           conex.getConexion();
            
           conex.ps= con.prepareStatement("DELETE FROM clientes WHERE cedula=?");
           ps.setString(1, per.getCedula());
           
            return true;
                
        }catch(Exception e){
        System.err.println(e);
        return false;
        }finally{
        try{
            con.close();
            
            
        }catch(SQLException e){
        System.err.println(e);
        }
        }
    }

    public void Update() {
        
       
    }

    public void search() {
        
        
    }

    public void SendEmail() {
        
    }

   

   
    
    
}
    
    
    

