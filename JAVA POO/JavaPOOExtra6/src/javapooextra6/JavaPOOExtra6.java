//Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener 
//como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la 
//cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos 
//con los parámetros que sean necesarios: 
// Constructores, tanto el vacío como el parametrizado. 
// Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del 
//vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra 
//de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas 
//máximas, el valor que ingresó el usuario y encontradas en 0. 
// Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: 
//buscar como se usa el vector.length. 
// Método buscar(letra): este método recibe una letra dada por el usuario y busca sila 
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no. 
// Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre 
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá 
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
//busque una letra que no esté, se le restará uno a sus oportunidades. 
// Método intentos(): para mostrar cuantas oportunidades le queda al jugador. 
// Método juego(): el método juego se encargará de llamar todos los métodos 
//previamente mencionados e informará cuando el usuario descubra toda la palabra o 
//se quede sin intentos. Este método se llamará en el main. 
package javapooextra6;

import java.util.Scanner;
import Entidad.Ahorcado;
import Service.AhorcadoService;

public class JavaPOOExtra6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        AhorcadoService as1=new AhorcadoService();
        Ahorcado a =as1.crearJuego(read);
        
        as1.Juego(a, read);
        

    }

}
