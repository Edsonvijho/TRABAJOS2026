import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;         // obtiene el último dígito
            invertido = invertido * 10 + digito; // lo agrega al número invertido
            numero = numero / 10;             // elimina el último dígito
        }

        System.out.println("Número invertido: " + invertido);

        sc.close();
    }
}
