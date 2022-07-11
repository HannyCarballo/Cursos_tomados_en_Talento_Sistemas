import java.util.Scanner;
public class ForJava{
    public static void main(String args[]){
        int Num = 0;
        for(int i=0; i<=100; i++){
            Scanner num = new Scanner(System.in);
            System.out.println("Cuando ingreses el numero 7, el ciclo se detendra.");
            Num = num.nextInt();

            if(Num==7){
                i=150;
            }
        }
    }
}