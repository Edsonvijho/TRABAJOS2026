import java.util.Scanner;

public class ControlAcceso {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese rol (ADMIN, USER, GUEST): ");
        String rol = sc.next().toUpperCase();

        switch(rol) {

            case "ADMIN":
                System.out.println("Acceso total");
                break;

            case "USER":
                System.out.println("Acceso parcial");
                break;

            case "GUEST":
                System.out.println("Solo lectura");
                break;

            default:
                System.out.println("Rol inválido");
        }

        sc.close();
    }
}