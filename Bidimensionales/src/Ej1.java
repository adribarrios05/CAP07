public class Ej1 {
    public static void imprimeMatriz(int[][] valores){
        System.out.printf("%10s"," ");
        for(int i=0; i<valores[0].length;i++){
            System.out.printf("Columna %d    ",i);
        }
        System.out.println();
        for(int i=0; i<valores.length; i++){
            System.out.printf("Fila %d     ", i);
            for(int j=0; j<valores[i].length;j++){
                System.out.printf("%5d        ",valores[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        int[][] valores = new int [3][6];
        valores[0][0] = 0;
        valores[0][1] = 30;

        imprimeMatriz(valores);
    }
}
