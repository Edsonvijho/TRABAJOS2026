import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número: ");
        int num = sc.nextInt();

        int suma = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }

        if (suma == num) {
            System.out.println("Es número perfecto");
        } else {
            System.out.println("No es número perfecto");
        }

        sc.close();
    }
}