// Crea una clase en Java donde declares una variable de tipo array de Strings que 
//contenga los doce meses del año, en minúsculas. A continuación, declara una variable 
//mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, 
//mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el 
//usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar 
//el mes secreto. Un ejemplo de ejecución del programa podría ser este: 
//Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero 
//No ha acertado. Intente adivinarlo introduciendo otro mes: agosto 
//¡Ha acertado! 
package javapooextra5;

import java.util.Scanner;
import Entidad.Meses;
import Service.MesesService;

public class JavaPOOExtra5 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        MesesService ms1 = new MesesService();
        Meses m = new Meses();
        
        ms1.adivinarMes(m, read);
    }
    
}
