public class LimiteSuma {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma += i;

            if (suma > 100) {
                System.out.println("Se superó el límite en: " + i);
                break;
            }
        }
    }
}