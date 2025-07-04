// Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que 
//una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada 
//de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
package javaintro19;

public class JavaIntro19 {

    public static void main(String[] args) {

        int[][] matriz = {
            {0, -2, 4},
            {2, 0, -5},
            {-4, 5, 0}
        };

        int[][] traspuesta = new int[matriz.length][matriz.length];
        boolean antisim=true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                traspuesta[i][j] = matriz[j][i];
                System.out.print("["+traspuesta[i][j]+"]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (traspuesta[i][j]!=-matriz[i][j]) {
                    antisim=false;
                }
            }
        }
        if (antisim==true) {
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }
    }

}
