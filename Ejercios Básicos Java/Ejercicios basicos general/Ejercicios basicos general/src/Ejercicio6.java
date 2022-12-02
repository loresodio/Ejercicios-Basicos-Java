/*
 *    - Realiza un programa que calcule los múltiplos del número M entre el valor MIN y MAX. Los valores de M, MIN y MAX se leen de teclado.
        Ejemplo: M = 4, MIN = 38, MAX = 50. Resultado: 40, 44, 48

*/

/**
 *
 * @author loresodio
 */
import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Variables
        System.out.println("Introduzca un número:");
        int numero = sc.nextInt();
        System.out.println("Introduzca un número mínimo:");
        int numeroMin = sc.nextInt();
        System.out.println("Introduzca un número máximo:");
        int numeroMax = sc.nextInt();

        for(int i=numeroMin;i<=numeroMax;i+=1) {

            if(i % numero == 0) {
                System.out.println(i);

            }else{

            }
        }

    }
}