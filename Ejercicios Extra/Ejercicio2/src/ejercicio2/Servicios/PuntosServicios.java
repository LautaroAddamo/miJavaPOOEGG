package ejercicio2.Servicios;

import ejercicio2.Entidades.Puntos;
import java.util.Scanner;

public class PuntosServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Puntos crearPuntos() {
        Puntos crear = new Puntos();
        System.out.println("Ingrese las posiciones del punto");
        crear.setX(leer.nextInt());
        crear.setY(leer.nextInt());
       

        return crear;
    }
    
    public double calcularDistancia(Puntos p1, Puntos p2){
        double ct1 = p1.getX()- p2.getX();
        double ct2 = p1.getY()-p2.getY();
        double hip = Math.sqrt(ct1*ct1+ct2*ct2);
        return hip;
    }

}
