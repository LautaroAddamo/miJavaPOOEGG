package ejercicio12.Servicios;

import ejercicio12.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona crear = new Persona();
        System.out.println("Ingrese el nombre");
        crear.setNombre(leer.next());

        System.out.println("Ingrese el dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        crear.setFechaDeNacimiento(fecha);
        return crear;

    }

    public int calcularEdad(Persona crear) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - crear.getFechaDeNacimiento().getYear();
        return edad;
    }

    public boolean menorQue(Persona crear) {
        System.out.println("Indique la nueva persona a comparar");
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        Date newFecha = new Date(anio - 1900, mes - 1, dia);
        boolean band = true;
        if (crear.getFechaDeNacimiento().getYear() < newFecha.getYear()) {
            band = false;
        }
        return band;

    }
    public void mostrarPersona(Persona crear){
        System.out.println(crear.toString());
    }
}
