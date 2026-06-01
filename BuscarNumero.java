public class BuscarNumero {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 20};
        int buscado = 12;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == buscado) {
                System.out.println("Encontrado en posición: " + i);
                break;
            }
        }
    }
}
