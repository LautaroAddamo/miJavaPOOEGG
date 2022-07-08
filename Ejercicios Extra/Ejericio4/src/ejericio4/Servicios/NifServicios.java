
package ejericio4.Servicios;

import ejericio4.Entidades.NIF;
import java.util.Scanner;


public class NifServicios {
    Scanner leer = new Scanner(System.in);
    public NIF crearNif(){
        NIF crear = new NIF();
        System.out.println("Ingrese el DNI");
        crear.setDNI(leer.nextLong());
        long pos = crear.getDNI() % 23;
        char x = ' ';
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        for (int i = 0; i < 22; i++) {
            if (i==pos){
               x = letras[i];
            }
        }
        
        crear.setLetra(x);
        
        return crear;
                
    }
    
    public void mostrar(NIF crear){
        System.out.println(crear.getDNI()+"-"+crear.getLetra());
    }
    
}
