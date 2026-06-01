import java.util.Scanner;

public class FiltrarLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese texto: ");
        String texto = sc.nextLine();

        System.out.println("Solo letras:");

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isDigit(c)) {
                continue;
            }

            System.out.print(c);
        }

        sc.close();
    }
}