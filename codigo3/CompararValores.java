import java.util.Scanner;

public class CompararValores {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Informe o valor para x: ");
            int valorX = input.nextInt();
            
            System.out.print("Informe o valor para y: ");
            int valorY = input.nextInt();
            
            int maior = (valorX > valorY) ? valorX : valorY;
            String resultado = (valorX == valorY) ? "Os valores são iguais." : "O maior valor é: " + maior;
            
            System.out.println(resultado);
        }
    }
}
