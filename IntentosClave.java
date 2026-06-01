import java.util.Scanner;

public class IntentosClave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String clave = "1234";
        String intento;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Intento " + i + ": ");
            intento = sc.nextLine();

            if (intento.equals(clave)) {
                System.out.println("✅ Correcto");
                break;
            }
        }

        sc.close();
    }
}