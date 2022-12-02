/*
 * Muestra los primeros 10 múltiplos de un número entero recogido desde el teclado, mediante un
 * bucle for.*/

/**
 *
 * @author loresodio
 */
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Variables
        System.out.println("Introduzca un número: ");
        int numero1 = sc.nextInt();

        for(int numero=0;numero<9;numero++){
            System.out.println((numero+2)*numero1);
        }
    }
}
