/*
 * Clase hotel:DNI, nombre, apellidos, dirección, email, teléfono, edad, fecha de nacimiento
 */


import java.util.Date;
import java.util.Objects;


/**
 *
 * @author loresodio
 */
public class Cliente {

    //Atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String edad;
    private String fechaDeNacimiento;

    //Metodos
    //Constructor
    public Cliente(String dni, String nombre, String apellidos, String email, String telefono, String edad, String fechaDeNacimiento){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos= apellidos;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }




    @Override
    public String toString() {
        return "Cliente: " +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", teléfono='" + telefono + '\'' +
                ", edad='" + edad + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getTeléfono() {
        return telefono;
    }

    public String getEdad() {
        return edad;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
}

