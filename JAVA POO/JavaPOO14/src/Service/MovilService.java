package Service;

import Entidad.Movil;
import java.util.Scanner;

public class MovilService {

    public static int[] ingresarCodigo(Scanner read) {
        int[] codigo = new int[7];
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ":");
            int num = read.nextInt();
            while (num < 0) {
                System.out.println("Ingrese un número válido");
                num = read.nextInt();
            }
            codigo[i] = num;

        }
        return codigo;
    }

    public static Movil cargarCelular(Scanner read) {
        System.out.println("Ingrese la marca");
        String marca = read.nextLine();
        while (marca.trim().isEmpty()) {
            System.out.println("No puede estar vacío");
            marca = read.nextLine();
        }
        System.out.println("Ingrese el modelo");
        String modelo = read.nextLine();
        while (modelo.trim().isEmpty()) {
            System.out.println("No puede estar vacío");
            modelo = read.nextLine();
        }
        System.out.println("Ingrese el precio");
        double precio = read.nextDouble();
        while (precio < 1) {
            System.out.println("El precio no puede ser menor a 1");
            precio = read.nextDouble();
        }
        System.out.println("Ingrese la cantidad de memoria ram disponible en GB");
        int memoriaRam = read.nextInt();
        while (memoriaRam < 1) {
            System.out.println("La RAM no puede ser menor a 1 GB");
            memoriaRam = read.nextInt();
        }
        System.out.println("Ingrese la cantidad de almacenamiento disponible en GB");
        int almacenamiento = read.nextInt();
        while (almacenamiento < 1) {
            System.out.println("El almacenamiento no puede ser menor a 1GB");
            almacenamiento = read.nextInt();
        }
        int[] codigo = MovilService.ingresarCodigo(read);

        return new Movil(marca, precio, modelo, memoriaRam, almacenamiento, codigo);
    }

}
