import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        int suma = 0;

        while (numero > 0) {
            int digito = numero % 10; // obtiene el último dígito
            suma += digito;           // acumula la suma
            numero = numero / 10;     // elimina el último dígito
        }

        System.out.println("La suma de los dígitos es: " + suma);

        sc.close();
    }
}