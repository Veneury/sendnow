
package Models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;


public  class Personas{
    /*Creando variables*/
   private int id;
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String sexo;
    protected String estado_civil;
    protected String calle;
    protected String barrio;
    protected String sector;
    protected String municipio;
    protected String ciudad;
    protected String estado;
    protected String codigo_postal;
    protected String pais;
    protected String telefono;
    protected String celular;
    protected String correo;
    protected Date fecha;
    
    
    /*Creando Metodos abstractos*/
 
    
    /*Creando Constructor*/
    public Personas(String identificacion, String nombre, String apellido,String sexo, String estado_civil,String calle, String barrio, String sector, String municipio, String ciudad, String estado, String codigo_postal, String pais, String telefono, String correo, Date fecha) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo=sexo;
        this.estado_civil= estado_civil;
        this.calle = calle;
        this.barrio = barrio;
        this.sector = sector;
        this.municipio = municipio;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigo_postal = codigo_postal;
        this.pais = pais;
        this.telefono = telefono;
        this.celular=celular;
        this.correo = correo;
        this.fecha=fecha;
    }

    
    
 
    public Personas()
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo=sexo;
        this.estado_civil= estado_civil;
        this.calle = calle;
        this.barrio = barrio;
        this.sector = sector;
        this.municipio = municipio;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigo_postal = codigo_postal;
        this.pais = pais;
        this.telefono = telefono;
        this.celular=celular;
        this.correo = correo;
        this.fecha=fecha;
    }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
     
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
    
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

  
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
