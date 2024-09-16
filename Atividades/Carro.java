public class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preco;
    private int quilometragem;
    private boolean funcionando;
    private int portas;

    // Construtor padrão
    public Carro() {
        this.marca = "Toyota";
        this.modelo = "Corolla";
        this.ano = 0;
        this.cor = "Desconhecida";
        this.preco = 10000.00;
        this.quilometragem = 0;
        this.funcionando = true;
        this.portas = 4;
    }

    // Construtor com alguns parâmetros
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = "azul";
        this.preco = 0.0;
        this.quilometragem = 0;
        this.funcionando = true;
        this.portas = 4;
    }

    // Construtor completo
    public Carro(String marca, String modelo, int ano, String cor, double preco, int quilometragem, boolean funcionando, int portas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.quilometragem = quilometragem;
        this.funcionando = funcionando;
        this.portas = portas;
    }

    // Método para ligar o carro
    public void ligar() {
        if (!funcionando) {
            funcionando = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método para desligar o carro
    public void desligar() {
        if (funcionando) {
            funcionando = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Método para dirigir o carro
    public void dirigir(int quilometros) {
        if (funcionando) {
            quilometragem += quilometros;
            System.out.println("Dirigido " + quilometros + " km. Quilometragem atual: " + quilometragem + " km.");
        } else {
            System.out.println("O carro precisa estar ligado para dirigir.");
        }
    }

    // Método para pintar o carro
    public void pintar(String novaCor) {
        cor = novaCor;
        System.out.println("Carro pintado de " + novaCor + ".");
    }

    // Método para ajustar o preço
    public void ajustarPreco(double novoPreco) {
        preco = novoPreco;
        System.out.println("Novo preço definido: R$ " + preco);
    }

    // Método para verificar o estado do carro
    public void verificarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("Funcionando: " + (funcionando ? "Sim" : "Não"));
        System.out.println("Portas: " + portas);
    }

    // Método para comparar o preço com outro carro
    public boolean compararPreco(Carro outroCarro) {
        return this.preco == outroCarro.preco;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isFuncionando() {
        return funcionando;
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    // Método principal para testar a classe Carro
    public static void main(String[] args) {
        // Criar instâncias da classe Carro usando diferentes construtores
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Toyota", "Corolla", 2020);
        Carro carro3 = new Carro("Honda", "Civic", 2022, "Preto", 100000.0, 15000, true, 4);

        // Usar os métodos da classe Carro
        carro1.verificarEstado();
        carro2.ligar();
        carro2.dirigir(50);
        carro2.pintar("Azul");
        carro2.ajustarPreco(80000.0);
        carro2.verificarEstado();

        // Comparar preços
        boolean mesmoPreco = carro2.compararPreco(carro3);
        System.out.println("Os preços dos carros são iguais? " + (mesmoPreco ? "Sim" : "Não"));

        // Testar desligar o carro
        carro2.desligar();
    }
}
