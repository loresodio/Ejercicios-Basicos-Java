/*
 * Clase caja fuerte: tiene dos 
 */


import java.util.Objects;


/**
 *
 * @author loresodio
 */
public class CajaFuerte {

    //Atributos
    private String combinacion;
    //Si esta abierto permita cambiar contraseña
    private boolean abierto;

    //Metodos
    //Constructor
    public CajaFuerte(){
        this.combinacion="0000";
        this.abierto=false;
    }

    //Metodo que compara la contraseña introducida con la combinacion
    public boolean mismacontraseña(String numeroIntroducido){
        if (Objects.equals(numeroIntroducido, combinacion)){
            abierto=true;
        }else{
            abierto=false;
        }
        return abierto;
    }

    //Metodo que cambia la contraseña en el caso en el que hayamos
    public String cambiarContraseña(String nuevaCombinacion){
        if(abierto=true){
            combinacion=nuevaCombinacion;

        }
        return combinacion;
    }


}

