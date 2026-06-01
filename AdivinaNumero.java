import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100) + 1; // 1 a 100
        int intento;
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("🎯 Adivina el número entre 1 y 100");

        while (!adivinado) {
            System.out.print("Ingresa tu número: ");
            intento = scanner.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("📉 Demasiado bajo");
            } else if (intento > numeroSecreto) {
                System.out.println("📈 Demasiado alto");
            } else {
                System.out.println("🎉 ¡Correcto! Adivinaste en " + intentos + " intentos.");
                adivinado = true;
            }
        }

        scanner.close();
    }
}