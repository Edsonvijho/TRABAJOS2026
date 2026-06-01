import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int contador = 0;
        double nota;

        System.out.println("Ingresa notas (-1 para terminar):");

        while (true) {
            nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            suma += nota;
            contador++;
        }

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se ingresaron notas.");
        }

        scanner.close();
    }
}