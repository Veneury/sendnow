/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.*;
import Models.*;
import Models.*;

/**
 *
 * @author TooDe
 */
public class MenuAsignarPaquetes {

   public static void main(String args[]) {

      ModelsPaquetes mod = new ModelsPaquetes();
      Personas personas = new Personas();
      ModelsMetodosAsisgnarPaquetes modC = new ModelsMetodosAsisgnarPaquetes();
      frmAsignarPaquetes frmmp = new frmAsignarPaquetes();

      ControllerAsignarPaquetes ctrl = new ControllerAsignarPaquetes(mod, personas, modC, frmmp);
      ctrl.iniciar();
      frmmp.setVisible(true);
   }
}
