package Models;


public class Raca {
    //Deefine os atributos da classe Raca
    final String descricao = null;  // Atributo descricao nunca será mutável por final
    private String nomdeDaRaca;
    final int minimoPraFugir;

    // Inicializa os atributos da classe com os proprios valores passados para o objeto
    public Raca(String nomdeDaRaca, int minimoPraFugir) {
        this.nomdeDaRaca = nomdeDaRaca;
        this.minimoPraFugir = minimoPraFugir;
    }

    //Métodos getters
    public  String getDescricao() {
        return descricao;
    }

    public String getNomeDaRaca() {
        return nomdeDaRaca;
    }

    public int getMinimoPraFugir() {
        return minimoPraFugir;
    }

    //Métodos setters
    public void setNomeDaRaca(String nome) {
        this.nomdeDaRaca = nome;
    }

    //Método que imprime as informações da Raça
    public String toString() {
        String racaInformation = "RAÇA\n" + "Descrição: " + descricao + "\n" +
                                 "Nome da raça: " + nomdeDaRaca + "\n" +
                                 "Valor mínimo para fugir: " + minimoPraFugir + "\n";


        return racaInformation;
    }
}