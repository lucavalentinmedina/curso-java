//Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A 
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
//20. 
package javapoo10;

import Service.ArregloService;

public class JavaPOO10 {
    
    public static void main(String[] args) {
        
        ArregloService as1 = new ArregloService();
        
        double[] ArregloA = new double[50];
        double[] ArregloB = new double[20];
        
        as1.llenarArreglo(ArregloA);
        System.out.println("Arreglo A sin ordenar:");
        as1.mostrarArreglo(ArregloA);
        as1.ordenarArreglo(ArregloA);
        as1.llenarB(ArregloA, ArregloB);
        System.out.println("Arreglo A ordenado:");
        as1.mostrarArreglo(ArregloA);
        System.out.println("Arreglo B:");
        as1.mostrarArreglo(ArregloB);
        
    }
    
}
