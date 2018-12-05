/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.*;
import Models.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author TooDe
 */
public class ControlleMenus implements ActionListener {

   private frmMenuPaquetes frmMenu;
   private ModelsPaquetes modp;
   private ModelsMetodosPaquetes modmp;

   public ControlleMenus(frmMenuPaquetes frmMenu, ModelsPaquetes modp, ModelsMetodosPaquetes modmp) {
      this.frmMenu = frmMenu;
      this.modp = modp;
      this.modmp = modmp;
      this.frmMenu.btnagregar.addActionListener(this);
      this.frmMenu.btneditar.addActionListener(this);
   }

   public void iniciar() {
      frmMenu.setTitle("Menú paquetes");
      frmMenu.setLocationRelativeTo(null);
      frmMenu.setResizable(false);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == frmMenu.btnagregar) {
         System.out.println("Hola");
         /*frm.setVisible(true);
         frmMenu.setLocationRelativeTo(null);
         frmMenu.setResizable(false);*/
      }
      if (e.getSource() == frmMenu.btneditar) {
         System.out.println("Hola mundo");
      }

   }
}
