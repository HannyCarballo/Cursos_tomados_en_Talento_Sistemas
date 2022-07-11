import java.util.Scanner;
public class Numeros {
    public static void main(String args[]){
        System.out.println("Teclea un numero del 1 al 5");
        Scanner opc = new Scanner(System.in);
        int num = opc.nextInt();

        switch(num){
            case 1:
            System.out.println("Escogiste el 1");
            break;
            
            case 2:
            System.out.println("Escogiste el 2");
            break;

            case 3:
            System.out.println("Escogiste el 3");
            break;

            case 4:
            System.out.println("Escogiste el 4");
            break;

            case 5:
            System.out.println("Escogiste el 5");
            break;

            default:
            System.out.println("Escogiste un numero fuera del rango");
        }
    }
}