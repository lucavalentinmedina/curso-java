// Una tienda que vende teléfonos móviles quiere tener registro de cada producto que 
//posee en un sistema computacional. Para ello, crearemos un programa donde se pueda 
//almacenar cada producto con su información. Crear una entidad Movil con los atributos 
//marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será 
//un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número 
//correspondiente al código. A continuación, se implementarán los siguientes métodos: 
// Un constructor por defecto. 
// Un constructor con todos los atributos como parámetro. 
// Métodos getters y setters de cada atributo. 
// Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para 
//instanciar un objeto Celular y poder cargarlo en nuestro programa. 
// Método ingresarCodigo(): este método permitirá ingresar el código completo de siete 
//números de un celular. Para ello, puede utilizarse un bucle repetitivo 
package javapoo14;

import java.util.Scanner;
import Entidad.Movil;
import Service.MovilService;

public class JavaPOO14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        MovilService ms1 = new MovilService();
        Movil m1 = ms1.cargarCelular(read);
        System.out.println(m1.toString());

    }

}
