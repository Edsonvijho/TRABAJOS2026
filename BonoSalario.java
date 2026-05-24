import java.util.Scanner;

public class BonoSalario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su salario: ");
        double salario = sc.nextDouble();

        System.out.print("Ingrese sus años de trabajo: ");
        int anios = sc.nextInt();

        if (anios > 5 && salario < 2000) {
            System.out.println("Tiene un bono grande");
        } 
        else if (anios > 5 || salario < 2000) {
            System.out.println("Tiene un bono menor");
        } 
        else {
            System.out.println("No tiene bono");
        }

        sc.close();
    }
}