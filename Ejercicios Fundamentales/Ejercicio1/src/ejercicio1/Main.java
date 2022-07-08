package ejercicio1;

import ejercicio1.Entidades.Libro;
import ejercicio1.Servicios.LibroServicio;

public class Main {

    public static void main(String[] args) {
        LibroServicio ls = new LibroServicio();//Instancio un objeto para utilizar las funciones del servicio
        Libro libro1 = ls.altaLibro(); //Creo el objeto libro1
        //dos formas de mostrar por pantalla los atributos del libro1
        System.out.println(libro1.toString());
        System.out.println("El ISBN es: "+libro1.getISBN()+ ". El titulo es: "+libro1.getTitulo()+" . El autor es: "+libro1.getAutor()+" . Y tiene "+libro1.getPaginas()+" paginas.");
    }

}
