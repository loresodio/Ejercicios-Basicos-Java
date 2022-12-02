/*
    Vamos a realizar dos prototipos de gestión de clientes y promociones para un hotel de la costa del sol. Lo realizaremos en Java con datos obtenidos de la consola/terminal y en BASIC con Gambas con interfaz gráfica.

    - Nuestro Hotel tendrá: Descripción, Nombre, dirección postal, teléfono, email.
    - Un cliente de nuestro hotel tendrá: DNI, nombre, apellidos, dirección, email, teléfono, edad, fecha de nacimiento.

    Tendremos una interfaz con las siguientes opciones:

    - Mostrar una lista de todos los clientes por pantalla.
    - Crear un cliente nuevo.
    - Eliminar un cliente existente
    - Crear una promoción para los clientes de edades entre un mínimo y un máximo de edad
 */

/*
 * @author loresodio
 */

import java.util.Scanner;


public class HotelMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        String numeroIntroducido;
        Hotel miHotelito = new Hotel();
        do {
            System.out.println("1. Mostrar una lista de todos los clientes por pantalla");
            System.out.println("2. Crear un cliente nuevo");
            System.out.println("3. Eliminar un cliente existente");
            System.out.println("4. Crear una promoción para los clientes de edades entre un mínimo y un máximo de edad");
            System.out.println("0. Salir");
            System.out.println("Escribe una de las opciones");
            opcion = sc.nextInt();

            switch (opcion) {
                // mostramos una lista con todos los clientes, salta excepcion si no ha ningun cliente
                case 1:
                    System.out.println("Has seleccionado la opción 1");
                    miHotelito.mostrarListaClientes();


                    break;

                // creamos un cliente nuevo, nos da igual si ese cliente ya existe
                case 2:
                    System.out.println("Has seleccionado la opción 2");

                    miHotelito.crear();
                    break;

                // elimina un cliente existente, si hay dos iguales elimina los dos
                case 3:
                    System.out.println("Has seleccionado la opción 3");

                    miHotelito.eliminar();

                    break;

                // crea una promoción para los clientes de edades entre un mínimo y un máximo de edad
                case 4:
                    System.out.println("Has seleccionado la opción 4");

                    miHotelito.promocion();

                    break;

                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 0 y 4");
            }

        } while (!salir);

    }
}
