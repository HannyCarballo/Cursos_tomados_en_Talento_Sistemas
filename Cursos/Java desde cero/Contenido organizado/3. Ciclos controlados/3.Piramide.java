import java.util.Scanner;

public class Piramide {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num = entrada.nextInt();
        System.out.println(" ");
        for(int i=0;i<=num;i++){
            for(int j=0;j<num-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}