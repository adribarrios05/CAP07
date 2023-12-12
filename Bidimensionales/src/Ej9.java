public class Ej9 {
    public static int[][] rellenaMatriz(int filas,int  columnas){
        int[][] matriz = new int[filas][columnas];
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                matriz[i][j] = (int)(Math.random()*100)+1;
            }
        }
        return matriz;
    }
    public static void imprimeMatriz(int[][] valores){
        for(int i=0; i<valores.length;i++){
            for(int j=0; j<valores[i].length;j++){
                System.out.printf("%2d   ",valores[i][j]);
            }
            System.out.println();
        }
    }
    public static void rotaMatriz(int[][]valores){
        for(int i=0; i<valores.length;i++){
            for(int j=0; j<valores[i].length;i++){
                
            }
        }
    }
    public static void main(String[] args) {
        int[][] valores = rellenaMatriz(12, 12);
        imprimeMatriz(valores);
    }
}
