package Models.Classes;

public class Monstro {
    // Define os atributos da classe
    private String nome;
    private int poder;
    private int quantidadeDeTesouros;
    private int niveisPerdidos;

    // Inicializa os valores da classe
    public Monstro(String nome, int poder, int quantidadeDeTesouros, int niveisPerdidos) {
        this.nome = nome;
        this.poder = poder;
        this.quantidadeDeTesouros = quantidadeDeTesouros;
        this.niveisPerdidos = niveisPerdidos;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public int getQuantidadeDeTesouros() {
        return quantidadeDeTesouros;
    }

    public int getNiveisPerdidos() {
        return niveisPerdidos;
    }

    // Métodos setters
    public void setNome(String nomeMonstro) {
        nome = nomeMonstro;
    }

    public void setPoder(int poderMonstro) {
        poder = poderMonstro;
    }

    public void setQuantidadeDeTesouros(int nTesouros) {
        quantidadeDeTesouros = nTesouros;
    }

    public void setNiveisPerdidos(int niveisPerdidosMonstro) {
        niveisPerdidos = niveisPerdidosMonstro;
    }

    // Método para visualizar a classe instanciada e seus atributos
    public String toString() {
        String classeInformation = "MONSTER\n" + "Nome: " + nome + "\n" 
        + "Poder: " + poder + "\n"
        + "Quantidade de tesouros: " + quantidadeDeTesouros + "\n"
        + "Níveis perdidos: " + niveisPerdidos + "\n";
        return classeInformation;
    }
    
}
