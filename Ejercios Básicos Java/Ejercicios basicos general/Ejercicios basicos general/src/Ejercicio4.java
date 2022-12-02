/*
 *    - Escriba un programa que pida primero un número par y a
        continuación un numero impar (positivos o negativos). En cada petición,
        si el valor no es correcto se mostrará un aviso.

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
        System.out.println("Introduzca un número par: ");
        int numeroPar = sc.nextInt();


        if((numeroPar%2!=0)){
            System.out.println("No ha escrito un número par.");

            System.out.println("Introduzca un número impar: ");
            int numeroImpar = sc.nextInt();
            if((numeroImpar%2!=0)){
                System.out.println("Ejecute de nuevo el programa para volver a intentarlo.");
            }else{
                System.out.println("No ha escrito un número impar.\n" +
                        "Ejecute de nuevo el programa para volver a intentarlo.");
            }

        } else if (numeroPar%2==0) {
            System.out.println("Introduzca un número impar: ");
            int numeroImpar = sc.nextInt();
            if((numeroImpar%2!=0)){
                System.out.println("¡Gracias por su colaboración!");
            }
        }}
}