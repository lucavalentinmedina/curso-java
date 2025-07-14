//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
//tipo real. A continuación, se deben crear los siguientes métodos: 
//a) Método constructor que inicialice el radio pasado como parámetro. 
//b) Métodos get y set para el atributo radio de la clase Circunferencia. 
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
//objeto. 
//d) Método area(): para calcular el área de la circunferencia (area = π *radio²).
//e) Método perimetro(): para calcular el perímetro (Perímetro = 2 * π * radio).
package javapoo2;

import Entidad.Circunferencia;
import Servicio.CircunferenciaService;
import java.util.Scanner;

public class JavaPOO2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CircunferenciaService cs1 = new CircunferenciaService();
        Circunferencia c1 = cs1.crearCircunferencia(read);
        System.out.println("Area de la círcunferencia: " + cs1.area(c1));
        System.out.println("Perimetro de la circunferencia: " + cs1.perimetro(c1));
        read.close();
    }

}
