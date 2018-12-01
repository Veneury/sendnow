package Controllers;

import Models.ModelsMetodosPaquetes;
import Models.ModelsPaquetes;
import Views.frmErroralAgregar;
import Views.frmagregado;
import Views.frmpaquete;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author TooDe
 */
public class ControllersPaquetes implements ActionListener {

   private ModelsPaquetes modp;
   private ModelsMetodosPaquetes modmp;
   private frmpaquete frmp;
   frmagregado good = new frmagregado();
   frmErroralAgregar ups = new frmErroralAgregar();

   public ControllersPaquetes(ModelsPaquetes modp, ModelsMetodosPaquetes modmp, frmpaquete frmp) {
      this.modp = modp;
      this.modmp = modmp;
      this.frmp = frmp;
      this.frmp.btnagregarpaquete.addActionListener(this);
      this.frmp.btncancelarPaquetes.addActionListener(this);
      this.frmp.btnsalirpaquetes.addActionListener(this);
      this.frmp.btnNuevoTipoPaquetePaquetes.addActionListener(this);

   }

   public void iniciar() {
      frmp.setTitle("Productos");
      frmp.setLocationRelativeTo(null);
   }

   @Override
   public void actionPerformed(ActionEvent e) {

      if (e.getSource() == frmp.btnagregarpaquete) {
         modp.setCodigo(frmp.txtCodigopaquete.getText());
         modp.setTipo((int) frmp.cboTipopaquetes.getSelectedIndex());
         modp.setNombre(frmp.txtNombrepaquete.getText());
         modp.setDescripcion(frmp.txtDescripcion.getText());
         modp.setPeso(frmp.txtPesopaquete.getText());

         if (modmp.addpackage(modp)) {
            good.setVisible(true);
         } else {
            ups.setVisible(true);

         }
      }
   }

}
