package ejercicio2;

import ejercicio2.Entidades.Puntos;
import ejercicio2.Servicios.PuntosServicios;

public class Main {

    public static void main(String[] args) {
        PuntosServicios ps = new PuntosServicios();

        Puntos p1 = ps.crearPuntos();
        Puntos p2 = ps.crearPuntos();
        

  
        System.out.println("La distancia entre los puntos es: "+ps.calcularDistancia(p1, p2));        
    }
    
}
