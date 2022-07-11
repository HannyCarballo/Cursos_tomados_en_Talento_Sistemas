import java.util.Scanner;
public class Condicional{
    public static void main(String args[]){
        System.out.println("Ingresa la edad, porfavor");
        Scanner Edad = new Scanner(System.in);
        int edad = Edad.nextInt();
        Scanner UsuarioScan = new Scanner(System.in);
        System.out.println("\nEs hombre, mujer o mascota");
        String usuario = UsuarioScan.next();
        
        if((usuario.equals("hombre") || usuario.equals("mujer")) && (edad>=18 && edad<50))
            System.out.println("\nPuede pasar");
        else
            System.out.println("\nNo puede ingresar");
    }
}  