
package ejercicio7.Servicios;




import ejercicio7.Entidades.Persona;
import java.util.Scanner;




public class PersonaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        Persona crear = new Persona();
        System.out.println("Ingrese el nombre");
        crear.setNombre(leer.next());
        System.out.println("Indique la edad");
        crear.setEdad(leer.nextInt());
        do{
        System.out.println("Indique el sexo.¨M¨ por mujer. ¨H¨ por hombre. ¨O¨ por otro");
        crear.setSexo(leer.next());
        }while((!crear.getSexo().equals("M")) && (!crear.getSexo().equals("O")) && (!crear.getSexo().equals("H")));
        System.out.println("Indique el peso");
        crear.setPeso(leer.nextDouble());
        System.out.println("Indique la altura");
        crear.setAltura(leer.nextDouble()); 
        return crear;
    }
   
    
    public int calcularIMC(Persona crear){
        double pesoideal;
        int IMC=0;
        pesoideal = crear.getPeso()/(crear.getAltura()*crear.getAltura());
        if (pesoideal<20){
            IMC = -1;
        }
        else if (pesoideal>=20 && pesoideal<=25){
            IMC = 0;
        }
        else if (pesoideal>25){
            IMC = 1;
        }
        return IMC;
    }
    public boolean esMayorDeEdad(Persona crear){
        boolean e=false;
        if(crear.getEdad()>=18){
            e = true;
        }
        return e;
    }
    
}
