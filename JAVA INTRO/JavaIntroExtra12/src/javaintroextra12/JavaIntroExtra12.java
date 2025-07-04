//Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
//0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
//Ejemplo:
//0-0-0
//0-0-1
//0-0-2
//0-0-E
//0-0-4
//0-1-2
//0-1-E
package javaintroextra12;

public class JavaIntroExtra12 {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            String original = String.format("%03d", i).replace("", "-").replace("3", "E").substring(1, 7);
            String contador = original.substring(0, original.length() - 1);
            System.out.println(contador);

        }

    }

}
