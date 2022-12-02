/*
 * Escribe un programa que ordene tres números enteros introducidos por teclado
 */

/**
 *
 * @author loresodio
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        System.out.println("Introduzca el primer número: ");
        int numero1 = sc.nextInt();

        System.out.println("Introduzca el segunndo número: ");
        int numero2 = sc.nextInt();

        System.out.println("Introduzca el tercer número: ");
        int numero3 = sc.nextInt();


        if ((numero1 >= numero2) && (numero1 >= numero3) &&( numero2 >= numero3)) {
                System.out.println( numero1 + ", " + numero2 + ", " + numero3);
            }

        if ((numero1 >= numero2 && numero1 >= numero3 && numero2 <= numero3)) {
            System.out.println( numero1 + "," + numero3 + "," + numero2);
        }

        if (numero1 <= numero2 && numero2 >= numero3 && numero1 >= numero3) {
            System.out.println(  numero2 + "," + numero1 + "," + numero3);
        }

        if ((numero1 <= numero2 && numero2 >= numero3 && numero1 <= numero3)) {
            System.out.println(numero2 + "," + numero3 + "," + numero1);
        }

        if (numero3 >= numero2 && numero3 >= numero2 && numero2 >= numero1) {
            System.out.println( numero3 + "," + numero2 + "," + numero1);
        }

        if (numero3 >= numero2 && numero3 >= numero2 && numero2 <= numero1) {
        System.out.println(numero3 + "," + numero1 + "," + numero2);
    }

    }
}
