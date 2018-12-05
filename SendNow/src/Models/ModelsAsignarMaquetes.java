/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

/**
 *
 * @author TooDe
 */
public class ModelsAsignarMaquetes {
   
   private ModelsPaquetes paquete;
   private Personas personas;
   private Date fecha;

   public ModelsAsignarMaquetes(ModelsPaquetes paquete, Personas personas, Date fecha) {
      this.paquete = paquete;
      this.personas = personas;
      this.fecha = fecha;
   }

   public ModelsPaquetes getPaquete() {
      return paquete;
   }

   public void setPaquete(ModelsPaquetes paquete) {
      this.paquete = paquete;
   }

   public Personas getPersonas() {
      return personas;
   }

   public void setPersonas(Personas personas) {
      this.personas = personas;
   }

   public Date getFecha() {
      return fecha;
   }

   public void setFecha(Date fecha) {
      this.fecha = fecha;
   } 
   
}
