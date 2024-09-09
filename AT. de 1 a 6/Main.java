public class Main {
    public static void main(String[] args) {
        // Criando um array com 10 valores
        int[] array = {1, 4, 3, 7, 2, 8, 5, 6, 0, 9};

        // Iterando sobre o array e imprimindo valores maiores que 3
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3) {
                System.out.println(array[i]);
            }
        }
    }
}
