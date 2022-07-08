
package ejercicio2;

import ejercicio2.Entidades.Circunferencia;
import ejercicio2.Servicios.CircunferenciaServicios;


public class Main {

    
    public static void main(String[] args) {
        CircunferenciaServicios cs = new CircunferenciaServicios();//Instancio un objeto para usar las funcionalidades de la clase
        Circunferencia c = cs.crearCircunferencia();
        cs.area(c);
        cs.perimetro(c);
    }
    
}
