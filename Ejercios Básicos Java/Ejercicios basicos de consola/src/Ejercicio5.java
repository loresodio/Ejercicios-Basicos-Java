
    /*
     * Realiza una modificación al ejercicio 4 para que los datos de las variables se lean desde el teclado.
     */

    /**
     *
     * @author loresodio
     */

    import java.util.Scanner;

    public class Ejercicio5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //Variables
            System.out.println("Introduzca el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Introduzca la direccion: ");
            String direccion = sc.nextLine();
            System.out.println("Introduzca el teléfono: ");
            String telefono = sc.nextLine();

            System.out.println("El nombre es "+ nombre);

            System.out.println("La dirección es "+ direccion);

            System.out.println("El teléfono es "+ telefono);


        }
    }

