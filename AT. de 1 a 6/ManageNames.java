import java.util.ArrayList;

public class ManageNames {
    public static void main(String[] args) {
        // Criando um ArrayList e adicionando 5 nomes
        ArrayList<String> names = new ArrayList<>();
        names.add("Talles");
        names.add("Bruno");
        names.add("Carlos");
        names.add("Daniela");
        names.add("Elena");

        // Remover o segundo nome (Bruno)
        names.remove(1);

        // Imprimir todos os nomes após a primeira remoção
        System.out.println("Após remover o segundo nome:");
        for (String name : names) {
            System.out.println(name);
        }

        // Remover o terceiro nome (Carlos), que agora é o segundo na lista após a primeira remoção
        names.remove(1);  // Remover o nome que está na posição 1 após a primeira remoção

        // Imprimir todos os nomes após a segunda remoção
        System.out.println("Após remover o terceiro nome:");
        for (String name : names) {
            System.out.println(name);
        }

        // Verificar se o primeiro nome é "Talles"
        if (!names.isEmpty() && names.get(0).equals("Talles")) {
            System.out.println("O primeiro nome é Talles.");
        } else {
            System.out.println("O primeiro nome não é Talles.");
        }
    }
}
