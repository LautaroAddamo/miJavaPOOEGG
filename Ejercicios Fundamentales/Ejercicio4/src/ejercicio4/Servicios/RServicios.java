package ejercicio4.Servicios;

import ejercicio4.Entidades.Rectangulo;
import java.util.Scanner;

public class RServicios {

    public Rectangulo crearRectangulo() {
        Rectangulo rec = new Rectangulo();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la base del rectangulo");
        rec.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        rec.setAltura(leer.nextInt());
        return rec;
    }

    public void superficie(Rectangulo rec) {
        int sp = rec.getBase() * rec.getAltura();
        System.out.println("La superficie es " + sp);
    }

    public void perimetro(Rectangulo rec) {
        int per = (rec.getBase() + rec.getAltura()) * 2;
        System.out.println("El perimetro es " + per);

    }

    public void cuadrado(Rectangulo rec) {
        for (int i = 1; i <= rec.getAltura(); i++) {
            for (int j = 1; j <= rec.getBase(); j++) {
                
                    System.out.print("*");
               
                }
                System.out.println("");

            }
        }
    }

