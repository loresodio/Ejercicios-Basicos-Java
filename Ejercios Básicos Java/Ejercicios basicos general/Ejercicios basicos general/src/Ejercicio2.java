/*
 *    - Escriba un programa que pida primero un número par (positivo o
        negativo) y si el valor no es correcto, muestre un aviso. Si el valor es
        correcto, pedirá un número impar (positivo o negativo) y si el valor no
        es correcto, mostrará un aviso.
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
        System.out.println("Escriba un número par: ");
        int numeroPar = sc.nextInt();

        if (numeroPar % 2 == 0) {
            System.out.println("Escriba un número impar:");
            int numeroImpar = sc.nextInt();
            if (numeroImpar % 2 != 0) {
                System.out.println("¡Gracias por su colaboración!");
            } else {
                System.out.println("No ha escrito un número impar.\n" +
                        "Ejecute de nuevo el programa para volver a intentarlo.");
            }
        } else {
            System.out.println("No ha escrito un número par.\n" +
                    "Ejecute de nuevo el programa para volver a intentarlo.");
        }

    }
}