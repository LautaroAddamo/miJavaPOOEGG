/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.Servicios;

import ejercicio3.Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Lautaro
 */
public class RaicesServicios {

    Scanner leer = new Scanner(System.in);

    public Raices coeficientes() {
        Raices crear = new Raices();
        System.out.println("Ingrese los 3 coeficientes a usar en la ecuacion");
        crear.setA(leer.nextInt());
        crear.setB(leer.nextInt());
        crear.setC(leer.nextInt());
        return crear;
    }

    public double getDiscriminante(Raices crear) {
        double dis = (crear.getB() * crear.getB()) - 4 * crear.getA() * crear.getC();
        return dis;
    }

    public boolean tieneRaices(Raices crear) {
       

        if (getDiscriminante(crear) >= 0) {
            return true;
        }
        return false;
    }

    public boolean tieneRaiz(Raices crear) {
        if (getDiscriminante(crear) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices(Raices crear) {
        if (tieneRaices(crear) == true) {
            System.out.println((crear.getB() + Math.sqrt(crear.getB() * crear.getB() - 4 * crear.getA() * crear.getC())) / crear.getA());

            System.out.println((crear.getB() - Math.sqrt(crear.getB() * crear.getB() - 4 * crear.getA() * crear.getC())) / crear.getA());
        }
    }

    public void obtenerRaiz(Raices crear) {
        if (tieneRaiz(crear) == true) {
            System.out.println((crear.getB() + Math.sqrt(crear.getB() * crear.getB() - 4 * crear.getA() * crear.getC())) / crear.getA());
        }
    }

    /*publc void calcular(Raices crear){
        
    }
     */
}
