
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
        
        
        try{
          Connection con = null;
          con = getConexion();
          getConexion();
            
           ps= con.prepareStatement("DELETE FROM clientes WHERE cedula=?");
           ps.setString(1, per.getCedula());
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

    public boolean Update(Personas per) {
        
        
        try{
          Connection con = null;
          con = getConexion();
          getConexion();
          
           
          
            ps= con.prepareStatement("UPDATE clientes SET nombre=?, apellido=?, sexo=?, estado_civil=?, calle=?, barrio=?, sector=?, municipio=?, ciudad=?, estado=?, codigoPostal=?, pais=?, telefono=?, celular=?, correo=? WHERE Cedula=?");            ps.setString(1, per.getCedula());
            ps.setString(1, per.getNombre());
            ps.setString(2, per.getApellido());
            ps.setString(3, per.getSexo());
            //conex.ps.setDate(5,Date.valueOf(S.txtFecha.getText()));
            ps.setString(4, per.getEstado_civil());
            ps.setString(5, per.getCalle());
            ps.setString(6, per.getBarrio());
            ps.setString(7, per.getSector());
            ps.setString(8, per.getMunicipio());
            ps.setString(9, per.getCiudad());
            ps.setString(10, per.getEstado());
            ps.setString(11, per.getCodigo_postal());
            ps.setString(12, per.getPais());
            ps.setString(13, per.getTelefono());
            ps.setString(14, per.getCelular());
            ps.setString(15, per.getCorreo());
            ps.setString(16, per.getCedula());
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
    
    public boolean buscar(Personas per){
    
     try{
          Connection con = null;
          ResultSet klk= null;
          con = getConexion();
          getConexion();
          
           ps= con.prepareStatement("SELECT *FROM clientes WHERE Cedula=?");
           ps.setString(1, per.getCedula());
           klk = ps.executeQuery();
           
           if(klk.next())
           {
            per.setNombre(klk.getString("nombre"));
            per.setApellido(klk.getString("apellido"));
            per.setSexo(klk.getString("sexo"));
            //per.setFecha(klk.getString("fecha"));
            per.setEstado_civil(klk.getString("estado_civil"));
            per.setCalle(klk.getString("calle"));
            per.setBarrio(klk.getString("barrio"));
            per.setSector(klk.getString("sector"));
            per.setMunicipio(klk.getString("municipio"));
            per.setCiudad(klk.getString("ciudad"));
            per.setEstado(klk.getString("estado"));
            per.setCodigo_postal(klk.getString("codigoPostal"));
            per.setPais(klk.getString("pais"));
            per.setTelefono(klk.getString("telefono"));
            per.setCelular(klk.getString("celular"));
            per.setCorreo(klk.getString("correo"));
            return true;

           }
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

    public void search() {
        
        
    }

    public void SendEmail() {
        
    }

   

   
    
    
}
    
    
    

