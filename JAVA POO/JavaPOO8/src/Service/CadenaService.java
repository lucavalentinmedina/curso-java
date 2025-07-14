package Service;

import Entidad.Cadena;

public class CadenaService {

    public static void cargarFrase(String frase, Cadena c) {
        c.setFrase(frase);
        c.setLongitud(frase.length());
        System.out.println("Cadena cargada: " + c.getFrase());
        System.out.println("Longitud de la cadena: " + c.getLongitud());
    }

    public static int mostrarVocales(Cadena c) {
        String frase = c.getFrase();
        int contador = 0;

        for (int i = 0; i < c.getLongitud(); i++) {
            char ch = Character.toLowerCase(c.getFrase().charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                contador += 1;
            }
        }
        System.out.println("La frase contiene " + contador + " vocales");
        return contador;
    }

    public static String cadenaVolteada(Cadena c) {
        String cadena = c.getFrase();
        String cadenaVolteada = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaVolteada += cadena.charAt(i);
        }
        System.out.println("La frase '" + c.getFrase() + "' volteada quedaría así:");
        System.out.println(cadenaVolteada);
        return cadenaVolteada;
    }

    public static int vecesRepetido(String letra, Cadena c) {
        int contador = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            char a = letra.toLowerCase().charAt(0);
            if (c.getFrase().toLowerCase().charAt(i) == a) {
                contador += 1;
            }
        }
        System.out.println("El carácter " + letra + " se repite " + contador + " veces");
        return contador;
    }

    public static void compararFrases(String frase, Cadena c) {
        if (frase.length() > c.getLongitud()) {
            System.out.println("La frase '" + frase + "' es la más larga");
        } else if (frase.length() < c.getLongitud()) {
            System.out.println("La frase '" + c.getFrase() + "' es más larga");

        } else {
            System.out.println("Son iguales");
        }
    }

    public static void unirFrases(String frase, Cadena c) {
        String fraseUnida = c.getFrase().concat(" " + frase);
        System.out.println("Las frases unidas quedarían de la siguiente forma:");
        System.out.println(fraseUnida);
    }

    public static void reemplazar(String letra, Cadena c) {
        char letra1 = letra.charAt(0);
        String replace = c.getFrase().replace('a', letra1);
        System.out.println("Todas las 'a' reemplazadas por " + letra + ":");
        System.out.println(replace);
    }

    public static boolean contiene(String letra, Cadena c) {
        if (c.getFrase().toLowerCase().contains(letra.toLowerCase())) {
            System.out.println("La frase '" + c.getFrase() + "' contiene la letra " + letra);
            return true;
        } else {
            System.out.println("La frase '" + c.getFrase() + "' no contiene la letra " + letra);
            return false;
        }
    }

}
