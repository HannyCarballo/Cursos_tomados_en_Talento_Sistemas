import java.util.Scanner;
public class WhileJava{
    public static void main(String args[]){
        int Num = 0;
        boolean llave = true;
        while(llave){
            Scanner num = new Scanner(System.in);
            System.out.println("Cuando ingreses el numero 7, el ciclo se detendra.");
            Num = num.nextInt();

            if(Num==7){
                llave=false;
            }
        }
    }
}