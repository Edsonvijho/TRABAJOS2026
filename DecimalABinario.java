import java.util.Scanner;

public class DecimalABinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número decimal: ");
        int numero = scanner.nextInt();

        String binario = "";

        while (numero > 0) {
            int residuo = numero % 2;
            binario = residuo + binario; // se agrega al inicio
            numero = numero / 2;
        }

        System.out.println("Número en binario: " + binario);

        scanner.close();
    }
}