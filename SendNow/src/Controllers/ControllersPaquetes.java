package Controllers;

import Models.ModelsMetodosPaquetes;
import Models.*;
import Views.*;
import Views.frmagregado;
import Views.frmpaquete;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

   }

   public void iniciar() {
      frmp.setTitle("Paquetes");
      frmp.setLocationRelativeTo(null);
   }

   @Override
   public void actionPerformed(ActionEvent e) {

      if (e.getSource() == frmp.btnagregarpaquete) {
         modp.setCodigo(frmp.txtCodigopaquete.getText());
         modp.setTipo(frmp.txtTipoPaquete.getText());
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
