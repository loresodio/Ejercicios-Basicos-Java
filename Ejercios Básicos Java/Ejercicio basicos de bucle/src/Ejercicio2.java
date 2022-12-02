/*
 * Muestra los primeros 10 múltiplos de un número entero recogido desde el teclado, mediante un
 * bucle while.
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
        System.out.println("Introduzca un número: ");
        int numero1 = sc.nextInt();
        int numero=0;

        while(numero<9){
            System.out.println((numero+2)*numero1);
            numero++;
        }
    }
}