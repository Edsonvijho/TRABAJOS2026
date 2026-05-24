import java.util.Scanner;

public class OperacionesLogicas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese operador (AND, OR, XOR): ");
        String op = sc.next().toUpperCase();

        System.out.print("Ingrese primer valor (true/false): ");
        boolean a = sc.nextBoolean();

        System.out.print("Ingrese segundo valor (true/false): ");
        boolean b = sc.nextBoolean();

        switch(op) {

            case "AND":
                System.out.println("Resultado: " + (a && b));
                break;

            case "OR":
                System.out.println("Resultado: " + (a || b));
                break;

            case "XOR":
                System.out.println("Resultado: " + (a ^ b));
                break;

            default:
                System.out.println("Operador inválido");
        }

        sc.close();
    }
}