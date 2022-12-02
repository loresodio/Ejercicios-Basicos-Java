/*
 * Clase hotel:Descripción, Nombre, dirección postal, teléfono, email
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


/**
 *
 * @author loresodio
 */
public class Hotel {

    //Atributos
    private String descripción;
    private String nombre;
    private Integer direcciónPostal;
    private String teléfono;
    private String email;
    private List<Cliente> listaClientes;
    Scanner sc = new Scanner(System.in);


    //Metodos
    //Constructor
    public Hotel(){
        this.descripción = "Hotel de vacaciones";
        this.nombre = "Marina D'Or";
        this. direcciónPostal = Integer.valueOf("25166");
        this.teléfono = "934589560";
        this.email = "marinador@ciudaddevacaciones.es";
        listaClientes = new ArrayList<Cliente>();
    }

    //miHotelito.motrarListaClientes: Método que muestra una lista de clientes si la hay, en el caso en el que sea nula, salta excepcion
    public void mostrarListaClientes() {
        if (listaClientes.size() == 0) {
            System.out.println("Lista vacia");

        } else {
            for (int i = 0; i < listaClientes.size(); i++) {
                System.out.println(listaClientes.get(i).toString());
            }
        }
    }

        //miHotelito.promocion: Pide al usuario una edad máxima y una edad mínima, si la edad es:
        public void promocion() {
            Integer edadMinima;
            Integer edadMaxima;

            System.out.println("Introduzca una edad mínima:");
            edadMinima = sc.nextInt();

            System.out.println("Introduzca una edad máxima:");
            edadMaxima = sc.nextInt();

            //  Entre 0-16: pack 'Infantil', estancia gratis
            if (edadMinima >= 0 && edadMaxima <= 16) {
                System.out.println("Pack 'Infantil', estancia gratis");
            } else {
                System.out.println("No hay ninguna promoción disponible para ese rango de edad");

            }
        }

        // Entre 17-30: pack 'Juvenil', entrada gratis al parque de atracciones
        // Entre 31-50: pack '¿Quedamos?', barra libre entre las 10p.m - 12 p.m
        // Entre 51-65: pack 'Urbanitas', grandes descuentos en las tiendas del hotel
        // Entre 66-99: pack 'BINGO', 7 cartones gratis en nuestro bingo

    //cliente.crear: Método que crea un nuevoUsuario
    public void crear() {
        System.out.println("Introduzca el dni:");
        String dni = sc.nextLine();
        System.out.println("Introduzca el nombre:");
        String nombre = sc.nextLine();
        System.out.println("Introduzca los apellidos:");
        String apellidos = sc.nextLine();
        System.out.println("Introduzca un email:");
        String email = sc.nextLine();
        System.out.println("Introduzca un telefono:");
        String telefono = sc.nextLine();
        System.out.println("Introduzca una edad:");
        String edad = sc.nextLine();
        System.out.println("Introduzca una fechaDeNacimiento:");
        String fechaDeNacimiento = sc.nextLine();


            Cliente nuevoCliente = new Cliente(dni, nombre, apellidos, email, telefono,edad,fechaDeNacimiento);
            listaClientes.add(nuevoCliente);
    }



    //cliente.eliminar: Método que elimina un nuevoUsuario
    public void eliminar(){
        System.out.println("Introduzca el dni de la persona que desee eliminar:");
        String dni = sc.nextLine();

        for(int i = 0; i<this.listaClientes.size(); i++){
            if(Objects.equals(dni, listaClientes.get(i).getDni())){
                listaClientes.remove(i);
                System.out.println("Usuario eliminado:");

            }else{
                System.out.println("No hay ningún usuario con ese dni");
            }
        }
    }


    public String getDescripción() {
        return descripción;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDirecciónPostal() {
        return direcciónPostal;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public String getEmail() {
        return email;
    }


    public int size() {return listaClientes.size();}

}

