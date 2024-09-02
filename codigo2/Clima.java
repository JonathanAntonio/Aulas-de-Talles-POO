import java.util.Scanner;

public class Clima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        int temperatura = scanner.nextInt();

        if (temperatura > 30) {
            System.out.println("O clima está quente.");
        } else {
            System.out.println("O clima está frio.");
        }

        scanner.close();
    }
}
