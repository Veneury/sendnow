/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.*;
import Controllers.*;

/**
 *
 * @author TooDe
 */
public class frmMenuPaquetes extends javax.swing.JFrame {
      MenuPaquetes mn = new MenuPaquetes();
   /**
    * Creates new form frmMenuPaquetes
    */
   public frmMenuPaquetes() {
      initComponents();

   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel3 = new javax.swing.JPanel();
      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      btneditar = new javax.swing.JButton();
      btneliminar = new javax.swing.JButton();
      btnagregar = new javax.swing.JButton();
      btnbuscar = new javax.swing.JButton();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      btnlistar = new javax.swing.JButton();
      jLabel7 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      btnasignarpaquetes = new javax.swing.JButton();
      jLabel9 = new javax.swing.JLabel();
      btnlistadopaquetes = new javax.swing.JButton();
      jLabel10 = new javax.swing.JLabel();
      jLabel11 = new javax.swing.JLabel();
      btnreportespaquetesasignados = new javax.swing.JButton();
      jLabel12 = new javax.swing.JLabel();
      btnreportepaquetesrecibicos = new javax.swing.JButton();
      jLabel13 = new javax.swing.JLabel();
      btnreportepaquetes = new javax.swing.JButton();
      jLabel14 = new javax.swing.JLabel();
      btnreportepaquetesproceso = new javax.swing.JButton();
      jLabel15 = new javax.swing.JLabel();
      btnreportepaquetesentregados = new javax.swing.JButton();
      jLabel16 = new javax.swing.JLabel();
      btnreportepaquetesinasignar = new javax.swing.JButton();
      jLabel17 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setBackground(new java.awt.Color(255, 255, 255));

      jPanel3.setBackground(new java.awt.Color(255, 255, 255));

      jPanel1.setBackground(new java.awt.Color(0, 139, 205));

      jLabel1.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(255, 255, 255));
      jLabel1.setText("Menú paquetes");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(225, 225, 225))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addComponent(jLabel1)
            .addContainerGap(22, Short.MAX_VALUE))
      );

      btneditar.setBackground(new java.awt.Color(255, 255, 255));
      btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/pencil-box.png"))); // NOI18N
      btneditar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btneditarActionPerformed(evt);
         }
      });

      btneliminar.setBackground(new java.awt.Color(255, 255, 255));
      btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/deletepackage.png"))); // NOI18N
      btneliminar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btneliminarActionPerformed(evt);
         }
      });

      btnagregar.setBackground(new java.awt.Color(255, 255, 255));
      btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/addPackage.png"))); // NOI18N
      btnagregar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnagregarActionPerformed(evt);
         }
      });

      btnbuscar.setBackground(new java.awt.Color(255, 255, 255));
      btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/searchPackage.png"))); // NOI18N

      jLabel2.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(0, 0, 0));
      jLabel2.setText("Agregar");

      jLabel3.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(0, 0, 0));
      jLabel3.setText("Editar");

      jLabel4.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
      jLabel4.setForeground(new java.awt.Color(0, 0, 0));
      jLabel4.setText("Eliminar");

      jLabel5.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
      jLabel5.setForeground(new java.awt.Color(0, 0, 0));
      jLabel5.setText("Lista");

      jLabel6.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
      jLabel6.setForeground(new java.awt.Color(0, 0, 0));
      jLabel6.setText("Buscar");

      btnlistar.setBackground(new java.awt.Color(255, 255, 255));
      btnlistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/list.png"))); // NOI18N
      btnlistar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnlistarActionPerformed(evt);
         }
      });

      jLabel7.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
      jLabel7.setForeground(new java.awt.Color(0, 0, 0));
      jLabel7.setText("Opciones paquetes");

      jLabel8.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
      jLabel8.setForeground(new java.awt.Color(0, 0, 0));
      jLabel8.setText("Reportes");

      btnasignarpaquetes.setBackground(new java.awt.Color(255, 255, 255));
      btnasignarpaquetes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/addPackage.png"))); // NOI18N

      jLabel9.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
      jLabel9.setForeground(new java.awt.Color(0, 0, 0));
      jLabel9.setText("Agregar");

      btnlistadopaquetes.setBackground(new java.awt.Color(255, 255, 255));
      btnlistadopaquetes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/list.png"))); // NOI18N

      jLabel10.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
      jLabel10.setForeground(new java.awt.Color(0, 0, 0));
      jLabel10.setText("Lista");

      jLabel11.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
      jLabel11.setForeground(new java.awt.Color(0, 0, 0));
      jLabel11.setText("Asignar paquetes");

      btnreportespaquetesasignados.setBackground(new java.awt.Color(255, 255, 255));
      btnreportespaquetesasignados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/analytics.png"))); // NOI18N

      jLabel12.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
      jLabel12.setForeground(new java.awt.Color(0, 0, 0));
      jLabel12.setText("Paquetes");

      btnreportepaquetesrecibicos.setBackground(new java.awt.Color(255, 255, 255));
      btnreportepaquetesrecibicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/clipboard.png"))); // NOI18N

      jLabel13.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
      jLabel13.setForeground(new java.awt.Color(0, 0, 0));
      jLabel13.setText("Asignados");

      btnreportepaquetes.setBackground(new java.awt.Color(255, 255, 255));
      btnreportepaquetes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/report.png"))); // NOI18N

      jLabel14.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
      jLabel14.setForeground(new java.awt.Color(0, 0, 0));
      jLabel14.setText("Recibidos");

      btnreportepaquetesproceso.setBackground(new java.awt.Color(255, 255, 255));
      btnreportepaquetesproceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/clipboard.png"))); // NOI18N

      jLabel15.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
      jLabel15.setForeground(new java.awt.Color(0, 0, 0));
      jLabel15.setText("Proceso");

      btnreportepaquetesentregados.setBackground(new java.awt.Color(255, 255, 255));
      btnreportepaquetesentregados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/list.png"))); // NOI18N

      jLabel16.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
      jLabel16.setForeground(new java.awt.Color(0, 0, 0));
      jLabel16.setText("Entregados");

      btnreportepaquetesinasignar.setBackground(new java.awt.Color(255, 255, 255));
      btnreportepaquetesinasignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/report.png"))); // NOI18N

      jLabel17.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
      jLabel17.setForeground(new java.awt.Color(0, 0, 0));
      jLabel17.setText("Sin asignar");

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGroup(jPanel3Layout.createSequentialGroup()
                              .addGap(33, 33, 33)
                              .addComponent(jLabel2)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel3Layout.createSequentialGroup()
                              .addGap(40, 40, 40)
                              .addComponent(jLabel3)
                              .addGap(84, 84, 84)
                              .addComponent(jLabel4)
                              .addGap(90, 90, 90)
                              .addComponent(jLabel5)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jLabel6)
                              .addGap(39, 39, 39))
                           .addGroup(jPanel3Layout.createSequentialGroup()
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(12, 12, 12)
                              .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(18, 18, 18)
                              .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                              .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                     .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(btnlistadopaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(jPanel3Layout.createSequentialGroup()
                                 .addGap(38, 38, 38)
                                 .addComponent(jLabel10)))
                           .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(btnasignarpaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(jPanel3Layout.createSequentialGroup()
                                 .addGap(33, 33, 33)
                                 .addComponent(jLabel9))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel3Layout.createSequentialGroup()
                              .addGap(141, 141, 141)
                              .addComponent(jLabel12))
                           .addGroup(jPanel3Layout.createSequentialGroup()
                              .addGap(112, 112, 112)
                              .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                       .addGap(29, 29, 29)
                                       .addComponent(jLabel15)
                                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                       .addComponent(btnreportepaquetesproceso, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                       .addGap(18, 18, 18)
                                       .addComponent(btnreportepaquetesentregados, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                       .addComponent(btnreportepaquetesinasignar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGap(180, 180, 180)
                                    .addComponent(jLabel16)
                                    .addGap(65, 65, 65)
                                    .addComponent(jLabel17)
                                    .addGap(50, 50, 50)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnreportepaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnreportespaquetesasignados, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnreportepaquetesrecibicos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                  .addContainerGap())
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                  .addGap(0, 0, Short.MAX_VALUE)
                  .addComponent(jLabel7)
                  .addGap(265, 265, 265))))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addComponent(jLabel11)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jLabel8)
               .addComponent(jLabel13))
            .addGap(61, 61, 61)
            .addComponent(jLabel14)
            .addGap(84, 84, 84))
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel7)
            .addGap(32, 32, 32)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel2)
                     .addComponent(jLabel3)
                     .addComponent(jLabel4))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel5)
                     .addComponent(jLabel6))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addGap(39, 39, 39)
                  .addComponent(jLabel11)
                  .addGap(18, 18, 18)
                  .addComponent(jLabel9)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(btnasignarpaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addGap(28, 28, 28)
                  .addComponent(jLabel8)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(jLabel12)
                     .addComponent(jLabel13))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(btnreportepaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(btnreportespaquetesasignados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jLabel14)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btnreportepaquetesrecibicos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel10)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(btnlistadopaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(jLabel15)
                     .addComponent(jLabel16))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(btnreportepaquetesproceso, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(btnreportepaquetesentregados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel17)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(btnreportepaquetesinasignar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(6, 6, 6))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

      mn.agregarPaquete();
   }//GEN-LAST:event_btnagregarActionPerformed

   private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
     mn.modificarPaquetes();
   }//GEN-LAST:event_btneditarActionPerformed

   private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
      mn.eliminarPaquetes();
   }//GEN-LAST:event_btneliminarActionPerformed

   private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
     mn.listadoPaquetes();
   }//GEN-LAST:event_btnlistarActionPerformed

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
     // ModelsPaquetes modp = new ModelsPaquetes();
      //ModelsMetodosPaquetes modmp = new ModelsMetodosPaquetes();
      //frmpaquete frmp = new frmpaquete();
      //ControllersPaquetes ctrl = new ControllersPaquetes(modp, modmp, frmp);
      //ctrl.iniciar();

      //Instanciamos el modelo, metodos y formularios

     /* frmpaquete frmp = new frmpaquete();
      frmModificarpaquete frmmp = new frmModificarpaquete();
      frmeliminarpaquetes frmep = new frmeliminarpaquetes();

      ControllersPaquetes ctrl = new ControllersPaquetes(modp, modmp, frmp);
      ControllerProcesoModificarPaquetes controllerModificar = new ControllerProcesoModificarPaquetes(modp, modmp, frmmp);
      ControllerProcesoEliminarPaquetes controllerProcesoEliminarPaquetes = new ControllerProcesoEliminarPaquetes(modp, modmp, frmep);
      controllerModificar.iniciar();
      controllerProcesoEliminarPaquetes.iniciar();
      ctrl.iniciar();
      controllerModificar.iniciar();
      controllerProcesoEliminarPaquetes.iniciar();
*/
      /*frmp.setVisible(true);
      frmmp.setVisible(true);
      frmp.setVisible(true);*/
 /* ModelsPaquetes mod = new ModelsPaquetes();
        ModelsMetodosPaquetes modC = new ModelsMetodosPaquetes();
        frmpaquete frm = new frmpaquete();*/
      // ControllersPaquetes ctrl = new ControllersPaquetes(mod, modC, frm);
      //frm.setVisible(true);

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new frmMenuPaquetes().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   public javax.swing.JButton btnagregar;
   public javax.swing.JButton btnasignarpaquetes;
   public javax.swing.JButton btnbuscar;
   public javax.swing.JButton btneditar;
   public javax.swing.JButton btneliminar;
   public javax.swing.JButton btnlistadopaquetes;
   public javax.swing.JButton btnlistar;
   public javax.swing.JButton btnreportepaquetes;
   public javax.swing.JButton btnreportepaquetesentregados;
   public javax.swing.JButton btnreportepaquetesinasignar;
   public javax.swing.JButton btnreportepaquetesproceso;
   public javax.swing.JButton btnreportepaquetesrecibicos;
   public javax.swing.JButton btnreportespaquetesasignados;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel14;
   private javax.swing.JLabel jLabel15;
   private javax.swing.JLabel jLabel16;
   private javax.swing.JLabel jLabel17;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel3;
   // End of variables declaration//GEN-END:variables
}
