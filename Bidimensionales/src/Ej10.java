public class Ej10 {
    public static void imprimeMatriz(int[][] valores){
        for(int i=0; i<valores.length;i++){
            for(int j=0; j<valores[i].length;j++){
                System.out.printf("%3d   ",valores[i][j]);
            }
            System.out.println();
        }
    }
}
