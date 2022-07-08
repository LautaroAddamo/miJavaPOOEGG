
package ejercicio9;

import ejercicio9.Entidades.Matematica;
import ejercicio9.Servicios.MatematicaServicio;


public class Main {

    
    public static void main(String[] args) {
        MatematicaServicio ms = new MatematicaServicio();
        Matematica resolucion = ms.darValor();
        System.out.println(resolucion.toString());
        System.out.println("El mayor es: "+ms.devolverMayor(resolucion));
        ms.calcularPotencia(resolucion);
        ms.calcularRaiz(resolucion);
    }
    
}
