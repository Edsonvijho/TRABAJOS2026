import java.util.Scanner;

public class DescuentoCliente {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto de compra: ");
        double compra = entrada.nextDouble();

        entrada.nextLine(); // limpiar buffer

        System.out.print("Ingrese tipo de cliente (VIP o NORMAL): ");
        String cliente = entrada.nextLine();

        double descuento = 0;

        // Condiciones
        if (compra > 500 && cliente.equalsIgnoreCase("VIP")) {
            descuento = compra * 0.20;
        } else if (compra > 500) {
            descuento = compra * 0.10;
        } else {
            descuento = 0;
        }

        double total = compra - descuento;

        // Resultados
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);

        entrada.close();
    }
}