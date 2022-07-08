
package ejercicio10.Servicios;

import ejercicio10.Entidades.Array;
import java.util.Arrays;
/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
*/

public class ArrayServicios {
    public void cargarArray(){
        Array arr1 = new Array();
        double A1[] = new double [50];
       
        for (int i = 0; i < A1.length; i++) {
            A1[i]= Math.random()*50;
        }
        arr1.setA(A1);
        
        
        System.out.println("El arreglo A es:" );
        printArray(arr1.getA());
        
        System.out.println("El Arreglo A ordenado es: ");
        Arrays.sort(arr1.getA());
        printArray(arr1.getA());
        
        arr1.setB(Arrays.copyOf(arr1.getA(), 20));
        
            
        Arrays.fill(arr1.getB(), 10,20, 0.5);
        

        System.out.println("El arreglo B es:");

        printArray(arr1.getB());

        
    }
    
    public void printArray(double array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
