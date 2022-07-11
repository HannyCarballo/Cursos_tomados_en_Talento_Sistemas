public class WhileJava {
    public static void main(String args[]){
        boolean llave = true;
        int contador = 0;
        while(llave){
            contador=contador+1;
            if(contador==11){
                llave = false;
            }
        System.out.println(contador);
        }
    }
}