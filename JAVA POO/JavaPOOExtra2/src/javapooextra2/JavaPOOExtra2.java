//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
//atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
//usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
//los atributos del objeto. Después, a través de otro método calcular y devolver la distancia 
//que existe entre los dos puntos que existen en la clase Puntos.
package javapooextra2;

import Entidad.Puntos;
import Service.PuntosService;
import java.util.Scanner;

public class JavaPOOExtra2 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        PuntosService ps1 = new PuntosService();
        Puntos p = ps1.crearPuntos(read);
        System.out.println(p.toString());
        System.out.println("Distancia entre los puntos: " + ps1.calcularDistancia(p));
        
    }
    
}
