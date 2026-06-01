import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Número: ");
            arr[i] = sc.nextInt();
        }

        int mayor = arr[0];
        int menor = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > mayor) mayor = arr[i];
            if (arr[i] < menor) menor = arr[i];
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}