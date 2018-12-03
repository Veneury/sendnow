/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Models.ModelsMetodosPaquetes;
import Models.ModelsPaquetes;
import Models.Personas;
import Views.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author TooDe
 */
public class ControllerProcesoModificarPaquetes implements ActionListener{
   private ModelsPaquetes modp;
   private ModelsMetodosPaquetes modmp;
   private frmModificarpaquete frmmp;
   frmagregado good = new frmagregado();
   frmErroralAgregar ups = new frmErroralAgregar();

   public ControllerProcesoModificarPaquetes(ModelsPaquetes modp, ModelsMetodosPaquetes modmp, frmModificarpaquete frmmp) {
      this.modp = modp;
      this.modmp = modmp;
      this.frmmp = frmmp;
      this.frmmp.btnMoficarPaquetes.addActionListener(this);
      this.frmmp.btnBusc.addActionListener(this);
      this.frmmp.btnCancelarModificacionPaquete.addActionListener(this);
      this.frmmp.btnSalirModificarPaquetes.addActionListener(this);
   }

  
   
     public void iniciar() {
      frmmp.setTitle("Modificar Paquetes");
      frmmp.setLocationRelativeTo(null);
   }
      @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource()==frmmp.btnBusc)
      {
        modp.setCodigo(frmmp.txtSearch.getText());
        
        if(modmp.search(modp)){
         frmmp.txtCodigoModificarPaquete.setText(String.valueOf(modp.getCodigo()));
         frmmp.txtNombreModificarPaquete.setText(String.valueOf(modp.getNombre()));
         frmmp.txtDescripcionModificarPaquetes.setText(String.valueOf(modp.getDescripcion()));
         frmmp.txtTipoPaquete.setText(modp.getTipo());
         frmmp.txtPesoModificarPaquetes.setText(String.valueOf(modp.getPeso()));
        } else{JOptionPane.showMessageDialog(null, "No se encontro el registro");} 
      }
      
      if(e.getSource()==frmmp.btnMoficarPaquetes)
      {
         modp.setCodigo(frmmp.txtCodigoModificarPaquete.getText());
         modp.setTipo(frmmp.txtTipoPaquete.getText());
         modp.setNombre(frmmp.txtNombreModificarPaquete.getText());
         modp.setDescripcion(frmmp.txtDescripcionModificarPaquetes.getText());
         modp.setPeso(frmmp.txtPesoModificarPaquetes.getText());
        if(modmp.editpackage(modp)){
        JOptionPane.showMessageDialog(null, "Paquete Modificado");
        
        }else{JOptionPane.showMessageDialog(null, "Error al Modificar paquete");}
      }
         
   }  
}
