/*
 * Este programa ve si la persona es mayor o menor de edad.
 * Suponiendo que la fecha es 7 de febrero del 2020 
 * Los que nacieron antes del 7 de febrero del 2002 serán mayores de edad
 * Los que nacieron después de esta fecha serán menores de edad
 */
import java.util.Scanner;
public class Edad {
    public static void main(String args[]){
        Scanner Leer1 = new Scanner(System.in);
        System.out.println("Ingresa tu dia de nacimiento");
        int dia = Leer1.nextInt();
        Scanner Leer2 = new Scanner(System.in);
        System.out.println("Ingresa tu mes de nacimiento");
        int mes = Leer2.nextInt();
        Scanner Leer3 = new Scanner(System.in);
        System.out.println("Ingresa tu anio de nacimiento");
        int anio = Leer3.nextInt();
        /*
         * Suponiendo que el usuario ingresa correctamente la fecha, el código quedaría así:
         */
        if((dia>0 && dia<=31 && mes>0 && mes<=12 && anio<=2001)||(dia>0 && dia<=31 && mes==1 && anio==2002)||(dia>0 && dia<=7 && mes==2 && anio==2002))
            System.out.println("Mayor de edad");
        else
            System.out.println("Menor de edad");
     }
}