public class Ej3 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for(int i=0; i<=9;i++){
            System.out.print("Escribe un número: ");
            int numero = Integer.parseInt(System.console().readLine());
            numeros[i] = numero;
        }
        System.out.println();
        for(int i=9; i>=0; i--)
            System.out.println(numeros[i]);
    }
}
