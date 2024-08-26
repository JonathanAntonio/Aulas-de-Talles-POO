import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int escolha = -1;
            
            // Solicita ao usuário uma escolha válida
            while (escolha < 1 || escolha > 4) {
                System.out.println("Escolha uma operação: ");
                System.out.println("1. Adição");
                System.out.println("2. Subtração");
                System.out.println("3. Multiplicação");
                System.out.println("4. Divisão");
                
                try {
                    escolha = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número entre 1 e 4.");
                    scanner.next(); // Limpar o buffer do scanner
                }
            }

            double num1 = 0;
            double num2 = 0;
            
            // Solicita ao usuário os números
            try {
                System.out.println("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                
                System.out.println("Digite o segundo número: ");
                num2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira números válidos.");
                return; // Encerrar o programa após entrada inválida
            }
            
            double resultado;
            
            switch (escolha) {
                case 1 -> {
                    resultado = num1 + num2;
                    System.out.println("Resultado da adição: " + resultado);
                }
                case 2 -> {
                    resultado = num1 - num2;
                    System.out.println("Resultado da subtração: " + resultado);
                }
                case 3 -> {
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                }
                case 4 -> {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
