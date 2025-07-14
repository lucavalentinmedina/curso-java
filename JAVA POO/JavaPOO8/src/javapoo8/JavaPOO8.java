//Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de 
//String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese 
//una frase que puede ser una palabra o varias palabras separadas por un espacio en 
//blanco y a través de los métodos set, se guardará la frase y la longitud de manera 
//automática según la longitud de la frase ingresada. Deberá además implementar los 
//siguientes métodos: 
//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la 
//frase ingresada. 
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". 
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. 
//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
//compone la clase con otra nueva frase ingresada por el usuario. 
//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena 
//con una nueva frase ingresada por el usuario y mostrar la frase resultante. 
//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar 
//la frase resultante. 
//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
//ingresa el usuario y devuelve verdadero si la contiene y falso si no
package javapoo8;

import Entidad.Cadena;
import Service.CadenaService;
import java.util.Scanner;

public class JavaPOO8 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la frase con la que desea operar");
        String frase = read.nextLine();
        while (frase.trim().isEmpty()) {
            System.out.println("Incorrecto, no puede estar vacío");
            frase = read.nextLine();
        }
        CadenaService cs1 = new CadenaService();
        Cadena c = new Cadena();
        cs1.cargarFrase(frase, c);
        boolean salir = false;
        while (!salir) {
            System.out.println("Ingrese una opción:");
            System.out.println("1. Mostrar vocales");
            System.out.println("2. Invertir frase");
            System.out.println("3. Contar repeticiones de una letra");
            System.out.println("4. Comparar longitud con otra frase");
            System.out.println("5. Unir con otra frase");
            System.out.println("6. Reemplazar las 'a' por un carácter elegido");
            System.out.println("7. Saber si contiene o no una letra");
            System.out.println("8. Salir");
            int opcion = read.nextInt();
            while (opcion < 1 || opcion > 8) {
                System.out.println("Opción incorrecta");
                opcion = read.nextInt();
            }
            read.nextLine();
            switch (opcion) {
                case 1:
                    cs1.mostrarVocales(c);
                    break;
                case 2:
                    cs1.cadenaVolteada(c);
                    break;
                case 3:
                    System.out.println("Ingrese la letra que desea buscar");
                    String letra = read.nextLine();
                    cs1.vecesRepetido(letra, c);
                    break;
                case 4:
                    System.out.println("Ingrese la frase con la que desea comparar la frase original");
                    String frase2 = read.nextLine();
                    cs1.compararFrases(frase2, c);
                    break;
                case 5:
                    System.out.println("Ingrese la frase con la que desea unirla");
                    String frase3 = read.nextLine();
                    cs1.unirFrases(frase3, c);
                    break;
                case 6:
                    System.out.println("Ingrese el carácter por el que desea reemplazar la 'a'");
                    String reemplazo = read.nextLine();
                    while (reemplazo.length() > 1) {
                        System.out.println("Incorrecto, solo debe ingresar una letra");
                        reemplazo = read.nextLine();
                    }
                    cs1.reemplazar(reemplazo, c);
                    break;
                case 7:
                    System.out.println("Ingrese la letra que desea saber si contiene");
                    String contiene = read.nextLine();
                    while (contiene.length() > 1) {
                        System.out.println("Incorrecto, solo debe ingresar una letra");
                        contiene = read.nextLine();
                    }
                    cs1.contiene(contiene, c);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    salir = true;
            }
        }

        read.close();

    }

}
