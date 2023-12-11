public class Ej2 {
    public static int[][] rellenaMatriz(int filas,int  columnas){
        int[][] matriz = new int[filas][columnas];
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                matriz[i][j] = (int)(Math.random()*100)+1;
            }
        }
        return matriz;
    }
    public static void imprimeMatriz(int valores[][]) throws InterruptedException {
        for(int i=0; i<valores.length;i++){
            int suma = 0; 
            for(int j=0; j<valores[i].length; j++){
                suma+=valores[i][j];
                Thread.sleep(100);
                System.out.printf("%5d   ", valores[i][j]);
            }
            Thread.sleep(500);
            System.out.printf("|     %d%n",suma);
        }
        for(int i=0; i<valores[0].length*10+8;i++)
            System.out.print("-");
        System.out.println();
        int total = 0;
        for(int i=0; i<valores[0].length;i++){
            int suma = 0;
            for(int j=0; j<4; j++){
                suma+=valores[j][i];
            }
            System.out.printf("%5d   ", suma);
            total+=suma; 
        }
        System.out.printf("|     %d%n",total);
    }
    public static void main(String[] args) throws InterruptedException {
        int valores[][] = rellenaMatriz(4, 5);
        imprimeMatriz(valores);
    }
}
