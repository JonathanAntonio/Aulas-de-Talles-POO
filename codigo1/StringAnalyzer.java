public class StringAnalyzer {
    public static void main(String[] args) {
        // Exemplo de string para análise
        String input = "Rio de Janeiro";
        
        // Converta a string para maiúsculas uma vez
        String upperCaseString = input.toUpperCase();
        
        // a - Número de caracteres da string
        int length = input.length();
        System.out.println("Número de caracteres: " + length);
        
        // b - String com todas as letras em maiúsculo
        System.out.println("String em maiúsculo: " + upperCaseString);
        
        // c - Número de vogais
        int vowelCount = countVowels(input);
        System.out.println("Número de vogais: " + vowelCount);
        
        // d - Verificar se a string começa com "UNI"
        boolean startsWithUNI = upperCaseString.startsWith("UNI");
        System.out.println("Começa com 'UNI': " + startsWithUNI);
        
        // e - Verificar se a string termina com "RIO"
        boolean endsWithRIO = upperCaseString.endsWith("RIO");
        System.out.println("Termina com 'RIO': " + endsWithRIO);
    }
    
    // Método para contar o número de vogais na string
    private static int countVowels(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
