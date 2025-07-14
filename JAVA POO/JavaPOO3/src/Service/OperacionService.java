package Service;

import Entidad.Operacion;
import java.util.Scanner;

public class OperacionService {

    public static Operacion crearOperacion(Scanner read) {
        System.out.println("Ingrese el primer número");
        int n1 = read.nextInt();
        System.out.println("Ingrese el segundo número");
        int n2 = read.nextInt();

        return new Operacion(n1, n2);
    }

    public static int suma(Operacion op1) {

        return op1.getNum1() + op1.getNum2();
    }

    public static int resta(Operacion op1) {
        return op1.getNum1() - op1.getNum2();
    }

    public static int multiplicacion(Operacion op1) {
        if (op1.getNum2() == 0) {
            System.out.println("ERROR. Multiplicación por 0.");
            return 0;
        }
        return op1.getNum1() * op1.getNum2();
    }

    public static int division(Operacion op1) {
        if (op1.getNum2() == 0) {
            System.out.println("ERROR. División por 0.");
            return 0;
        }
        return op1.getNum1() / op1.getNum2();
    }

}
