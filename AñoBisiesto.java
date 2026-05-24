import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = entrada.nextInt();

        // Verificación de año bisiesto
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }

        entrada.close();
    }
}