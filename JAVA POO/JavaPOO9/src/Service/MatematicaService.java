package Service;

import Entidad.Matematica;

public class MatematicaService {

    public static double devolverMayor(Matematica m1) {
        if (m1.getNum1() > m1.getNum2()) {
            System.out.println("El numero 1:" + m1.getNum1() + " es mayor");
            return m1.getNum1();
        } else if (m1.getNum1() < m1.getNum2()) {
            System.out.println("El numero 2:" + m1.getNum2() + " es mayor");
            return m1.getNum2();
        } else {
            System.out.println("Son iguales");
            return 0;
        }
    }

    public static void calcularPotencia(Matematica m1) {
        long num1 = Math.round(m1.getNum1());
        long num2 = Math.round(m1.getNum2());
        long potencia = 0;
        if (m1.getNum1() > m1.getNum2()) {
            potencia = (long) Math.pow(num1, num2);
        } else if (m1.getNum1() < m1.getNum2()) {
            potencia = (long) Math.pow(num2, num1);
        }
        System.out.println("La potencia del mayor numero elevado al menor da como resultado: " + potencia);
    }

    public static void calcularRaiz(Matematica m1) {
        double menor = Math.min(m1.getNum1(), m1.getNum2());
        double raiz = Math.sqrt(Math.abs(menor));
        System.out.println("La raíz cuadrada del menor valor es: " + raiz);
    }

}
