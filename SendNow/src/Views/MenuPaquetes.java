/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.ModelsMetodosPaquetes;
import Models.ModelsPaquetes;
import Views.frmpaquete;
import Controllers.ControllersPaquetes;

/**
 *
 * @author TooDe
 */
public class MenuPaquetes {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      ModelsPaquetes modp = new ModelsPaquetes();
      ModelsMetodosPaquetes modmp = new ModelsMetodosPaquetes();
      frmpaquete frmp = new frmpaquete();
      ControllersPaquetes ctrl = new ControllersPaquetes(modp, modmp, frmp);
      
      frmp.setVisible(true);
   }

}
