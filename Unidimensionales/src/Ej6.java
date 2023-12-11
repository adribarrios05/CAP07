public class Ej6 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for(int i=0; i<15; i++){
            System.out.print("Introduce un número: ");
            int numero = Integer.parseInt(System.console().readLine());
            array[i] = numero;
        }
        int aux = array[14];
        for(int i=14; i>0; i--){
            array[i] = array[i-1];
        }
        array [0] = aux;
        System.out.println();
        for(int i=0; i<15; i++){
            System.out.println(array[i]);
        }
    }
}
