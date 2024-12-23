package Models;

public class Jogador {

    // Define os atributos da classe Jogador
    private String nome;
    private int nivel;
    private String raca;
    private String classe;
    private String itemCabeca;
    private String itemCorpo;
    private String itemMaoDireita;
    private String itemMaoEsquerda;
    private String itemPe;

    // Inicializa os valores da classe
    public Jogador(String nome, int nivel, String raca, String classe, String itemCabeca, String itemCorpo, String itemMaoDireita, String itemMaoEsquerda, String itemPe) {
        this.nome = nome;
        this.nivel = nivel;
        this.classe = classe;
        this.raca = raca;
        this.itemCabeca = itemCabeca;
        this.itemCorpo = itemCorpo;
        this.itemMaoDireita = itemMaoDireita;
        this.itemMaoEsquerda = itemMaoEsquerda;
        this.itemPe = itemPe;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public String getRaca() {
        return raca;
    }

    public String getClasse() {
        return classe;
    }

    public String getItemCabeString() {
        return itemCabeca;
    }

    public String getItemCorpo() {
        return itemCorpo;
    }

    public String getItemMaoDireita() {
        return itemMaoDireita;
    }

    public String getItemMaoEsquerda() {
        return itemMaoEsquerda;
    }

    public String getItemPe() {
        return itemPe;
    }

    // Métodos setters
    public void setNome(String nomeJogador) {
        nome =  nomeJogador;
    }

    public void setNivel(int nivelJogador) {
        nivel = nivelJogador;
    }

    public void setRaca(String racaJogador) {
        raca = racaJogador;
    }

    public void setClasse(String classeJogador) {
       classe = classeJogador;
    }

    public void setItemCabeString(String cabecaJogador) {
        itemCabeca = cabecaJogador;
    }

    public void setItemCorpo(String corpoJogador) {
       itemCorpo = corpoJogador;
    }

    public void setItemMaoDireita(String maoDireitaJogador) {
        itemMaoDireita = maoDireitaJogador;
    }

    public void setItemMaoEsquerda(String maoEsquerdaJogador) {
        itemMaoEsquerda = maoEsquerdaJogador;
    }

    public void setItemPe(String peJogador) {
        itemPe = peJogador;
    }

    // Método para visualizar a classe instanciada e seus atributos
    public String toString() {

        //Se possuir mão vazia, não printará o valor do atributo da mão vazia
        if (possuiMaoVazia()) {
            String classeInformation = "JOGADOR\n" + 
            "Nome: " + nome + "\n" + 
            "Nível: " + nivel + "\n" + 
            "Raça: " + raca + "\n" + 
            "Classe: " + classe + "\n" + 
            "Item na cabeça: " + itemCabeca + "\n" + 
            "Item no corpo: " + itemCorpo + "\n" + 
            "Item nos pés: " + itemPe + "\n";

            if(!itemMaoDireita.isEmpty()) {
                classeInformation += "Item na mão direita: " + itemMaoDireita + "\n";
            } else {
                classeInformation += "Item na mão esquerda: " + itemMaoEsquerda + "\n";
            }

            return classeInformation;
        } 

        

        String classeInformation = "JOGADOR\n" + 
        "Nome: " + nome + "\n" + 
        "Nível: " + nivel + "\n" + 
        "Raça: " + raca + "\n" + 
        "Classe: " + classe + "\n" + 
        "Item na cabeça: " + itemCabeca + "\n" + 
        "Item no corpo: " + itemCorpo + "\n" + 
        "Item na mão direita: " + itemMaoDireita + "\n" + 
        "Item na mão esquerda: " + itemMaoEsquerda + "\n" + 
        "Item nos pés: " + itemPe + "\n";
        return classeInformation;

    
    }

    //Método que irá retornar se existe alguma mão vazia
    public boolean possuiMaoVazia() {
        if (itemMaoDireita == null || itemMaoEsquerda == null) {
            return true;
        }
        return false;
    }
}