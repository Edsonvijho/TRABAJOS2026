import java.util.Scanner;

public class ContarPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int contador = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = sc.nextInt();

        while (numero != 0) {
            if (numero > 0) {
                contador++; // cuenta solo positivos
            }

            System.out.print("Ingrese otro número (0 para terminar): ");
            numero = sc.nextInt();
        }

        System.out.println("Cantidad de números positivos: " + contador);

        sc.close();
    }
}