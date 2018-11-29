
package Controllers;

import Models.Conexion;
import Models.Personas;
import Views.AgreCL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Cliente extends Personas {
  //  Conexion conex= new Conexion();
    AgreCL agre = new AgreCL();

    
    
    @Override
    public void Add() {
        Connection con=Conexion.getConnection();
        PreparedStatement ps;
     
         
 
        
        String datos="INSERT INTO clientes(cedula, nombre, apellido, sexo, pais,estado_civil, calle, barrio, sector, municipio, ciudad, estado, codigoPostal, telefono, celular, correo)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        
        
     try{
        
         ps=con.prepareStatement(datos);
          ps.setString(1,"pedro");
         ps.setString(2,"adsasdas");
         ps.setString(3,"dasdasd");
         ps.setString(4,"asfasdasd");
         //ps.setDate(5,agre.txtFecha.getText());
         ps.setString(5,"asdadasda");
         ps.setString(6,"sadafdsf");
         ps.setString(7,"asdasdasdsada");
         ps.setString(8,"odfjskjdsda");
         ps.setString(9,"zxczxcsada");
         ps.setString(10,"klasdakjsdas");
         ps.setString(11,"kjlsjdskahdas");
         ps.setString(12,"kjasjdlaskdas");
         ps.setString(13,"klasjdjaslkdsa");
         ps.setString(14,"maskldjalsdjlasdas");
         ps.setString(15,"kaljdhajkdkljalsjdas");
         ps.setString(16,"kasjdoasdjalsld");
         
         
         
         
        /* ps.setString(1,agre.txtCedula.getText());
         ps.setString(2,agre.txtNombre.getText());
         ps.setString(3,agre.txtApellido.getText());
         ps.setString(4,agre.txtSexo.getText());
         //ps.setDate(5,agre.txtFecha.getText());
         ps.setString(5,agre.txtPais.getText());
         ps.setString(6,agre.txtEstado.getText());
         ps.setString(7,agre.txtCalle.getText());
         ps.setString(8,agre.txtBarrio.getText());
         ps.setString(9,agre.txtSector.getText());
         ps.setString(10,agre.txtMunicipio.getText());
         ps.setString(11,agre.txtCiudad.getText());
         ps.setString(12,agre.txtEstado.getText());
         ps.setString(13,agre.txtCodigo_postal.getText());
         ps.setString(14,agre.txtTelefono.getText());
         ps.setString(15,agre.txtCelular.getText());
         ps.setString(16,agre.txtCorreo.getText());*/
         ps=con.prepareStatement(datos);
         
         
         if(ps.executeUpdate()==1)
         {
             System.out.println("Se agrego Correctamente!"); 
         }else{
             System.out.println("Error al agregar");
         }
         
         //int res= ps.executeUpdate();
        
      
     } catch(SQLException e){
     System.err.println(e);
   System.out.println("no se a agregado");
     }finally{
        //cone.cerrarConexion();
       }
      }
     }
    
  
    
    
  
    
    
    

