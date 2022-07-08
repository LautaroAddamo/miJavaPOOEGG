
package ejercicio3.Servicios;

import ejercicio3.Entidades.Operacion;
import java.util.Scanner;



public class OpServicios {
    //Metodo para iniciar y llenar el objeto
    public Operacion crearOperacion(){
    Operacion op = new Operacion();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer numero");
        op.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        op.setNumero2(leer.nextInt());
        return op;
    }
    public int sumar(Operacion op){
        int suma = op.getNumero1()+op.getNumero2();
        return suma;
    }//metodo para sumar
    public int resta(Operacion op){
        int resta = op.getNumero1()-op.getNumero2();
        return resta;
    }//metodo para restar
    public int multiplicar(Operacion op){
        int multi;
        if (op.getNumero1() == 0 || op.getNumero2() == 0){
            multi = 0;
            System.out.println("ERROR!! Algunos de los numeros es 0.");
        }else{
            multi = op.getNumero1()*op.getNumero2();
        }
        return multi;
    }//metodo para multiplicar
    public double dividir(Operacion op){
        double div;
        if (op.getNumero1() == 0 || op.getNumero2() == 0){
            div = 0;
            System.out.println("ERROR!! Algunos de los numeros es 0.");
        }else{
            div = op.getNumero1()/op.getNumero2();
        }
        return div;
    }//metodo para dividir
}
        
        
        
       
       
        

