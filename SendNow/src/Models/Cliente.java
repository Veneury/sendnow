package Models;

import Models.Conexion;
import Models.Personas;
import Views.Administrad;
import Views.Login;
import Views.MenuCL;
import Views.newMenu;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Cliente extends Conexion {
    
   Login login = new Login();
   newMenu menu = new newMenu();
   Administrad admi= new Administrad();
 
   
   
    public boolean Add(Personas per) {

        try {

            Connection con = null;
            con = getConexion();
            getConexion();

            ps = con.prepareStatement("INSERT INTO clientes (cedula, nombre, apellido, sexo, estado_civil, calle, barrio, sector, municipio, ciudad, estado, codigoPostal, pais, telefono, celular, correo)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, per.getCedula());
            ps.setString(2, per.getNombre());
            ps.setString(3, per.getApellido());
            ps.setString(4, per.getSexo());
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

            }catch (Exception e) {
            System.err.println(e);
            return false;
            } finally {
            try {
            con.close();

            }catch (SQLException e) {
            System.err.println(e);
            }}}

    public boolean delete(Personas per) {

        try {
            Connection con = null;
            con = getConexion();
            getConexion();

            ps = con.prepareStatement("DELETE FROM clientes WHERE cedula=?");
            ps.setString(1, per.getCedula());
            ps.execute();

            return true;

            }catch (Exception e) {
            System.err.println(e);
            return false;
            }finally {
            try {
            con.close();
            }catch (SQLException e) {
            System.err.println(e);
            }}}

    public boolean Update(Personas per) {

        try {
            Connection con = null;
            con = getConexion();
            getConexion();

            ps = con.prepareStatement("UPDATE clientes SET nombre=?, apellido=?, sexo=?, estado_civil=?, calle=?, barrio=?, sector=?, municipio=?, ciudad=?, estado=?, codigoPostal=?, pais=?, telefono=?, celular=?, correo=? WHERE Cedula=?");
            ps.setString(1, per.getCedula());
            ps.setString(1, per.getNombre());
            ps.setString(2, per.getApellido());
            ps.setString(3, per.getSexo());
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

            } catch (Exception e) {
            System.err.println(e);
            return false;
            } finally {
            try {
            con.close();
            } catch (SQLException e) {
            System.err.println(e);
            }}}

    public boolean buscar(Personas per) {

        try {
            Connection con = null;
            ResultSet klk = null;
            con = getConexion();
            getConexion();

            ps = con.prepareStatement("SELECT *FROM clientes WHERE Cedula=?");
            ps.setString(1, per.getCedula());
            klk = ps.executeQuery();

            if (klk.next()) {
                per.setNombre(klk.getString("nombre"));
                per.setApellido(klk.getString("apellido"));
                per.setSexo(klk.getString("sexo"));
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
                } catch (Exception e) {
                   System.err.println(e);
                return false;
                } finally {
                try { con.close();
                }catch (SQLException e) {
                System.err.println(e);
               }}}
    
    
      public ArrayList<Personas>listPersona(){
      
      ArrayList ListaPersona = new ArrayList();
      
      Personas persona;
      
      try{
          
          Connection accDB= getConexion();
          PreparedStatement ps= accDB.prepareStatement("SELECT * FROM clientes");
          ResultSet rs= ps.executeQuery();
          
          
          while(rs.next()){
          
                 persona = new Personas();
                 persona.setCedula(rs.getString(1));
                 persona.setNombre(rs.getString(2));
                 persona.setApellido(rs.getString(3));
                 persona.setSexo(rs.getString(4));
                 persona.setCalle(rs.getString(5));
                 persona.setSector(rs.getString(6));            
                 persona.setCiudad(rs.getString(7));
                 persona.setEstado(rs.getString(8));
                 persona.setPais(rs.getString(9));
                 persona.setTelefono(rs.getString(10));
                 persona.setCelular(rs.getString(11));
                 persona.setCorreo(rs.getString(12));
                 ListaPersona.add(persona);
                 
          }
          
      } catch (SQLException ex) {
      }
        return ListaPersona;}
      
      
    public boolean HacerRegistro(Usuario usu) {

        try {

            Connection con = null;
            con = getConexion();
            getConexion();

                ps = con.prepareStatement("INSERT INTO usuario (usuarios, contrasena, id_tipoUsuario, nombre, apellido, correo) VALUES (?,?,?,?,?,?)");
                ps.setString(1, usu.getUsuario());
                ps.setString(2, usu.getPass());
                ps.setInt(3, usu.getId_tipo());
                ps.setString(4, usu.getNombre());
                ps.setString(5, usu.getApellido());
                ps.setString(6, usu.getCorreo());
                ps.execute();
                return true;
                
            } catch (Exception e) {   
                System.err.println(e);    
                return false;    
            } finally {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println(e);
            }}}
    
    public boolean LoginUusu(Usuario usu){
         
        Statement stmt;
        ResultSet rs;
        con=getConexion();
        
        usu.setUsuario(login.txtUsuario.getText());
        usu.setPass(String.valueOf(login.txtPass.getPassword()));
        try{
            
            stmt= con.createStatement();
            rs=stmt.executeQuery("SELECT TipoUsu FROM usuario WHERE  usuarios='"+usu.getUsuario()+"' AND  contrasena='"+usu.getPass()+"'");
            
            if(rs!= null){
            
                if(rs.next()){
                
                    switch(rs.getString("TipoUsu")){
                    
                        case "Administrador":
                            login.dispose();
                            menu.setLocationRelativeTo(null);
                            menu.setVisible(true);
                            break;
                            
                        case "Receptor":
                            login.dispose();
                            admi.setLocationRelativeTo(null);
                            admi.setVisible(true);
                            break;

                    }
                
                }else{JOptionPane.showMessageDialog(null, "Usuario no existe");}
                
                
            
            }
    
        }catch(SQLException e){
        
 }
        return false;
    }

}
            
            
       
      
    
      
 
      
      

    
