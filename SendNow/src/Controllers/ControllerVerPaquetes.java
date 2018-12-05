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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author TooDe
 */
public class ControllerVerPaquetes implements ActionListener{
   
   private ModelsPaquetes modp;
   private ModelsMetodosPaquetes modmp;
   private frmVerPaquetes listado;

   public ControllerVerPaquetes(ModelsPaquetes modp, ModelsMetodosPaquetes modmp, frmVerPaquetes listado) {
      this.modp = modp;
      this.modmp = modmp;
      this.listado = listado;
       this.listado.btbRefrescar.addActionListener(this);
   }


   
   public void LlenarTabla(JTable tablaD) {
      DefaultTableModel modeloT = new DefaultTableModel();
      tablaD.setModel(modeloT);

      modeloT.addColumn("codigo_paquete");
      modeloT.addColumn("Tipo_paquete");
      modeloT.addColumn("nombre_paquetes");
      modeloT.addColumn("descripcion");
      modeloT.addColumn("peso");
      modeloT.addColumn("status");

      Object[] columna = new Object[6];

      int numRegistros = modmp.listPaquetes().size();

      for (int i = 0; i < numRegistros; i++) {
         columna[0] = modmp.listPaquetes().get(i).getCodigo();
         columna[1] = modmp.listPaquetes().get(i).getTipo();
         columna[2] = modmp.listPaquetes().get(i).getNombre();
         columna[3] = modmp.listPaquetes().get(i).getDescripcion();
         columna[4] = modmp.listPaquetes().get(i).getPeso();
         columna[5] = modmp.listPaquetes().get(i).getStatus();
         modeloT.addRow(columna);

      }
   }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==listado.btbRefrescar)
       {
          LlenarTabla(listado.Tabla);
       } 
}
    
       public void iniciar() {
     listado.setTitle("Listado de paquetes");
      listado.setLocationRelativeTo(null);
   }
}
