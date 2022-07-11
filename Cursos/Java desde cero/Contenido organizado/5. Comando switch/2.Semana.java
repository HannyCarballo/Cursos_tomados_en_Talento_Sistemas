import java.util.Scanner;
public class Semana {
    public static void main(String args[]){
        System.out.println("Ingresa un dia de la semana");
        Scanner dato =  new Scanner(System.in);
        String dia = dato.next();

        switch(dia){
            case "Lunes":
            System.out.println("Ingresaste el dia lunes");
            break;

            case "Martes":
            System.out.println("Ingresaste el dia martes");
            break;

            case "Miercoles":
            System.out.println("Ingresaste el dia miercoles");
            break;

            case "Jueves":
            System.out.println("Ingresaste el dia jueves");
            break;

            case "Viernes":
            System.out.println("Ingresaste el dia viernes");
            break;

            case "Sabado":
            System.out.println("Ingresaste el dia sabado");
            break;

            case "Domingo":
            System.out.println("Ingresaste el dia domingo");
            break;

            default:
            System.out.println("Ingresaste un dia incorrecto");
        }
    }
}