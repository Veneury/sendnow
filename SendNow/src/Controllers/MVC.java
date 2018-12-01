
package Controllers;

import Models.Cliente;
import Models.Personas;
import Views.AgreCL;
import Views.EliminarCL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class MVC implements ActionListener{
    
    private Personas per;
    private Cliente cli;
    private AgreCL agre;
    private EliminarCL el;

   public MVC(Personas per, Cliente cli, AgreCL agre ){
        this.per=per;
        this.cli=cli;
        this.agre=agre;
        this.agre.btnAgregar.addActionListener(this);
        this.el.btnBorrar.addActionListener(this);
    }

    MVC() {
        
         }
    
    public void verAgregarClientes(){
          agre.setTitle("Clientes");
          agre.setLocationRelativeTo(null);
          agre.txtCedula.setVisible(true);
    }
    
    public void verEliminarClientes(){
         el.setTitle("Cliente");
         el.setLocationRelativeTo(null);
         el.txtEli.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
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
        
     else if(e.getSource()==el.btnBorrar){
        
        per.setCedula(agre.txtCedula.getText());
        if(cli.Add(per)){
        JOptionPane.showMessageDialog(null, "Cliente eliminado");
        
        }else{JOptionPane.showMessageDialog(null, "Error al eliminar cliente");}
         
      
        }
        
        
       
        
        
        
        
        
        
        
        
    }
    }
    
    
    
    

