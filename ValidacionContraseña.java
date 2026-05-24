import java.util.Scanner;

public class ValidacionContraseña {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una contraseña numérica: ");
        int contraseña = entrada.nextInt();

        // Validación
        if (contraseña > 1000 && contraseña < 9999) {
            System.out.println("Contraseña válida");
        } else {
            System.out.println("Contraseña inválida");
        }

        entrada.close();
    }
}