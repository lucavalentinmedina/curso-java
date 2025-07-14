//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). 
//Las operaciones asociadas a dicha clase son: 
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. 
//b) Agregar los métodos getters y setters correspondientes 
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. 
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
//y se la sumara a saldo actual. 
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se 
//la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se 
//pondrá el saldo actual en 0. 
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
//usuario no saque más del 20%. 
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta 
package javapoo5;

import Entidad.Cuenta;
import Service.CuentaService;
import java.util.Scanner;

public class JavaPOO5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        CuentaService cs1 = new CuentaService();
        Cuenta c1 = cs1.crearCuenta(read);
        boolean salir = false;
        while (!salir) {
            System.out.println("Elija una opción");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Retiro rápido(20% de su saldo)");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos de cuenta");
            System.out.println("6. Salir");
            int opcion = read.nextInt();
            while (opcion < 1) {
                System.out.println("Incorrecto, intentelo de nuevo");
                opcion = read.nextInt();
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de dinero");
                    double cantidad = read.nextInt();
                    while (cantidad < 1) {
                        System.out.println("Incorrecto, intentelo nuevamente");
                        cantidad = read.nextDouble();
                    }
                    cs1.ingreso(cantidad, c1);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad que desea retirar");
                    double retiro = read.nextInt();
                    while (retiro < 1) {
                        System.out.println("Incorrecto, intentelo nuevamente");
                        retiro = read.nextDouble();
                    }
                    cs1.retirar(retiro, c1);
                    break;
                case 3:
                    cs1.extraccionRapida(c1, read);
                    break;
                case 4:
                    cs1.consultarSaldo(c1);
                    break;
                case 5:
                    cs1.consultarDatos(c1);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    salir = true;
            }

        }
        read.close();
    }

}
