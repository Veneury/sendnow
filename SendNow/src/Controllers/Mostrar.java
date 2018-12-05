
package Controllers;

import Models.Cliente;
import Models.Personas;
import Models.Usuario;
import Views.Administrad;
import Views.AgreCL;
import Views.ClienteOP;
import Views.EliminarCL;
import Views.Login;
import Views.MenuCL;
import Views.ModificarClient;
import Views.RegistrarUsu;
import Views.VerClientes;
import Views.newMenu;





public class Mostrar {
    
        Personas per = new Personas();
        Cliente cli = new Cliente();
        AgreCL agre = new AgreCL();
        EliminarCL el = new EliminarCL();
        ModificarClient mo= new ModificarClient();
        VerClientes ver= new VerClientes();
        Usuario usu = new Usuario();
        RegistrarUsu regis = new RegistrarUsu();
         Administrad admi = new Administrad();
         newMenu men= new newMenu();
         ClienteOP client = new ClienteOP();
         Login login = new Login();

        
        
        
        

        
 public void AgregarCliente(){
     
     AgreCL agre = new AgreCL();
     //MVC  h = new MVC(per, cli, login);
     login.setVisible(true);
     login.setLocationRelativeTo(null);
 
 }
    
}
