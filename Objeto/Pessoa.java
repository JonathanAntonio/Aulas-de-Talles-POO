public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    private double altura;

    // Construtor
    public Pessoa(String nome, int idade, String endereco, String telefone, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.altura = altura;
    }

    // Métodos

    // Método para obter o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Método para definir o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter a idade da pessoa
    public int getIdade() {
        return idade;
    }

    // Método para definir a idade da pessoa
    public void setIdade(int idade) {
        if (idade >= 0) {  // Verifica se a idade é válida
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }

    // Método para calcular se a pessoa é maior de idade
    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }

    // Método para mostrar as informações da pessoa
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Altura: " + altura + " metros");
    }

    // Método para atualizar o endereço
    public void atualizarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    // Método para verificar a altura (retorna um valor booleano)
    public boolean alturaAdequada(double alturaMinima) {
        return altura >= alturaMinima;
    }

    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("João", 25, "Rua A, 123", "1234-5678", 1.75);
        
        // Mostrando as informações da pessoa
        pessoa.mostrarInformacoes();
        
        // Verificando se a pessoa é maior de idade
        if (pessoa.isMaiorDeIdade()) {
            System.out.println(pessoa.getNome() + " é maior de idade.");
        } else {
            System.out.println(pessoa.getNome() + " não é maior de idade.");
        }
        
        // Atualizando o endereço
        pessoa.atualizarEndereco("Rua B, 456");
        
        // Mostrando as informações atualizadas
        pessoa.mostrarInformacoes();
        
        // Verificando altura adequada
        double alturaMinima = 1.70;
        if (pessoa.alturaAdequada(alturaMinima)) {
            System.out.println(pessoa.getNome() + " tem altura adequada.");
        } else {
            System.out.println(pessoa.getNome() + " não tem altura adequada.");
        }
    }
}
