/*
 *    - Escriba un programa que pida primero un
        número par y luego un número impar (positivos o negativos). En caso de
        que uno o los dos valores no sea correcto, se mostrará un único aviso.
*/

/**
 *
 * @author loresodio
 */
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Variables
        System.out.println("Introduzca un número par: ");
        int numeroPar = sc.nextInt();

        System.out.println("Introduzca un número impar: ");
        int numeroImpar = sc.nextInt();

        if((numeroPar%2==0) && (numeroImpar%2!=0)){
            System.out.println("¡Gracias por su colaboración!");
        }else{
            System.out.println("Uno o más de los valores que ha escrito no son correctos.\n" +
                    "Ejecute de nuevo el programa para volver a intentarlo.");
        }
    }
}