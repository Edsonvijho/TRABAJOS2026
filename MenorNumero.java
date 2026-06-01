import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int menor = Integer.MAX_VALUE;

        System.out.println("Ingresa números (0 para terminar):");

        while (true) {
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        if (menor != Integer.MAX_VALUE) {
            System.out.println("El menor número es: " + menor);
        } else {
            System.out.println("No se ingresaron números.");
        }

        scanner.close();
    }
}