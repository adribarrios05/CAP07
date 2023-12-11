public class Ej5 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int maximo = 0;
        int minimo = 100000;
        for(int i=0; i<10; i++){
            System.out.print("Ingrese un número: ");
            int numero = Integer.parseInt(System.console().readLine());
            num[i] = numero;
            if(numero>maximo)
                maximo = numero;
            else if(numero<minimo)
                minimo = numero;
        }
        for(int i=0; i<10; i++){
            System.out.print("\n"+num[i]);
            int numero = num[i];
            if (numero==maximo)
                System.out.print(": Máximo");
            else if(numero==minimo)
                System.out.print(": Mínimo");
        }
    }
}
