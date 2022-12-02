/*
 * Realiza el control de acceso a una caja fuerte. Las contraseñas serán combinaciones de 4 caracteres
 * alfanuméricos. La contraseña inicial será “0000”. Se debe de mostrar un menú cómo el que se
 * muestra a continuación:
 *   1. Asignar nueva combinación
 *   2. Abrir caja fuerte
 *   0. Salir
 * Se debe de ejecutar el menú mientras no se pulse un 0. Si nos pulsan 1, pedimos la combinación
 * anterior y si se acierta, se solicita una nueva que pasará a ser la activa. Si no se acierta se mostrará
 * “combinación errónea”. En el caso de acertar: “Introduzca nueva combinación” y después
 * pondremos “Nueva combinación almacenada” cuando nos den la nueva. En el caso de la opción 2,
 * pedimos la combinación activa y si se acierta se muestra en pantalla “Caja fuerte abierta”.
 */

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author loresodio
 */
public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        String combinacion = "0000";
        String numeroIntroducido;

        do {
            System.out.println("1. Asignar nueva combinación");
            System.out.println("2. Abrir caja fuerte");
            System.out.println("0. Salir");
            System.out.println("Escribe una de las opciones");
            opcion = sc.nextInt();

            switch (opcion) {
                //pedimos la combinación anterior y si se acierta, se solicita una nueva que pasará a ser la activa
                case 1:
                    System.out.println("Introduzca la combinación anterior");
                    //no me pilla la linea
                    sc.nextLine();
                    numeroIntroducido = sc.nextLine();

                    if (Objects.equals(numeroIntroducido, combinacion)) {
                        System.out.println("Introduzca la nueva combinación");
                        String nuevaContraseña = sc.nextLine();
                        combinacion = nuevaContraseña;
                        System.out.println("Nueva combinación almacenada");


                    } else {
                        System.out.println("Combinación errónea");

                    }

                    break;

                // pedimos la combinación activa y si se acierta se muestra en pantalla “Caja fuerte abierta”.
                case 2:
                    System.out.println("Has seleccionado la opción 2");
                    System.out.println("Introduzca la combinación activa");
                    //no me pilla la linea
                    sc.nextLine();
                    String combinacionIntroducida = sc.nextLine();
                    if (Objects.equals(combinacionIntroducida, combinacion)) {
                        System.out.println("Caja fuerte abierta");


                    } else {
                        System.out.println("La fastidiaste vaquero, vuelva a intentarlo");

                    }

                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 0 y 2");
            }

        } while (!salir);

    }
}