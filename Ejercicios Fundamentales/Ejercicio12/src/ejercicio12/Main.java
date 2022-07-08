
package ejercicio12;

import ejercicio12.Entidades.Persona;
import ejercicio12.Servicios.PersonaServicios;
import java.util.Date;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicios ps = new PersonaServicios();
        Persona p1 = ps.crearPersona();
        Date fechaActual = new Date();
        System.out.println(p1.getNombre()+" .Tiene " +ps.calcularEdad(p1)+" años.");
        
        System.out.println("La segunda persona es mayor que la primera? "+ps.menorQue(p1));
        
        ps.mostrarPersona(p1);
    }
    
}
