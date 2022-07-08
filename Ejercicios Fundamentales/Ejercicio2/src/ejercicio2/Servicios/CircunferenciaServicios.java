package ejercicio2.Servicios;

import ejercicio2.Entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicios {

    public Circunferencia crearCircunferencia() {
        //Instancio un objeto
        Circunferencia c = new Circunferencia();

        //lleno los atributos. radio en este caso
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        c.setRadio(leer.nextDouble());
        return c;

    }

    public void area(Circunferencia c){
        double area = 3.14*(c.getRadio()*c.getRadio());
        System.out.println("El area de la circunferencia es: "+area);
        
    }
    public void perimetro(Circunferencia c){
        double perimetro = 2 * 3.14 * c.getRadio();
        System.out.println("El perimetro de la circunferencia es: "+perimetro);
    }

}
