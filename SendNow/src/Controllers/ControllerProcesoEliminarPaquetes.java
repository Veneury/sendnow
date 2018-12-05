
package Controllers;

import Models.*;
import Views.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControllerProcesoEliminarPaquetes implements ActionListener{
   
   private ModelsPaquetes modp;
   private ModelsMetodosPaquetes modmp;
   private frmeliminarpaquetes frmep;
   frmagregado good = new frmagregado();
   frmErroralAgregar ups = new frmErroralAgregar();

   public ControllerProcesoEliminarPaquetes(ModelsPaquetes modp, ModelsMetodosPaquetes modmp, frmeliminarpaquetes frmep) {
      this.modp = modp;
      this.modmp = modmp;
      this.frmep = frmep;
      this.frmep.btnProcesarEliminarPaquetes.addActionListener(this);
      this.frmep.btnCancelarEditPaquetes.addActionListener(this);
   }

    @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource()==frmep.btnProcesarEliminarPaquetes)
      {
          modp.setCodigo(frmep.txtCodigoPaqueteEditar.getText());
            
            if(modmp.delete(modp))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
              limpia();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
               limpia();
            }
      }
   }

  
   
     public void iniciar() {
      frmep.setTitle("Eliminar Paquetes");
      frmep.setLocationRelativeTo(null);
   }
     
     public void limpia()
     {
        frmep.txtCodigoPaqueteEditar.setText("");
     }
   
}
