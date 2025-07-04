package ej1practica;

import java.util.Scanner;

public class EJ1Practica {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese su edad");

        int age = read.nextInt();
        read.nextLine();

        System.out.println("Ingrese su nombre");

        String name = read.nextLine();

        System.out.println("Ingrese su altura");

        float height = read.nextFloat();
        
        System.out.println("Su nombre es: "+name);
        System.out.println("Su edad es: "+age);
        System.out.println("Su altura es: "+ height+ " cm");

    }

}
