
package ejercicio5.Servicios;

import ejercicio5.Entidades.Año;
import java.util.Arrays;
import java.util.Scanner;



public class AñoServicios {
    Scanner leer = new Scanner(System.in);
    
    public Año adivinar(){
        
        Año a = new Año();
        a.setMesSecreto(a.getMes()[(int) (Math.random() * 12)]);
        
        return a;
        
        //System.out.println(Arrays.toString(a.getMes()));
        
        
    }
    public void acierto(Año a){
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        String x = leer.next();

       
        do {
            if (!x.equals(a.getMesSecreto())) {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
                x = leer.next();
            }
        } while (!x.equals(a.getMesSecreto()));

        System.out.println("Ha acertado!!");
    }
    
}
