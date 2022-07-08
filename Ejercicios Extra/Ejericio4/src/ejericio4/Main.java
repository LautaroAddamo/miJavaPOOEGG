
package ejericio4;

import ejericio4.Entidades.NIF;
import ejericio4.Servicios.NifServicios;


public class Main {

    
    public static void main(String[] args) {
        NifServicios ns = new NifServicios();
        
        NIF nuevoNif = ns.crearNif();
        
        ns.mostrar(nuevoNif);
        
    }
    
}
