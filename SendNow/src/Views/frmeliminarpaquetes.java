/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views;

/**
 *
 * @author TooDe
 */
public class frmeliminarpaquetes extends javax.swing.JFrame {

    /** Creates new form frmagregado */
    public frmeliminarpaquetes() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      jLabel20 = new javax.swing.JLabel();
      jLabel1 = new javax.swing.JLabel();
      txtCodigoPaqueteEditar = new de.craften.ui.swingmaterial.MaterialTextField();
      btnProcesarEliminarPaquetes = new principal.MaterialButtomRectangle();
      btnCancelarEditPaquetes = new principal.MaterialButtomRectangle();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setLocation(new java.awt.Point(350, 150));
      setResizable(false);

      jPanel1.setBackground(new java.awt.Color(255, 255, 255));

      jPanel2.setBackground(new java.awt.Color(0, 139, 205));

      jLabel20.setFont(new java.awt.Font("Century", 1, 30)); // NOI18N
      jLabel20.setForeground(new java.awt.Color(255, 255, 255));
      jLabel20.setText("Eliminar paquetes");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel20)
            .addGap(68, 68, 68))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(jLabel20)
            .addContainerGap(27, Short.MAX_VALUE))
      );

      jLabel1.setFont(new java.awt.Font("Century", 1, 30)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(0, 0, 0));
      jLabel1.setText("Código paquete");

      txtCodigoPaqueteEditar.setForeground(new java.awt.Color(0, 0, 0));
      txtCodigoPaqueteEditar.setToolTipText("");
      txtCodigoPaqueteEditar.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
      txtCodigoPaqueteEditar.setHint("Código paquete a modificar");

      btnProcesarEliminarPaquetes.setBackground(new java.awt.Color(27, 161, 96));
      btnProcesarEliminarPaquetes.setForeground(new java.awt.Color(255, 255, 255));
      btnProcesarEliminarPaquetes.setText("Procesar");

      btnCancelarEditPaquetes.setBackground(new java.awt.Color(221, 80, 68));
      btnCancelarEditPaquetes.setForeground(new java.awt.Color(255, 255, 255));
      btnCancelarEditPaquetes.setText("Cancelar");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(93, 93, 93)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel1)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(16, 16, 16)
                  .addComponent(txtCodigoPaqueteEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(64, Short.MAX_VALUE)
            .addComponent(btnProcesarEliminarPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnCancelarEditPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(61, 61, 61))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(31, 31, 31)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtCodigoPaqueteEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnCancelarEditPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnProcesarEliminarPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(28, 28, 28))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmeliminarpaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmeliminarpaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmeliminarpaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmeliminarpaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmeliminarpaquetes().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   public principal.MaterialButtomRectangle btnCancelarEditPaquetes;
   public principal.MaterialButtomRectangle btnProcesarEliminarPaquetes;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel20;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   public de.craften.ui.swingmaterial.MaterialTextField txtCodigoPaqueteEditar;
   // End of variables declaration//GEN-END:variables

}