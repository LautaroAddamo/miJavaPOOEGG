package ejercicio8;

import ejercicio8.Entidades.Cadena;
import ejercicio8.Servicios.CadenaServicios;

public class Main {

    public static void main(String[] args) {
        CadenaServicios cs = new CadenaServicios();
        Cadena frase = cs.crearCadena();
        cs.mostrarVocales(frase);
        cs.invertirFrase(frase);
        cs.vecesRepetido(frase);
        cs.compararLongitud(frase);
        cs.unirFrases(frase);
        cs.reemplazar(frase);
        cs.contiene(frase);
    }

}
