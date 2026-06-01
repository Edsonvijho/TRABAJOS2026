public class SumaPares {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        System.out.println("Suma de pares: " + suma);
    }
}