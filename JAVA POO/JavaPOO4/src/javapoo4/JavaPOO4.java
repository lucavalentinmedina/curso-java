//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado 
//base y un atributo privado altura. La clase incluirá un método para crear el rectángulo 
//con los datos del Rectángulo dados por el usuario. También incluirá un método para 
//calcular la superficie del rectángulo y un método para calcular el perímetro del 
//rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante 
//asteriscos usando la base y la altura. Se deberán además definir los métodos getters, 
//setters y constructores correspondientes. 
//Superficie = base * altura / Perímetro = (base + altura) * 2
package javapoo4;

import Entidad.Rectangulo;
import Service.RectanguloService;
import java.util.Scanner;

public class JavaPOO4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        RectanguloService rs1 = new RectanguloService();
        Rectangulo r1 = rs1.crearRectangulo(read);
        System.out.println("Superficie del rectángulo: " + rs1.calcularSuperficie(r1));
        System.out.println("Perímetro del rectángulo: " + rs1.calcularPerimetro(r1));
        rs1.dibujarRectangulo(r1);
        read.close();

    }

}
