/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.*;
import Views.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author TooDe
 */
public class ControllerAsignarPaquetes implements ActionListener {

   private ModelsPaquetes modp;
   private Personas cliente;
   private ModelsMetodosAsisgnarPaquetes modmp;
   private frmAsignarPaquetes frmmp;
   frmagregado good = new frmagregado();
   frmErroralAgregar ups = new frmErroralAgregar();

   public ControllerAsignarPaquetes(ModelsPaquetes modp, Personas cliente, ModelsMetodosAsisgnarPaquetes modmp, frmAsignarPaquetes frmmp) {
      this.modp = modp;
      this.cliente = cliente;
      this.modmp = modmp;
      this.frmmp = frmmp;
      this.frmmp.btnAsignarPaquetes.addActionListener(this);
      this.frmmp.btnCancelarAsignacion.addActionListener(this);
      this.frmmp.btnCancelarAsignacion.addActionListener(this);
      this.frmmp.cboCliente.addActionListener(this);
      this.frmmp.cboPaquete.addActionListener(this);
   }
   public void iniciar() {
      frmmp.setTitle("Asignar Paquetes");
      frmmp.setLocationRelativeTo(null);
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == frmmp.btnAsignarPaquetes) {
         modp.setId(frmmp.cboPaquete.getSelectedIndex());
         cliente.setId(frmmp.cboCliente.getSelectedIndex());
         modmp.setFecha(frmmp.DCDate.getDatoFecha());

         if (modmp.asigpackage(modp,cliente)) {
            good.setVisible(true);
         } else {
            ups.setVisible(true);

         }
      }
   }

}
