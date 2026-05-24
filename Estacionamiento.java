import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Moto");
        System.out.println("2. Auto");
        System.out.println("3. Camión");

        System.out.print("Seleccione vehículo: ");
        int tipo = sc.nextInt();

        System.out.print("Ingrese horas: ");
        int horas = sc.nextInt();

        double tarifa = 0;

        switch(tipo) {

            case 1:
                tarifa = 3;
                break;

            case 2:
                tarifa = 5;
                break;

            case 3:
                tarifa = 10;
                break;

            default:
                System.out.println("Vehículo inválido");
        }

        if(tarifa > 0) {
            System.out.println("Total a pagar: S/" + (tarifa * horas));
        }

        sc.close();
    }
}