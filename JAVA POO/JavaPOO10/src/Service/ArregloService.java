package Service;

import java.util.Arrays;

public class ArregloService {

    public static void llenarArreglo(double[] a) {

        for (int i = 0; i < a.length; i++) {
            a[i] = (Math.random() * 100);
        }

    }

    public static void mostrarArreglo(double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("[" + a[i] + "]");
        }
    }

    public static void ordenarArreglo(double[] a) {
        Arrays.sort(a);
    }

    public static void llenarB(double[] a, double[] b) {
        for (int i = 0; i < 10; i++) {
            b[i] = a[i];
        }
        for (int i = 10; i < 20; i++) {
            b[i] = 0.5;
        }
    }

}
