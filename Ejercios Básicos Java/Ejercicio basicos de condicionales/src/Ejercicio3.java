/*
 * Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las
 * horas ordinarias (40 primeras horas de trabajo) se pagan a 15 euros la hora. A partir de la hora 41, se
 * pagan a 20 euros la hora. Lee el número de horas trabajadas una semana por un trabajador y calcula
 * su retribución. */

/**
 *
 * @author loresodio
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        System.out.println("Introduzca las horas: ");
        int hora = sc.nextInt();

        if (hora <= 40) {
            System.out.println("Su retribución es de : " + 15*hora);

        }

        else{
            System.out.println("Su retribución es de : " + 20*hora);
        }


    }
}
