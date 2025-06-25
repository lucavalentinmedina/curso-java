package ej2practica;

import java.util.Scanner;

public class EJ2Practica {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int age, height;

        System.out.println("Ingrese su edad");
        age = read.nextInt();

        while (age <= 0) {
            System.out.println("Incorrecto, ingrese una edad válida");
            age = read.nextInt();
        }

        System.out.println("Ingrese su altura expresada en cm");
        height = read.nextInt();

        while (height <= 0) {
            System.out.println("Incorrecto, ingrese una altura válida");
            height = read.nextInt();
        }
        
        if(age<18){
            System.out.println("Sos menor de edad.");
        }else if(age>=18&&height<160){
            System.out.println("Sos mayor de edad pero bastante petisx.");
        }else if(age>=18&&height>190){
            System.out.println("¿Jugador de la NBA, vos?");
        }else{
            System.out.println("Edad y altura dentro del promedio");
        }

    }

}
