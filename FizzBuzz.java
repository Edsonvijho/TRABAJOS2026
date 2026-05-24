import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("FizzBuzz");
        } 
        else if (numero % 3 == 0) {
            System.out.println("Fizz");
        } 
        else if (numero % 5 == 0) {
            System.out.println("Buzz");
        } 
        else {
            System.out.println("No es múltiplo de 3 ni de 5");
        }

        sc.close();
    }
}