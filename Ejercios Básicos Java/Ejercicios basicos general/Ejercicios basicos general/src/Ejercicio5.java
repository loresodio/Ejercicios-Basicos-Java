/*
 *    - Realiza un programa que calcule la suma acumulada de los primeros N números positivos, siendo N obtenido por teclado.
        Es decir, si N = 3, el resultado es 1+2+3 -> 6
        Si N = 5, el resultado es 1+2+3+4+5 -> 15
*/

/**
 *
 * @author loresodio
 */
import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        //Variables
        System.out.println("Introduzca un número entero positivo: ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i+=1) {
            suma=suma+i;
        }

        System.out.println("El numero total es: "+ suma);

    }
}