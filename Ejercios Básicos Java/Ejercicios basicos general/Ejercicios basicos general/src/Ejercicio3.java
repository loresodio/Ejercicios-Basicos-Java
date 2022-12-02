/*    - Escriba un programa que pida primero un número par y a
        continuación un numero impar (positivos o negativos). En caso de que uno
        o los dos valores no sean correctos, se mostrarán uno o dos avisos.

        */

/**
 *
 * @author loresodio
 */
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Variables
        System.out.println("Introduzca un número par: ");
        int numeroPar = sc.nextInt();

        System.out.println("Introduzca un número impar: ");
        int numeroImpar = sc.nextInt();

        if((numeroPar%2==0) && (numeroImpar%2!=0)){
            System.out.println("¡Gracias por su colaboración!");
        } else if (numeroPar%2!=0) {
            System.out.println("No ha escrito un número par.\n" +
                    "Ejecute de nuevo el programa para volver a intentarlo.");
        }
        else if (numeroImpar%2==0) {
            System.out.println("No ha escrito un número impar.\n" +
                    "Ejecute de nuevo el programa para volver a intentarlo.");
        }
    }
}