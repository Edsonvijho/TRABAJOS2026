import java.util.Scanner;

public class CategoriaEdad {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = entrada.nextInt();

        // Clasificación
        if (edad >= 0 && edad <= 12) {
            System.out.println("Categoría: Niño");
        }

        if (edad >= 13 && edad <= 17) {
            System.out.println("Categoría: Adolescente");
        }

        if (edad >= 18 && edad <= 64) {
            System.out.println("Categoría: Adulto");
        }

        if (edad >= 65) {
            System.out.println("Categoría: Adulto mayor");
        }

        entrada.close();
    }
}