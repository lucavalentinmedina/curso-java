//Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
//3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
//dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 
//que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al 
//menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la 
//columna de la matriz M en la cual empieza el primer elemento de la submatriz P
package javaintro21;

public class JavaIntro21 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                matrizM[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + matrizM[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("------------------------------");
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {
                matrizP[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + matrizP[i][j] + "]");
            }
            System.out.println("");
        }

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                boolean match = true;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (matrizM[i + x][j + y] != matrizP[x][y]) {
                            match = false;
                        }
                    }
                }
                if (match == true) {
                    System.out.println("Matriz P encontrada en M en la posición: fila " + i + ", columna " + j);
                    break;
                }

            }

        }

    }

}
