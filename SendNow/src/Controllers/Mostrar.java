
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
        EliminarCL el = new EliminarCL();
        
        MVC h= new MVC(per, cli, agre);
        h.verEliminarClientes();
        agre .setVisible(true);
        
    }
    
   
    
}
