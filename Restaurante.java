import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Desayuno");
        System.out.println("2. Almuerzo");
        System.out.println("3. Cena");

        System.out.print("Seleccione opción: ");
        int opcion = sc.nextInt();

        switch(opcion) {

            case 1:
                System.out.println("1. Café - S/5");
                System.out.println("2. Pan con huevo - S/8");
                break;

            case 2:
                System.out.println("1. Arroz con pollo - S/15");
                System.out.println("2. Lomo saltado - S/18");
                break;

            case 3:
                System.out.println("1. Pizza - S/20");
                System.out.println("2. Hamburguesa - S/16");
                break;

            default:
                System.out.println("Opción inválida");
        }

        sc.close();
    }
}