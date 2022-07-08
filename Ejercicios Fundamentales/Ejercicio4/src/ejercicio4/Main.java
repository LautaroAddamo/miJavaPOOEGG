
package ejercicio4;

import ejercicio4.Entidades.Rectangulo;
import ejercicio4.Servicios.RServicios;


public class Main {

   
    public static void main(String[] args) {
        RServicios rs = new RServicios();
        Rectangulo rec = rs.crearRectangulo();
        rs.perimetro(rec);
        rs.superficie(rec);
        System.out.println("---------");
        rs.cuadrado(rec);
    }
    
}
