public class Ej8 {
    public static int[][] posicionAlfil(){
        int fila = (int)(Math.random()*8)+1;
        int columna = (int)(Math.random()*8)+1;
        int[][] posicion = new int[fila][columna];
        return posicion;
    }
    public static void imprimeTablero(int[][] tablero){
        int[][] posicion = posicionAlfil();
        tablero = new int[8][8];
        for(int i=0; i<tablero.length;i++){
            for(int j=0; j<tablero[i].length;j++){
                if(posicion!=tablero)
                System.out.printf("%1d ",tablero[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] tablero = new int[8][8];
        imprimeTablero(tablero);
    }
}
