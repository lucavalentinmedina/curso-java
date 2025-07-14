// Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
//los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
//constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el 
//Math.random para generar los dos números y se guardaran en el objeto con su 
//respectivos set. Deberá además implementar los siguientes métodos: 
//a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor 
//b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase 
//elevado al menor número. Previamente se deben redondear ambos valores. 
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
package javapoo9;

import Entidad.Matematica;
import Service.MatematicaService;

public class JavaPOO9 {

    public static void main(String[] args) {

        double num1 = Math.random() * 20;
        double num2 = Math.random() * 20;

        MatematicaService ms = new MatematicaService();
        Matematica m1 = new Matematica(num1, num2);

        System.out.println("Los números son: ");
        System.out.println("---------------------");
        System.out.println("Numero 1: " + num1);
        System.out.println("---------------------");
        System.out.println("Numero 2: " + num2);
        ms.devolverMayor(m1);
        ms.calcularPotencia(m1);
        ms.calcularRaiz(m1);
    }

}
