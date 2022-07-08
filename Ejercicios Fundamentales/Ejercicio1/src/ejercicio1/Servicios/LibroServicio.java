
package ejercicio1.Servicios;

import ejercicio1.Entidades.Libro;
import java.util.Scanner;

public class LibroServicio {
    public Libro altaLibro(){
    //Instancio un objeto
    Libro libro1 = new Libro();
    //Lleno los atributos
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN");
        libro1.setISBN(leer.next());
        System.out.println("Ingrese el titulo");
        libro1.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        libro1.setAutor(leer.next());
        System.out.println("Ingrese el numero de paginas");
        libro1.setPaginas(leer.nextInt());
        return libro1;
        
    
    
}
    
}
