public class Ej6 {
    public static boolean repetido(int[][] valores, int valor, int posicion) {
        boolean repetido = false;
        for(int i=0; i<posicion && !repetido; i++){
            int fila = i/valores[0].length;
            int columna = i%valores[0].length;
            repetido = valores[fila][columna]==valor;
        }
        return repetido;
    }
    public static int[][] rellenaMatriz(int filas, int columnas){
        int[][] valores = new int[filas][columnas];
        for(int i=0; i<filas*columnas;i++){
            int valor = 0;
            do{
                valor = (int)(Math.random()*filas*columnas)+1;
            } while(repetido(valores, valor, i));
            valores[i/columnas][i%columnas] = valor;
        }
        return valores;
    }
    public static void imprimeMatriz(int[][] valores){
        for(int i=0; i<valores.length;i++){
            for(int j=0; j<valores[i].length;j++){
                System.out.printf("%3d   ",valores[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] valores = rellenaMatriz(10, 10);
        imprimeMatriz(valores);
    }
}
