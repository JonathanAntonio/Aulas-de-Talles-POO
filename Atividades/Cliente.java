public class Cliente {
    // Atributos privados (encapsulados)
    private String nome;
    private int idade;
    private String cpf;
    private String rg;
    private String endereco;
    private String telefone;
    private String email;
    private String genero;
    private String estadoCivil;
    private String nacionalidade;

    // Construtor
    public Cliente(String nome, int idade, String cpf, String rg, String endereco, String telefone, String email, String genero, String estadoCivil, String nacionalidade) {
        this.nome = nome;
        setIdade(idade);
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.nacionalidade = nacionalidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("Idade deve ser positiva.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    // Método toString para exibir os dados da pessoa
    @Override
    public String toString() {
        return "Cliente{" +
               "nome='" + nome + '\'' +
               ", idade=" + idade +
               ", cpf='" + cpf + '\'' +
               ", rg='" + rg + '\'' +
               ", endereco='" + endereco + '\'' +
               ", telefone='" + telefone + '\'' +
               ", email='" + email + '\'' +
               ", genero='" + genero + '\'' +
               ", estadoCivil='" + estadoCivil + '\'' +
               ", nacionalidade='" + nacionalidade + '\'' +
               '}';
    }

    // Método main para testar a classe Cliente
    public static void main(String[] args) {
        Cliente cliente = new Cliente(
            "João Silva", 
            30, 
            "123.456.789-00", 
            "12.345.678-9", 
            "Rua das Flores, 123", 
            "(11) 98765-4321", 
            "joao.silva@email.com", 
            "Masculino", 
            "Solteiro", 
            "Brasileiro"
        );

        System.out.println(cliente);
    }
}

