package Service;

import Entidad.Cuenta;
import java.util.Scanner;

public class CuentaService {

    public static Cuenta crearCuenta(Scanner read) {
        System.out.println("Ingrese su DNI");
        long dni = read.nextLong();
        while (dni < 1) {
            System.out.println("Incorrecto, intente nuevamente");
            dni = read.nextInt();
        }
        System.out.println("Ingrese el número de cuenta");
        int cuenta = read.nextInt();
        while (cuenta < 1) {
            System.out.println("Incorrecto, intente nuevamente");
            cuenta = read.nextInt();
        }
        double saldo = 0;
        return new Cuenta(cuenta, dni, saldo);
    }

    public static void ingreso(double plata, Cuenta c1) {
        c1.setSaldo(c1.getSaldo() + plata);
        System.out.println("Ingreso realizado. Saldo actual: " + c1.getSaldo());
    }

    public static void retirar(double retiro, Cuenta c1) {
        if (retiro > c1.getSaldo()) {
            System.out.println("Saldo insuficiente");
            c1.setSaldo(0);
            System.out.println("Saldo actual: " + c1.getSaldo());
        } else {
            c1.setSaldo(c1.getSaldo() - retiro);
            System.out.println("Extracción realizada. Saldo actual: " + c1.getSaldo());
        }

    }

    public static void extraccionRapida(Cuenta c1, Scanner read) {
        System.out.println("Ingrese el monto a retirar(20% máximo)");
        double retiro = read.nextInt();

        double max = c1.getSaldo() * 0.2;
        while (retiro > max) {
            System.out.println("Incorrecto, no puede retirar más del 20%");
            System.out.println("Ingrese un nuevo monto(20% máximo)");
            System.out.println("Saldo actual: " + c1.getSaldo());
            retiro = read.nextInt();
        }

        System.out.println("Se retiraron: " + retiro);
        c1.setSaldo(c1.getSaldo() - retiro);
    }

    public static void consultarSaldo(Cuenta c1) {
        System.out.println("Su saldo actual es: " + c1.getSaldo());
    }

    public static void consultarDatos(Cuenta c1) {
        System.out.println("Numero de cuenta: " + c1.getNumeroCuenta());
        System.out.println("DNI: " + c1.getDni());
        System.out.println("Saldo: " + c1.getSaldo());
    }

}
