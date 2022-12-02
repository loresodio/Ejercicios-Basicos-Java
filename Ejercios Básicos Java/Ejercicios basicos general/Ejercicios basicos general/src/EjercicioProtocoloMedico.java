import java.util.Objects;
import java.util.Scanner;

/**
 * Ejercicio de Protocolo médico. Para practicar condicionales y bucles
 */

public class EjercicioProtocoloMedico {
    static boolean repetir=false;
        public static void main(String[] args) {
            do{
                sentencias();
            }while(repetir=true);

            
            }


    private static void sentencias(){
                String resultado;
                Scanner sc = new Scanner(System.in);
                System.out.println("Responda con 'Si', 'si', 'No' o 'no':");


                System.out.println("¿Fue complicada la ecografía transtorácica?");
                resultado = sc.nextLine();

                if (Objects.equals(resultado, "Si") || Objects.equals(resultado, "si")) {
                    System.out.println("Hay drenaje pleural: fibrinolíticos y antibioterapia");
                    System.out.println("¿Mala evolución en 48-72 horas?");
                    resultado = sc.nextLine();
                    if (Objects.equals(resultado, "Si") || Objects.equals(resultado, "si")) {
                        System.out.println("Ecografía");
                        System.out.println("¿Persistencia de derrame y septos?");
                        resultado = sc.nextLine();
                        if (Objects.equals(resultado, "Si") || Objects.equals(resultado, "si")) {
                            System.out.println("Videotoracoscopia");
                            System.exit(0);
                        }
                    } else if (Objects.equals(resultado, "No") || Objects.equals(resultado, "no")) {
                        System.out.println("Continuar tratamiento");
                        System.exit(0);

                    }} else if (Objects.equals(resultado, "No") || Objects.equals(resultado, "no")) {
                    System.out.println("¿Dificultad respiratoria?");
                    resultado = sc.nextLine();
                    if (Objects.equals(resultado, "Si") || Objects.equals(resultado, "si")) {
                        System.out.println("Realizar drenaje pleural y antibioterapia");
                        System.out.println("Empeoramiento en siguientes 24-48 horas?");
                        resultado = sc.nextLine();
                        if (Objects.equals(resultado, "Si") || Objects.equals(resultado, "si")) {
                            repetir=true;
                        } else if (Objects.equals(resultado, "No") || Objects.equals(resultado, "no")) {
                            System.out.println("Continuar tratamiento");
                            System.exit(0);
                        }
                    } else if (Objects.equals(resultado, "No") || Objects.equals(resultado, "no")) {
                        System.out.println("¿>10 mm?");
                        resultado = sc.nextLine();
                        if (Objects.equals(resultado, "Si") || Objects.equals(resultado, "si")) {
                            System.out.println("Toracocentresis diagnóstica");
                            System.out.println("¿Pus o pH < 7.2?");
                            resultado = sc.nextLine();
                            if (Objects.equals(resultado, "Si") || Objects.equals(resultado, "si")) {
                                System.out.println("Drenaje pleural y antibioterapia");
                                System.out.println("Empeoramiento en siguientes 24-48 horas?");
                                resultado = sc.nextLine();
                                if (Objects.equals(resultado, "Si") || Objects.equals(resultado, "si")) {
                                    repetir=true;
                                } else if (Objects.equals(resultado, "No") || Objects.equals(resultado, "no")) {
                                    System.out.println("Continuar tratamiento");
                                    System.exit(0);
                                }

                            } else if (Objects.equals(resultado, "No") || Objects.equals(resultado, "no")) {
                                System.out.println("Tratamiento conservador: Antibioterapia");
                                System.out.println("Empeoramiento en siguientes 24-48 horas?");
                                resultado = sc.nextLine();
                                if (Objects.equals(resultado, "Si") || Objects.equals(resultado, "si")) {
                                    repetir=true;
                                } else if (Objects.equals(resultado, "No") || Objects.equals(resultado, "no")) {
                                    System.out.println("Continuar tratamiento");
                                    System.exit(0);
                                }
                            }
                        } else if (Objects.equals(resultado, "No") || Objects.equals(resultado, "no")) {
                            System.out.println("Continuar tratamiento");
                            System.out.println("Tratamiento conservador: Antibioterapia");
                            System.out.println("Empeoramiento en siguientes 24-48 horas?");
                            resultado = sc.nextLine();
                            if (Objects.equals(resultado, "Si") || Objects.equals(resultado, "si")) {
                                //
                            } else if (Objects.equals(resultado, "No") || Objects.equals(resultado, "no")) {
                                System.out.println("Continuar tratamiento");
                                System.exit(0);
                            }
                        }
                    }
                }
            } 
        }
