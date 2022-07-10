import java.util.Scanner;
public class Condicional_if {
    public static void main(String args[]){
        System.out.println("Ingresa tu edad, porfavor");
        Scanner Edad = new Scanner(System.in);
        int edad = Edad.nextInt();

        if(edad>=18){
            System.out.println("Eres mayor de edad, puedes pasar");
        }

        else{
            System.out.println("Eres menor de edad, no puedes ingresar");
        }
    }
}  