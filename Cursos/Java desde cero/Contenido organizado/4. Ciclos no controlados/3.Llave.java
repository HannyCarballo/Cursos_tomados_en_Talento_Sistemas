public class Llave {
    public static void main(String args[]){
        boolean llave = true;
        int contador = 0;
        do{
            System.out.println(contador);
            contador++;
            if(contador==11){
                llave = false;
            }
        }
        while(llave);
    }
}
