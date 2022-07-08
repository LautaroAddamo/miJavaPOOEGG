package ejercicio6.Servicios;

import ejercicio6.Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado crear = new Ahorcado();

    public Ahorcado crearJuego() {
        //Ahorcado crear = new Ahorcado();

        System.out.println("Ingrese la palabra a buscar");
        String palabra = leer.next();

        char[] vector = palabra.toCharArray();

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");

        }

        crear.setVector(vector);
        System.out.println("");

        System.out.println("Ingrese la cantidad de fallas maxima para este juego");
        crear.setJugadas(leer.nextInt());

        crear.setLetrasEncontradas(0);

        return crear;

    }

    public void longitud(Ahorcado crear) {
        System.out.println("Longitud de la palabra " + crear.getVector().length);

    }

    public void buscar(Ahorcado crear, char x) {
        int cont = 0;

        for (int i = 0; i < crear.getVector().length; i++) {
            if (x == crear.getVector()[i]) {
                cont++;
            }
        }
        if (cont == 1) {
            System.out.println("La letra se encuentra en la palabra " + cont + " vez");
        } else if (cont > 1) {
            System.out.println("La letra se encuentra en la palabra " + cont + " veces");
        } else {
            System.out.println("La letra no se encuentra en la palabra");
        }

    }

    public boolean encontradas(Ahorcado crear, char x) {
        boolean verificador = false;
        int total = crear.getVector().length;
        for (int i = 0; i < crear.getVector().length; i++) {
            if (x == crear.getVector()[i]) {
                verificador = true;
                crear.setLetrasEncontradas(crear.getLetrasEncontradas() + 1);
                total--;
            }
        }
        if (verificador == false) {
            crear.setJugadas(crear.getJugadas() - 1);
        }
        System.out.println("Se han encontrado " + crear.getLetrasEncontradas() + " letras");
        System.out.println("Restan " + total + " letras por encontrar");

        return verificador;

    }

    public void intentos(Ahorcado crear) {
        System.out.println("Te quedan " + crear.getJugadas() + " fallos.");
    }

    public void juego(Ahorcado crear, char x) {

        buscar(crear, x);
        encontradas(crear, x);
        intentos(crear);

    }
}
