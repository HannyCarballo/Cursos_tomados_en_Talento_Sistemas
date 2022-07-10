public class Condicional_if {
    public static void main(String args[]){
        int numero_uno = 0;
        int numero_dos = 5;
        numero_uno = numero_uno + 5;
        if (numero_uno<numero_dos){
            System.out.println("Verdadero");
        }

        else{
            System.out.println("Falso");
        }
        System.out.println(numero_uno);
    }
} 

/*
 * Respondiendo las preguntas:
 * ¿Que imprimió? 
 * "Falso"
 * 
 * ¿Por qué? 
 * Porque no se cumple la condicion, ya que la primer variable es igual a la segunda, por eso se realiza lo que está en el else
 * 
 * ¿Puede hacer que el programa muestre el valor de número _ 1?
 * Sí, con la función para imprimir texto en pantalla
 * System.out.println("Falso");
 */