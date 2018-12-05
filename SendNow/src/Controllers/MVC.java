
package Controllers;

import Models.Cliente;
import Models.Personas;
import Models.Usuario;
import Views.Administrad;
import Views.AgreCL;
import Views.ClienteOP;
import Views.EliminarCL;
import Views.Login;
import Views.ModificarClient;
import Views.RegistrarUsu;
import Views.VerClientes;
import Views.newMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
 

public class MVC implements ActionListener{
    
    
    private Personas per;
    private Cliente cli;
    private Usuario usu;
    private AgreCL agre;
    private EliminarCL el;
    private ModificarClient mo ;
    private VerClientes ver;
    private Login login;
    private RegistrarUsu regis;
    private ClienteOP client;
    private Administrad admi;
    private newMenu menu;
    
    
    
   

   
   
   public MVC(Personas per, Cliente cli, AgreCL agre, EliminarCL el, ModificarClient mo, VerClientes ver, Usuario usu, Login login, RegistrarUsu regis, ClienteOP cliente, newMenu menu){
        this.usu=usu;
        this.client=client;
        this.menu=menu;
        this.login=login;
        this.per=per;
        this.cli=cli;
        this.agre=agre;
        this.agre.btnAgregar.addActionListener(this);
        this.el.btnBorrar.addActionListener(this);
        this.mo.btnBusc.addActionListener(this);
        this.mo.btnModificar.addActionListener(this);
        this.ver.btbRefrescar.addActionListener(this);
        this.login.btnInicio.addActionListener(this);
        this.login.btnRegistrarU.addActionListener(this);
        this.regis.btnRegistrar.addActionListener(this);
        this.menu.btnClient.addActionListener(this);
        this.client.btnVerCliente.addActionListener(this);
    }

    MVC(Personas per, Cliente cli , Usuario usu, newMenu menu, Login login, RegistrarUsu regis, ClienteOP client) {
        this.usu=usu;
        this.per=per;
        this.menu=menu;
        this.client=client;
        this.cli=cli;
        this.regis=regis;
        this.agre=agre;
        this.login=login;
        this.agre.btnAgregar.addActionListener(this);
        this.el.btnBorrar.addActionListener(this);
        this.mo.btnBusc.addActionListener(this);
        this.mo.btnModificar.addActionListener(this);
        this.ver.btbRefrescar.addActionListener(this);
        this.login.btnInicio.addActionListener(this);
        this.login.btnRegistrarU.addActionListener(this);
        this.regis.btnRegistrar.addActionListener(this);
        this.menu.btnClient.addActionListener(this);
        this.client.btnVerCliente.addActionListener(this);
        
       }
    
    public void LlenarTabla(JTable tablaD){
    DefaultTableModel modeloT= new DefaultTableModel();
    tablaD.setModel(modeloT);
          
        modeloT.addColumn("cedula");
        modeloT.addColumn("nombre");
        modeloT.addColumn("apellido");
        modeloT.addColumn("sexo");        
        modeloT.addColumn("calle");       
        modeloT.addColumn("sector");      
        modeloT.addColumn("ciudad");
        modeloT.addColumn("estado");
        modeloT.addColumn("pais");
        modeloT.addColumn("telefono");
        modeloT.addColumn("celular");
        modeloT.addColumn("correo");
        
        Object[] columna = new Object[12];
        
        int numRegistros= cli.listPersona().size();
        
        for(int i = 0;  i <numRegistros; i++){
           columna[0]= cli.listPersona().get(i).getCedula();
           columna[1]= cli.listPersona().get(i).getNombre();
           columna[2]= cli.listPersona().get(i).getApellido();
           columna[3]= cli.listPersona().get(i).getSexo();         
           columna[4]= cli.listPersona().get(i).getCalle();          
           columna[5]= cli.listPersona().get(i).getSector();           
           columna[6]= cli.listPersona().get(i).getCiudad();
           columna[7]= cli.listPersona().get(i).getEstado();
           columna[8]= cli.listPersona().get(i).getPais();
           columna[9]= cli.listPersona().get(i).getTelefono();
           columna[10]= cli.listPersona().get(i).getCelular();
           columna[11]= cli.listPersona().get(i).getCorreo();
           modeloT.addRow(columna);
          
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        //BOTON AGREGAR CLIENTES
        if(e.getSource()==agre.btnAgregar){
        
        per.setCedula(agre.txtCedula.getText());
        per.setNombre(agre.txtNombre.getText());
        per.setApellido(agre.txtApellido.getText());
        per.setSexo(agre.txtSexo.getText());
        //per.setCedula(agre.txtCedula.getText());
        per.setEstado_civil(agre.txtEstadoCivil.getText());
        per.setCalle(agre.txtCalle.getText());
        per.setBarrio(agre.txtBarrio.getText());
        per.setSector(agre.txtSector.getText());
        per.setMunicipio(agre.txtMunicipio.getText());
        per.setCiudad(agre.txtCiudad.getText());
        per.setEstado(agre.txtEstado.getText());
        per.setCodigo_postal(agre.txtCodigoPostal.getText());
        per.setPais(agre.txtPais.getText());
        per.setTelefono(agre.txtTelefono.getText());
        per.setCelular(agre.txtCelular.getText());
        per.setCorreo(agre.txtCorreo.getText());
        
        if(cli.Add(per)){
        JOptionPane.showMessageDialog(null, "Cliente Guardado");
        
        }else{JOptionPane.showMessageDialog(null, "Error al guardar Cliente");}
         
        }
     
        //BOTON BORRAR CLIENTES
     else if(e.getSource()==el.btnBorrar){       
        per.setCedula(el.txtEli.getText());       
           if(cli.delete(per)){           
                 JOptionPane.showMessageDialog(null, "Cliente eliminado");        
           }else{JOptionPane.showMessageDialog(null, "Error al eliminar cliente");}
           
        }
        //BONTON PARA BUSCAR CLIENTES
     else if (e.getSource()==mo.btnBusc){
         
        per.setCedula(mo.txtCedulaM.getText());
        
        if(cli.buscar(per)){
        mo.txtNombreM.setText(String.valueOf(per.getNombre()));
        mo.txtApellidoM.setText(String.valueOf(per.getApellido()));
        mo.txtSexoM.setText(String.valueOf(per.getSexo()));
        //per.setCedula(agre.txtCedula.getText());
        mo.txtEstadoM.setText(String.valueOf(per.getEstado_civil()));
        mo.txtCalleM.setText(String.valueOf(per.getCalle()));
        mo.txtBarrioM.setText(String.valueOf(per.getBarrio()));
        mo.txtSectorM.setText(String.valueOf(per.getSector()));
        mo.txtMunicipioM.setText(String.valueOf(per.getMunicipio()));
        mo.txtCiudadM.setText(String.valueOf(per.getCiudad()));
        mo.txtEstadoM.setText(String.valueOf(per.getEstado()));
        mo.txtCodigoPostalM.setText(String.valueOf(per.getCodigo_postal()));
        mo.txtPaisM.setText(String.valueOf(per.getPais()));
        mo.txtTelefonoM.setText(String.valueOf(per.getTelefono()));
        mo.txtCelularM.setText(String.valueOf(per.getCelular()));
        mo.txtCorreoM.setText(String.valueOf(per.getCorreo()));
        
        } else{JOptionPane.showMessageDialog(null, "No se encontro el registro");}
     }
                 
     //BOTON PARA MODIFICAR CLIENTES
     else  if (e.getSource()==mo.btnModificar){
     
        per.setCedula(mo.txtCedulaM.getText());
        per.setNombre(mo.txtNombreM.getText());
        per.setApellido(mo.txtApellidoM.getText());
        per.setSexo(mo.txtSexoM.getText());
        //per.setCedula(agre.txtCedula.getText());
        per.setEstado_civil(mo.txtEstadoCivilM.getText());
        per.setCalle(mo.txtCalleM.getText());
        per.setBarrio(mo.txtBarrioM.getText());
        per.setSector(mo.txtSectorM.getText());
        per.setMunicipio(mo.txtMunicipioM.getText());
        per.setCiudad(mo.txtCiudadM.getText());
        per.setEstado(mo.txtEstadoM.getText());
        per.setCodigo_postal(mo.txtCodigoPostalM.getText());
        per.setPais(mo.txtPaisM.getText());
        per.setTelefono(mo.txtTelefonoM.getText());
        per.setCelular(mo.txtCelularM.getText());
        per.setCorreo(mo.txtCorreoM.getText());
        
        if(cli.Update(per)){
        JOptionPane.showMessageDialog(null, "Cliente Modificado");       
        }else{JOptionPane.showMessageDialog(null, "Error al Modificar Cliente");}       
        }   
     
      //BOTON PARA VER TODOS LOS CLIENTES
       else if(ver.btbRefrescar== e.getSource()){       
               LlenarTabla(ver.Tabla);
       }
       
       
       
       
       else if (login.btnInicio==e.getSource()){
           
         cli.LoginUusu(usu);
         
         if(!usu.getUsuario().equals("") && !usu.getPass().equals("")){
            String pass = new String(login.txtPass.getPassword());
             usu.setUsuario(login.txtUsuario.getText());
               usu.setPass(pass);               
         }else{JOptionPane.showMessageDialog(null, "Favor llenar todos los campos");}}
     
       //para que abra la interfaz
       
         else if(login.btnRegistrarU==e.getSource()){     
                regis.setVisible(true);
                regis.setLocationRelativeTo(null);
         }
         else if(client.btnVerCliente==e.getSource()){
          ver.setVisible(true);
         
         }
         
         else if(menu.btnClient==e.getSource()){
             
          System.out.println("sadasd");
         
         }
         
         
       //BOTON PARA REGISTRAR USUARIOS
       else if (regis.btnRegistrar==e.getSource()){           
          String passa= new String(regis.txtPassR.getPassword());          
           usu.setUsuario(regis.txtUsuarioR.getText());           
            usu.setPass(passa);             
            usu.setCorreo(regis.txtCorreoR.getText());
            usu.setNombre(regis.txtNombreR.getText());
            usu.setApellido(regis.txtApellidoR.getText());
            
                     
       if(cli.HacerRegistro(usu)){
          JOptionPane.showMessageDialog(null, "Registro Guardado");       
            }else{JOptionPane.showMessageDialog(null, "Error al Registrar Usuario");}            
       }else{JOptionPane.showMessageDialog(null, "Favor llenar todos los campos");}
     
    
     
     
    }

     
       


         
              
         
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
        
}    
       
      
          
          



     
    
    
    
    
      
    
