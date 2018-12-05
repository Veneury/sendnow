package Models;

public class Usuario {
    
   
    private String usuario;
    private String nombre;
    private String apellido;
    private String Correo;
    private String pass;
    private int id_tipo;

    public Usuario( int id_tipo, String usuario, String pass, String nombre, String Apellido, String Correo) {
       
        this.id_tipo = id_tipo;
        this.usuario = usuario;
        this.pass = pass;
        this.nombre = nombre;
        this.Correo = Correo;
        this.apellido = apellido;
    }

    public Usuario() {
        
        this.usuario = "";
        this.pass = "";
        this.nombre = "";
        this.apellido = "";
        this.Correo = "";
        this.id_tipo = 0;

    }


    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

   

}
