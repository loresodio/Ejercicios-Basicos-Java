/*
 * Realiza un programa que calcule la media de tres notas obtenidas del teclado, muestre la cantidad
 * numérica obtenida y después añada: Insuficiente, suficiente, bien, notable o sobresaliente. Las notas son:
 *      Nota menor que 5: insuficiente
 *      Nota entre 5 y 6 (sin incluir al 6): suficiente
 *      Nota entre 6 y 7 (sin incluir al 7): bien
 *      Nota entre 7 y 8.5 (sin incluir al 8.5): notable
 *      Nota mayor o igual a 8.5: sobresaliente
 */

/**
 *
 * @author loresodio
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        System.out.println("Introduzca la primera nota: ");
        float nota1 = sc.nextFloat();

        System.out.println("Introduzca la segunda nota: ");
        float nota2 = sc.nextFloat();

        System.out.println("Introduzca la tercera nota: ");
        float nota3 = sc.nextFloat();

        float media;

        media=(nota1+nota2+nota3)/3;

        if (((nota1 >= 0) && (nota1 <= 10)) && ((nota2 >= 0) && (nota2 <= 10)) && ((nota3 >= 0) && (nota3 <= 10))) {
            if (media >= 0 && media <= 5) {
                System.out.println("Insuficiente, su nota media es: "+media);
            }

            if (media >= 5 && media < 6) {
                System.out.println("Suficiente, su nota media es: "+media);

            }
            if (media >= 6 && media < 7) {
                System.out.println("Bien, su nota media es: "+media);
            }
            if (media >= 7 && media < 8.5) {
                System.out.println("Notable su nota media es: "+media);

            }
            if (media >= 8.5 && media <= 10) {
                System.out.println("Sobresaliente su nota media es: "+media);
            }

        }

        else{
            System.out.println("Introduzca una nota del 0 al 10");

        }


    }
}
