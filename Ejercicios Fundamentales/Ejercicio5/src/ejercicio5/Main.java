package ejercicio5;

import ejercicio5.Entidades.Cuenta;
import ejercicio5.Servicios.CuentaServicios;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaServicios cs = new CuentaServicios();
        Cuenta c1 = cs.crearCuenta();
        String opc2 = "";
        do {
            System.out.println("MENU");
            System.out.println("Ingrese una opcion para las operaciones de su cuenta:");
            System.out.println("1. Ingresar dinero");
            System.out.println("----------");
            System.out.println("2. Retirar dinero");
            System.out.println("----------");

            System.out.println("3. Extraccion rapida");
            System.out.println("----------");

            System.out.println("4. Consulta de saldo");
            System.out.println("----------");

            System.out.println("5. Consulta de datos");
            System.out.println("----------");

            System.out.println("6. SALIR");
            System.out.println("----------");

            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    cs.ingreso(c1);
                    break;
                case 2:
                    cs.retiro(c1);
                    break;
                case 3:
                    cs.extraccionRapida(c1);
                    break;
                case 4:
                    cs.consultarSaldo(c1);
                    break;
                case 5:
                    cs.consultarDatos(c1);
                    break;
                case 6:
                    System.out.println("Desea salir? s/n");
                    opc2 = leer.next();
                    break;
                default:
                    System.out.println("Opcion invalida.");

            }
        } while (!opc2.equals("s"));

    }

}
