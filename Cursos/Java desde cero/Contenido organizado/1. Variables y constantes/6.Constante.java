public class Modificando {
    public static void main(String args[]){
        final int variable = 5;
        System.out.println(variable);
        variable = 2;
        System.out.println(variable);
    }
}  

/*
 * Respondiendo las preguntas:
 * ¿Que paso? 
 * El programa mando error
 * 
 * ¿Por qué cree usted que pasó?
 * Porque la variable al ser una constante, ya no se puede modificar otra vez su valor
 */