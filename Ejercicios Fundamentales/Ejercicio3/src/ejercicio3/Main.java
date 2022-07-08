
package ejercicio3;

import ejercicio3.Entidades.Operacion;
import ejercicio3.Servicios.OpServicios;


public class Main {

   
    public static void main(String[] args) {
        OpServicios os = new OpServicios();
        Operacion op = os.crearOperacion();
        System.out.println("La suma entre "+op.getNumero1()+" y " +op.getNumero2()+ " es : "+os.sumar(op));
        System.out.println("La resta entre "+op.getNumero1()+" y " +op.getNumero2()+ " es : "+os.resta(op));
        System.out.println("La multiplicacion entre "+op.getNumero1()+" y " +op.getNumero2()+ " es : "+os.multiplicar(op));
        System.out.println("La division entre "+op.getNumero1()+" y " +op.getNumero2()+  "es : "+os.dividir(op));
    }
    
}
