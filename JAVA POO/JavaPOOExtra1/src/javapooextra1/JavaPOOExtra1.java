//Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
//definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas 
//vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán 
//además definir los métodos getters y setters correspondientes. 
package javapooextra1;

import java.util.Scanner;
import Entidad.Cancion;
import Service.CancionService;

public class JavaPOOExtra1 {

    Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CancionService cs1 = new CancionService();
        Cancion c = cs1.cargarCancion(read);
        System.out.println(c.toString());
    }

}
