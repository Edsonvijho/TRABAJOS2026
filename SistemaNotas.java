import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double n3 = sc.nextDouble();

        double promedio = (n1 + n2 + n3) / 3;

        System.out.println("Promedio: " + promedio);

        if (promedio >= 11) {
            System.out.println("Aprobado");
        } 
        else if (promedio > 8) {
            System.out.println("Recuperación");
        } 
        else {
            System.out.println("Desaprobado");
        }

        sc.close();
    }
}