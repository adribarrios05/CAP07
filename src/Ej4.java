public class Ej4 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        for(int i=0; i<=19; i++){
            int valor = (int)(Math.random()*100)+1;
            numero[i] = valor;
            cuadrado[i] = valor*valor;
            cubo[i] = valor*valor*valor;
        }
        for(int i=0; i<=19; i++){
            System.out.printf("%d   %d     %d%n",numero[i], cuadrado[i], cubo[i]);
        }
    }
}
