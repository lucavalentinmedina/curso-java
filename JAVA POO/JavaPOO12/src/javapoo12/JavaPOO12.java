//Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento 
//(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
//métodos: 
// Agregar un método de creación del objeto que respete la siguiente firma: 
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto. 
// Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
//actual. 
// Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra 
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
//se recibe como parámetro, o false en caso contrario. 
// Metodo mostrarPersona(): este método muestra la persona creada en el método 
//anterior.
package javapoo12;

import Entidad.Persona;
import Service.PersonaService;
import java.util.Scanner;

public class JavaPOO12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        PersonaService ps1 = new PersonaService();
        Persona p1 = ps1.crearPersona(read);
        System.out.println("Edad: " + ps1.calcularEdad(p1));
        System.out.println("Ingrese una edad para saber si " + p1.getName() + " es menor");
        int edad = read.nextInt();
        if (ps1.menorQue(p1, edad)) {
            System.out.println(p1.getName() + " es menor");
        } else {
            System.out.println(p1.getName() + " es mayor");
        }
        ps1.mostrarPersona(p1);
    }

}
