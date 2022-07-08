package ejercicio5;

import ejercicio5.Entidades.Año;
import ejercicio5.Servicios.AñoServicios;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        AñoServicios as = new AñoServicios();
        //as.adivinar();

        
        as.acierto(as.adivinar());
        
        

    }

}
