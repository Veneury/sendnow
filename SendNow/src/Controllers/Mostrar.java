
package Controllers;

import Models.Cliente;
import Models.Personas;
import Views.AgreCL;
import Views.EliminarCL;


public class Mostrar {
    public static void main(String Args[]){
        Personas per = new Personas();
        Cliente cli = new Cliente();
        AgreCL agre = new AgreCL();
        
        MVC h= new MVC(per, cli, agre);
        h.verAgregarClientes();
        agre .setVisible(true);
        
    }
    
   
    
}
