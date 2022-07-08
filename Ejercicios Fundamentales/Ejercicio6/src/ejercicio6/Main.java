
package ejercicio6;

import ejercicio6.Entidades.Cafetera;
import ejercicio6.Servicios.CafeteraServicios;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicios cs = new CafeteraServicios();
        Cafetera cafe = cs.llenarCafetera();
        String opc2 = "";
        do{
        System.out.println("MENU");
        System.out.println("1.Servir taza de Cafe");
        System.out.println("2.Vaciar la cafetera");
        System.out.println("3.Agregar cafe a la cafetera");
        System.out.println("4.Apagar");
        int opc = leer.nextInt();
        
        
        switch(opc){
            case 1:
                cs.servirTaza(cafe);
                break;
            case 2:
                cs.vaciarCafetera(cafe);
                break;
            case 3:
                cs.agregarCafe(cafe);
                break;
            case 4:
                System.out.println("Desea apagar la cafetera. s/n");
                opc2 = leer.next();
                
                
        }
        }while(!opc2.equals("s"));
    }
    
}
