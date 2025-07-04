// Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
//muestre por pantalla en orden descendente.
package javaintro15;



public class JavaIntro15 {

    public static void main(String[] args) {
        
        int[] vector= new int[100];
        
        for (int i = 99; i >= 0; i--) {
            vector[i]=i;
            System.out.println(vector[i]);
        }

    }

}
