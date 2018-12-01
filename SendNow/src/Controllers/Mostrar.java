
package Controllers;

import Models.Cliente;
import Models.Personas;
import Views.AgreCL;
import Views.EliminarCL;
import Views.ModificarClient;


public class Mostrar {
    public static void main(String Args[]){
        Personas per = new Personas();
        Cliente cli = new Cliente();
        AgreCL agre = new AgreCL();
        EliminarCL el = new EliminarCL();
        ModificarClient mo= new ModificarClient();
        
        MVC h= new MVC(per, cli, el);
        mo.setVisible(true);
        mo.setLocationRelativeTo(null);
        
        
        
        
        
    }
    
   
    
}
