package ejercicio6;

import ejercicio6.Entidades.Ahorcado;
import ejercicio6.Servicios.AhorcadoServicios;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AhorcadoServicios as = new AhorcadoServicios();
        Ahorcado juego = as.crearJuego();
        as.longitud(juego);

        do {
            System.out.println("Ingrese una letra");
            char x = leer.next().charAt(0);
            as.juego(juego, x);
        } while (juego.getJugadas() > 0 && juego.getLetrasEncontradas() != juego.getVector().length);

        if (juego.getLetrasEncontradas() == juego.getVector().length) {
            System.out.println("FELICIDADES!! Encontro la palabra");
            for (int i = 0; i < juego.getVector().length; i++) {
                System.out.print(juego.getVector()[i] + " ");

            }
            System.out.println("");
        } else {
            System.out.println("Se ha quedado sin intentos, la palabra que buscaba era:");
            for (int i = 0; i < juego.getVector().length; i++) {
                System.out.print(juego.getVector()[i] + " ");
            }
            System.out.println("");
        }
    }
}
