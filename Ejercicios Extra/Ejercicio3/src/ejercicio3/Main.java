
package ejercicio3;

import ejercicio3.Entidades.Raices;
import ejercicio3.Servicios.RaicesServicios;


public class Main {

    
    public static void main(String[] args) {
       RaicesServicios rs = new RaicesServicios();
       
       Raices ecuacion = rs.coeficientes();
        System.out.println("El discriminante es: "+rs.getDiscriminante(ecuacion));
       
        System.out.println("La ecuacion tiene dos soluciones? "+rs.tieneRaices(ecuacion));
        
        System.out.println("La ecuacion tiene una unica solucion? "+rs.tieneRaiz(ecuacion));
        
        rs.obtenerRaices(ecuacion);
        
        
        
        
        
        
    }
    
}
