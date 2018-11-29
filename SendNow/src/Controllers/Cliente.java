
package Controllers;

import Models.Conexion;
import Models.Personas;
import Views.AgreCL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Cliente extends Personas {
    Conexion conex= new Conexion();
    AgreCL agre = new AgreCL();

    @Override
    public void Add() {
        PreparedStatement ps= null;
        Connection con= conex.getConnection();
        conex.getConnection();
        
        String datos="INSERT INTO clientes(cedula, nombre, apellido, sexo, estado_civil, calle, barrio, sector, municipio, ciudad, estado, codigoPostal, telefono, celular, correo)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        
        
     try{
        
         ps=con.prepareStatement(datos);
         ps.setString(1,agre.txtCedula.getText());
         ps.setString(2,agre.txtNombre.getText());
         ps.setString(3,agre.txtApellido.getText());
         ps.setString(4,agre.txtSexo.getText());
        // ps.setDate(5,AgreCL.txtFecha.getText());
         ps.setString(5,agre.txtEstado.getText());
         ps.setString(6,agre.txtCalle.getText());
         ps.setString(7,agre.txtBarrio.getText());
         ps.setString(8,agre.txtSector.getText());
         ps.setString(9,agre.txtMunicipio.getText());
         ps.setString(10,agre.txtCiudad.getText());
         ps.setString(11,agre.txtEstado.getText());
         ps.setString(12,agre.txtCodigo_postal.getText());
         ps.setString(13,agre.txtTelefono.getText());
         ps.setString(14,agre.txtCelular.getText());
         ps.setString(15,agre.txtCorreo.getText());
         ps=con.prepareStatement(datos);
         
         
         int res= ps.executeUpdate();
         System.out.println("Se agrego");
        
     } catch(SQLException e){
     System.err.println(e);
   System.out.println("Se agrego mal");
     }finally{
     try{
         
         con.close();
     
     }catch(SQLException e){
      System.err.println(e);
       }
      }
     }
    
  
    }
    
  
    
    
    

