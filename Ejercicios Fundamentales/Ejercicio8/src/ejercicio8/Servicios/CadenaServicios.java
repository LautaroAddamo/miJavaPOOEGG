package ejercicio8.Servicios;

import ejercicio8.Entidades.Cadena;

import java.util.Scanner;

public class CadenaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        Cadena crear = new Cadena();
        System.out.println("Ingrese una frase");
        crear.setFrase(leer.next());

        crear.setLongitud(crear.getFrase().length());
        return crear;

    }

    public void mostrarVocales(Cadena crear) {
        int cont = 0;
        for (int i = 0; i < crear.getLongitud(); i++) {
            if ((crear.getFrase().charAt(i) == 'a') || (crear.getFrase().charAt(i) == 'e') || (crear.getFrase().charAt(i) == 'i') || (crear.getFrase().charAt(i) == 'o') || (crear.getFrase().charAt(i) == 'u')) {
                cont++;
            }

        }
        System.out.println("La frase ingresada tiene " + cont + " vocales");
    }

    public void invertirFrase(Cadena crear) {
        String invertida = "";
        for (int i = crear.getLongitud() - 1; i >= 0; i--) {
            invertida += crear.getFrase().charAt(i);
        }
        System.out.println(invertida);
    }

    public void vecesRepetido(Cadena crear) {
        System.out.println("Ingrese el caracter que desea buscar");
        char x = leer.next().charAt(0);
        int cont = 0;
        int pos = 0;
        pos = crear.getFrase().indexOf(x);
        while (pos != -1) {
            cont++;
            pos = crear.getFrase().indexOf(x, pos + 1);

        }
        System.out.println("Su caracter se encuentra repetido " + cont + " veces.");
    }
    public void compararLongitud(Cadena crear){
        System.out.println("Ingrese otra frase");
        String frase2 = leer.next();
        int x = crear.getFrase().compareTo(frase2);
        if (x==0) {
            System.out.println("Las frases tienen la misma longitud");
        }
        else if (x<0){
            System.out.println("La segunda frase tiene "+-x + " caracteres mas");
        }
        else if(x>0){
            System.out.println("La primer frase tiene "+x +" caracteres mas");
        }
            
        }
    public void unirFrases(Cadena crear){
        System.out.println("Ingrese la frase que desea unir a la principal");
        String frase2 = leer.next();
        System.out.println(crear.getFrase().concat(frase2));
    }
    public void reemplazar(Cadena crear){
        System.out.println("Ingrese el caracter que desea utilizar");
        char x = leer.next().charAt(0);
        System.out.println(crear.getFrase().replace('a', x));
        }
    public void contiene(Cadena crear){
        System.out.println("Ingrese la letra que desea buscar");
        String x = leer.next();
       
        System.out.println("El caracter se encuentra en la frase?: "+crear.getFrase().contains(x));
        
        
    }
    }

