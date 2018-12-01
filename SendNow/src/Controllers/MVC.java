
package Controllers;

import Models.Cliente;
import Models.Personas;
import Views.AgreCL;
import Views.EliminarCL;
import Views.ModificarClient;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class MVC implements ActionListener{
    
    private Personas per;
    private Cliente cli;
    private AgreCL agre;
    private EliminarCL el;
    private ModificarClient mo ;

   public MVC(Personas per, Cliente cli, AgreCL agre, EliminarCL el, ModificarClient mo){
        this.per=per;
        this.cli=cli;
        this.agre=agre;
        this.agre.btnAgregar.addActionListener(this);
        this.el.btnBorrar.addActionListener(this);
        this.mo.btnBusc.addActionListener(this);
        this.mo.btnModificar.addActionListener(this);
    }

 

    MVC(Personas per, Cliente cli, EliminarCL el) {
        this.per=per;
        this.cli=cli;
        this.agre=agre;
        this.agre.btnAgregar.addActionListener(this);
        this.el.btnBorrar.addActionListener(this);
        this.mo.btnBusc.addActionListener(this);
        this.mo.btnModificar.addActionListener(this);
        
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
        
        per.setCedula(el.txtEli.getText());
        
        if(cli.delete(per)){
            
            
        JOptionPane.showMessageDialog(null, "Cliente eliminado");
        
        }else{JOptionPane.showMessageDialog(null, "Error al eliminar cliente");}
        
        
         
      
        }
        
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
         
         
     
       if (e.getSource()==mo.btnModificar){
     
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
     
     
     
     
     
     }
       
        
        
        
        
        
        
        
        
    }
    
    
    
    
    

