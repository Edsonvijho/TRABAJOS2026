import java.util.Scanner;

public class ClasificacionNumero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        // Positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // Par o impar
        if (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("Además es par");
            } else {
                System.out.println("Además es impar");
            }
        }

        entrada.close();
    }
}