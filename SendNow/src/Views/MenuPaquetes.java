/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.*;
import Views.*;
import Controllers.*;

/**
 *
 * @author TooDe
 */
public class MenuPaquetes {
      ModelsPaquetes mod = new ModelsPaquetes();
      ModelsMetodosPaquetes modC = new ModelsMetodosPaquetes();
   /**
    * @param args the command line arguments
    */
   //public static void main(String[] args) {
      //Instanciamos el modelo, metodos y formularios
      /* ModelsPaquetes modp = new ModelsPaquetes();
      ModelsMetodosPaquetes modmp = new ModelsMetodosPaquetes();
      frmpaquete frmp = new frmpaquete();
      frmModificarpaquete frmmp= new frmModificarpaquete();
      frmeliminarpaquetes frmep=new frmeliminarpaquetes();
      ControllersPaquetes ctrl = new ControllersPaquetes(modp, modmp, frmp);
     
      ControllerProcesoModificarPaquetes controllerModificar = new ControllerProcesoModificarPaquetes(modp, modmp, frmmp);
      ControllerProcesoEliminarPaquetes controllerProcesoEliminarPaquetes = new ControllerProcesoEliminarPaquetes(modp, modmp, frmep);
      //controllerModificar.iniciar();
     // controllerProcesoEliminarPaquetes.iniciar();
      ctrl.iniciar();
      
      //frmp.setVisible(true);
      //frmmp.setVisible(true);
      frmp.setVisible(true);*/

 

   public void agregarPaquete() {

      frmpaquete frm = new frmpaquete();

      ControllersPaquetes ctrl = new ControllersPaquetes(mod, modC, frm);
      ctrl.iniciar();
      frm.setVisible(true);
   }
   
   public void modificarPaquetes()
   {
      frmModificarpaquete frm =new frmModificarpaquete();
      ControllerProcesoModificarPaquetes controllerModificar = new ControllerProcesoModificarPaquetes(mod, modC, frm);
      controllerModificar.iniciar(); 
      frm.setVisible(true);
   }
   
   public void eliminarPaquetes()
   {
      frmeliminarpaquetes frm = new frmeliminarpaquetes();
      ControllerProcesoEliminarPaquetes controllerProcesoEliminarPaquetes = new ControllerProcesoEliminarPaquetes(mod, modC, frm);
      controllerProcesoEliminarPaquetes.iniciar();
      frm.setVisible(true);
   }
   
      public void listadoPaquetes()
   {
      frmVerPaquetes frm = new frmVerPaquetes();
      ControllerVerPaquetes controllerVerPaquetes= new ControllerVerPaquetes(mod, modC, frm);
      controllerVerPaquetes.iniciar();
      frm.setVisible(true);
   }
   
   
}
