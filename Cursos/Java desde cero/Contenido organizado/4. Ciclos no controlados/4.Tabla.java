public class Tabla {
    public static void main(String args[]){
        boolean llave = true;
        int contador = 0;
        while(llave){
            contador = contador + 9;
            if(contador==90){
                llave = false;
            }
            System.out.println(contador);
        }
    }
}
