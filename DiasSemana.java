import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número del 1 al 7: ");
        int dia = sc.nextInt();

        switch(dia) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Día laborable");
                break;

            case 6:
            case 7:
                System.out.println("Fin de semana");
                break;

            default:
                System.out.println("Número inválido");
        }

        sc.close();
    }
}