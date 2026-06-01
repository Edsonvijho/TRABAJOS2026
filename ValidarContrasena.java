import java.util.Scanner;

public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contraseñaCorrecta = "1234";
        String intento;

        do {
            System.out.print("Ingresa la contraseña: ");
            intento = scanner.nextLine();

            if (!intento.equals(contraseñaCorrecta)) {
                System.out.println("❌ Incorrecta, intenta de nuevo.");
            }

        } while (!intento.equals(contraseñaCorrecta));

        System.out.println("✅ Acceso concedido");

        scanner.close();
    }
}