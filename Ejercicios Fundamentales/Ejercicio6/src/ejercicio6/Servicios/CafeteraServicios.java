
package ejercicio6.Servicios;

import ejercicio6.Entidades.Cafetera;

import java.util.Scanner;


public class CafeteraServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera llenarCafetera(){
        Cafetera cafe = new Cafetera();
        
        cafe.setCapacidadMaxima(3.5);
        cafe.setCantidadActual(3.5);
        
        
        return cafe;
    }
    public void servirTaza(Cafetera cafe){
        System.out.println("Indique la capacidad de la taza (en litros) que quiere servir");
        double taza = leer.nextDouble();
        if(cafe.getCantidadActual()>= taza){
            System.out.println("La taza se lleno");
            cafe.setCantidadActual(cafe.getCantidadActual()-taza);
        }else
        {
            taza-= cafe.getCantidadActual();
            System.out.println("La taza no se lleno. Faltaron "+taza+" litros para llenarse.");
            cafe.setCantidadActual(0);
        }
        System.out.println("A la cafetera le quedan: " +cafe.getCantidadActual()+ " litros de cafe.");
    }
    public void vaciarCafetera(Cafetera cafe){
        if(cafe.getCantidadActual()==0){
            System.out.println("La cafetera ya esta vacia.");
        }else{
        cafe.setCantidadActual(0);
    }
}
    public void agregarCafe(Cafetera cafe){
        System.out.println("Cuanto cafe desea agregar");
        double x = leer.nextDouble();
        if(x+cafe.getCantidadActual()>cafe.getCapacidadMaxima()){
            System.out.println("La cantidad que desea agregar supera la capacidad maxima");
        }else{
            cafe.setCantidadActual(x+cafe.getCantidadActual());
            System.out.println("La cafetera ahora tiene "+cafe.getCantidadActual()+" litros de cafe.");
        }
    }
}
