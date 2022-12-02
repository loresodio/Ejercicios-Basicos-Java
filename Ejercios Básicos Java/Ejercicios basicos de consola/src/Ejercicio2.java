
    /*
     * Modifica el ejercicio anterior y lee del teclado dos enteros para asignarlos respectivamente a x e y.
     * Prueba con varias ejecuciones la funcionalidad de esta minicalculadora.
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
            System.out.println("La primera variables es: ");
            int x = sc.nextInt();
            System.out.println("La segunda variables es: ");
            int y = sc.nextInt();


            System.out.println("Las variables escritas son "+x +" y " + y);

            System.out.println("El resultado de la suma es "+(x+y));

            System.out.println("El resultado de la resta es "+(x-y));

            System.out.println("El resultado de la multiplicación es "+(x*y));

            System.out.println("El resultado de la división es "+(x/y));
        }
    }

