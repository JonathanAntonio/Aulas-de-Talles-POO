public class MagoNegroRPG {
    // Atributos
    private String nomeHeroi;
    private String classeHeroi;
    private int nivelHeroi;
    private int vidaHeroi;
    private int manaHeroi;
    private int forcaHeroi;
    private int agilidadeHeroi;
    private int inteligenciaHeroi;

    // Construtor padrão
    public MagoNegroRPG() {
        this.nomeHeroi = "Eldrin";  // Nome do herói definido
        this.classeHeroi = "Mago";
        this.nivelHeroi = 100;
        this.vidaHeroi = 10000;
        this.manaHeroi = 500;
        this.forcaHeroi = 10;
        this.agilidadeHeroi = 10;
        this.inteligenciaHeroi = 10;
    }

    // Construtor com nome e classe
    public MagoNegroRPG(String nomeHeroi, String classeHeroi) {
        this.nomeHeroi = nomeHeroi;
        this.classeHeroi = classeHeroi;
        this.nivelHeroi = 1;
        this.vidaHeroi = 100;
        this.manaHeroi = 50;
        this.forcaHeroi = 10;
        this.agilidadeHeroi = 10;
        this.inteligenciaHeroi = 10;
    }

    // Construtor completo
    public MagoNegroRPG(String nomeHeroi, String classeHeroi, int nivelHeroi, int vidaHeroi, int manaHeroi, int forcaHeroi, int agilidadeHeroi, int inteligenciaHeroi) {
        this.nomeHeroi = nomeHeroi;
        this.classeHeroi = classeHeroi;
        this.nivelHeroi = nivelHeroi;
        this.vidaHeroi = vidaHeroi;
        this.manaHeroi = manaHeroi;
        this.forcaHeroi = forcaHeroi;
        this.agilidadeHeroi = agilidadeHeroi;
        this.inteligenciaHeroi = inteligenciaHeroi;
    }

    // Métodos

    // 1. Exibir informações
    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nomeHeroi);
        System.out.println("Classe: " + this.classeHeroi);
        System.out.println("Nível: " + this.nivelHeroi);
        System.out.println("Vida: " + this.vidaHeroi);
        System.out.println("Mana: " + this.manaHeroi);
    }

    // 2. Atacar
    public void atacarInimigo(String inimigo) {
        int dano = this.forcaHeroi * 2;
        System.out.println(this.nomeHeroi + " atacou " + inimigo + " causando " + dano + " de dano!");
    }

    // 3. Lançar magia
    public void usarMagia(String inimigo, String magia) {
        if (this.manaHeroi >= 10) {
            int danoMagico = this.inteligenciaHeroi * 3;
            this.manaHeroi -= 10;
            System.out.println(this.nomeHeroi + " lançou " + magia + " em " + inimigo + ", causando " + danoMagico + " de dano mágico!");
        } else {
            System.out.println(this.nomeHeroi + " não tem mana suficiente para lançar " + magia + "!");
        }
    }

    // 4. Subir de nível
    public void aumentarNivel() {
        this.nivelHeroi++;
        this.vidaHeroi += 20;
        this.manaHeroi += 10;
        this.forcaHeroi += 2;
        this.agilidadeHeroi += 2;
        this.inteligenciaHeroi += 2;
        System.out.println(this.nomeHeroi + " subiu para o nível " + this.nivelHeroi + "!");
    }

    // 5. Recuperar vida
    public void curarVida(int quantidade) {
        this.vidaHeroi += quantidade;
        System.out.println(this.nomeHeroi + " recuperou " + quantidade + " pontos de vida.");
    }

    // 6. Recuperar mana
    public void restaurarMana(int quantidade) {
        this.manaHeroi += quantidade;
        System.out.println(this.nomeHeroi + " recuperou " + quantidade + " pontos de mana.");
    }

    // 7. Status do personagem
    public void mostrarStatus() {
        System.out.println("Status atual de " + this.nomeHeroi + ": Vida = " + this.vidaHeroi + ", Mana = " + this.manaHeroi);
    }

    public static void main(String[] args) {
        // Criando o herói Eldrin
        MagoNegroRPG eldrin = new MagoNegroRPG();
        eldrin.mostrarInformacoes();
    }
}

