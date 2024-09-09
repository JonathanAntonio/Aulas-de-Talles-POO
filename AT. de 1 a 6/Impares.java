public class Impares {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 50) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}