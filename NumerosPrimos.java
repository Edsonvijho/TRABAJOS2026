import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inicio: ");
        int inicio = sc.nextInt();

        System.out.print("Fin: ");
        int fin = sc.nextInt();

        int contador = 0;

        for (int i = inicio; i <= fin; i++) {
            boolean esPrimo = true;

            if (i <= 1) esPrimo = false;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) contador++;
        }

        System.out.println("Cantidad de primos: " + contador);
        sc.close();
    }
}