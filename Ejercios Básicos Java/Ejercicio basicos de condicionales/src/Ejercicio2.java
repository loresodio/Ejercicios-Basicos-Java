/*
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre
 * del día de la semana.
 */

/**
 *
 * @author loresodio
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variables
        //Lo hago con string porque si no me da excepcion si alguien escribe algo que no sea un número
        System.out.println("Introduzca el dia: ");
        String dia = sc.nextLine();

        if (dia == "1"){
            System.out.println("Lunes");

        }
        if (dia == "2"){
            System.out.println("Martes");

        }
        if (dia == "3"){
            System.out.println("Miércoles");

        }
        if (dia == "4"){
            System.out.println("Jueves");

        }
        if (dia == "5"){
            System.out.println("Viernes");

        }
        if (dia == "6"){
            System.out.println("Sábado");

        }
        if (dia == "7"){
            System.out.println("Domingo");

        }

        else
            System.out.println("Introduzca un numero del 1 al 7");


    }
}
