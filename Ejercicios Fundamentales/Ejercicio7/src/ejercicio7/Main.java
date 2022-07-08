package ejercicio7;

import ejercicio7.Entidades.Persona;
import ejercicio7.Servicios.PersonaServicios;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int mayor = 0;
//        int menor = 0;
//        int pmayor;
//        int pmenor;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicios ps = new PersonaServicios();
//        
//        Persona p1 = ps.crearPersona();
//        System.out.println(p1.toString());
//        int IMCp1 = ps.calcularIMC(p1);
//        if (ps.esMayorDeEdad(p1) == true) {
//            mayor++;
//        } else {
//            menor++;
//        }
//
//        Persona p2 = ps.crearPersona();
//        System.out.println(p2.toString());
//        int IMCp2 = ps.calcularIMC(p2);
//        if (ps.esMayorDeEdad(p2) == true) {
//            mayor++;
//        } else {
//            menor++;
//        }
//        Persona p3 = ps.crearPersona();
//        System.out.println(p3.toString());
//        int IMCp3 = ps.calcularIMC(p3);
//        if (ps.esMayorDeEdad(p3) == true) {
//            mayor++;
//        } else {
//            menor++;
//        }
//        Persona p4 = ps.crearPersona();
//        System.out.println(p4.toString());
//        int IMCp4 = ps.calcularIMC(p4);
//        if (ps.esMayorDeEdad(p4) == true) {
//            mayor++;
//        } else {
//            menor++;
//        }
//        //int pmayor, pmenor;
//
//        //Promedio de mayoria de edad
//        pmayor = (mayor * 100) / 4;
//        pmenor = (menor * 100) / 4;
//        System.out.println("El porcentaje de mayores es: " + pmayor + " %");
//        System.out.println("El porcentaje de menores es: " + pmenor + " %");
//        int low = 0, high = 0, medium = 0;
//        if (IMCp1 == -1) {
//            low++;
//        } else if (IMCp1 == 0) {
//            medium++;
//        } else if (IMCp1 == 1) {
//            high++;
//        }
//
//        if (IMCp2 == -1) {
//            low++;
//        } else if (IMCp2 == 0) {
//            medium++;
//        } else if (IMCp2 == 1) {
//            high++;
//        }
//        if (IMCp3 == -1) {
//            low++;
//        } else if (IMCp3 == 0) {
//            medium++;
//        } else if (IMCp3 == 1) {
//            high++;
//        }
//        if (IMCp4 == -1) {
//            low++;
//        } else if (IMCp4 == 0) {
//            medium++;
//        } else if (IMCp4 == 1) {
//            high++;
//        }
//
//        int plow, phigh, pmedium;
//        plow = (low * 100) / 4;
//        phigh = (high * 100) / 4;
//        pmedium = (medium * 100) / 4;
//        System.out.println("El promedio de personas que estan por debajo de su peso es " + plow + " %");
//        System.out.println("El promedio de personas que estan por encima de su peso es " + phigh + " %");
//        System.out.println("El promedio de personas que estan en su peso ideal es " + pmedium + " %");
//
//        System.out.println(low);
        
        Persona p = null;
        try {

            ps.esMayorDeEdad(p);

        } catch (Exception e) {
            System.out.println("El objeto es nulo");
            System.out.println("Error: " + e.getMessage());
        }
            System.out.println("CHAU");

    }

}
