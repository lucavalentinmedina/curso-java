// Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un 
//programa para organizar la información de cada curso. Para ello, crearemos una clase 
//entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, 
//cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde 
//alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los 
//nombres de cada alumno. A continuación, se implementarán los siguientes métodos: 
// Un constructor por defecto. 
// Un constructor con todos los atributos como parámetro. 
// Métodos getters y setters de cada atributo. 
// método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el 
//nombre de cada alumno. 
// Método crearCurso(): el método crear curso, le pide los valores de los atributos al 
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
//Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor 
//al atributo alumnos 
// Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por 
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que 
//se repite el encuentro. 
package javapoo13;

import Entidad.Curso;
import Service.CursoService;
import java.util.Scanner;

public class JavaPOO13 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CursoService cs1 = new CursoService();
        Curso c1 = cs1.crearCurso(read);
        System.out.println("Nombre del curso: " + c1.getNombreCurso());
        System.out.println("Cantidad de horas por día: " + c1.getCantidadHorasPorDia());
        System.out.println("Cantidad de días por semana: " + c1.getCantidadDiasPorSemana());
        System.out.println("Precio por hora: " + c1.getPrecioPorHora());
        System.out.println("Turno: " + c1.getTurno().toUpperCase());
        System.out.println("Alumnos:");
        for (int i = 0; i < c1.getAlumnos().length; i++) {
            System.out.println("Alumno " + (i + 1) + " -" + c1.getAlumnos()[i]);
        }
        System.out.println("La ganancia semanal es de: " + cs1.calcularGananciaSemanal(c1));

    }

}
