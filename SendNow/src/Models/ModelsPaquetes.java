/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author TooDe
 */
public class ModelsPaquetes {
   private int id;
   private String codigo;
   private String tipo;
   private String nombre;
   private String peso;
   private String descripcion;
   private String status;

   public ModelsPaquetes() {
      this.codigo="";
      this.tipo="";
      this.nombre="";
      this.peso="";
      this.descripcion="";
      this.status="";
   }

   public ModelsPaquetes(String codigo, String tipo, String nombre, String peso, String descripcion, String status) {
      this.codigo = codigo;
      this.tipo = tipo;
      this.nombre = nombre;
      this.peso = peso;
      this.descripcion = descripcion;
      this.status = status;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }
   

   public String getCodigo() {
      return codigo;
   }

   public void setCodigo(String codigo) {
      this.codigo = codigo;
   }

   public String getTipo() {
      return tipo;
   }

   public void setTipo(String tipo) {
      this.tipo = tipo;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getPeso() {
      return peso;
   }

   public void setPeso(String peso) {
      this.peso = peso;
   }

   public String getDescripcion() {
      return descripcion;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }
   
   
   
   
   
}
