import java.util.Scanner;

public class NegativoBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese número: ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Número negativo detectado. Fin.");
                break;
            }

            System.out.println("Número válido: " + num);
        }

        sc.close();
    }
}