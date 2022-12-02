
    /*
     * Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin
     * IVA). Todos los datos se leerán desde el teclado
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
            double iva= 0.21;


            System.out.println("Introduzca el precio con IVA: ");
            double dinero = sc.nextDouble();

            double calculo = dinero + (dinero * iva);

            System.out.println("El total de la factura sin IVA es "+ calculo);

        }
    }

