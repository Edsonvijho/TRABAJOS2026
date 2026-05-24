import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Metros a Kilómetros");
        System.out.println("2. Kilómetros a Metros");
        System.out.println("3. Celsius a Fahrenheit");
        System.out.println("4. Fahrenheit a Celsius");

        System.out.print("Seleccione opción: ");
        int opcion = sc.nextInt();

        System.out.print("Ingrese valor: ");
        double valor = sc.nextDouble();

        switch(opcion) {

            case 1:
                System.out.println("Resultado: " + (valor / 1000) + " km");
                break;

            case 2:
                System.out.println("Resultado: " + (valor * 1000) + " m");
                break;

            case 3:
                System.out.println("Resultado: " + ((valor * 9/5) + 32) + " °F");
                break;

            case 4:
                System.out.println("Resultado: " + ((valor - 32) * 5/9) + " °C");
                break;

            default:
                System.out.println("Opción inválida");
        }

        sc.close();
    }
}