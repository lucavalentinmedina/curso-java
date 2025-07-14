package Service;

import java.util.Scanner;
import Entidad.NIF;

public class NIFService {

    public static NIF crearNIF(Scanner read) {
        System.out.println("Ingrese su DNI");
        long dni = read.nextLong();
        int num = (int) (dni % 23);
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X",
            "V", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        String letra = letras[num];

        return new NIF(dni, letra);

    }

    public static void mostrar(NIF n) {
        System.out.println(n.getDNI() + "-" + n.getLetra());
    }

}
