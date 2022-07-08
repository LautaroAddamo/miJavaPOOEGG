package ejercicio5.Servicios;

import ejercicio5.Entidades.Cuenta;

import java.util.Scanner;


public class CuentaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        Cuenta c1 = new Cuenta();

        System.out.println("Ingrese su numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        c1.setDNI(leer.nextLong());
        System.out.println("Indique su saldo actual");
        c1.setSaldoActual(leer.nextDouble());
        return c1;
    }

    public void ingreso(Cuenta c1) {
        System.out.println("Indique el monto a ingresar");
        double n = leer.nextDouble();
        double total = n + c1.getSaldoActual();
        c1.setSaldoActual(total);

    }

    public void retiro(Cuenta c1) {
        System.out.println("Indique el monto a retirar");
        double n = leer.nextDouble();
        double saldo = c1.getSaldoActual();
        if (n > c1.getSaldoActual()) {
            c1.setSaldoActual(0);

            System.out.println("Retiro total, su saldo actual es " + c1.getSaldoActual());
        } else if (n < c1.getSaldoActual()) {
            saldo -= n;

        }
        c1.setSaldoActual(saldo);
        
    }

    public void extraccionRapida(Cuenta c1) {
        System.out.println("Extraccion rapida, maximo a retirar: 20% de su saldo");
        double n = leer.nextDouble();
        double saldo = c1.getSaldoActual();
        if (n > (c1.getSaldoActual() * 0.20)) {
            System.out.println("Supera el maximo permitido para esta accion");
        } else
        { 
            saldo -= n;
        }
       c1.setSaldoActual(saldo);
    }
    public void consultarSaldo(Cuenta c1){
        System.out.println("Su saldo actual es "+c1.getSaldoActual());
    }
    public void consultarDatos(Cuenta c1){
        System.out.println("El Nº de cuenta es: "+c1.getNumeroCuenta());
        System.out.println("El DNI es: "+c1.getDNI());
        
    }

}
