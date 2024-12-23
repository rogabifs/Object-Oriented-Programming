package Models;

public class Classe {
    //Define os atributos da classe Classe
    final String descricao;
    private Item itemMaoDireita;
    private Item itemMaoEsquerda;
    private Item itemPe;

    public Classe(String descricao, Item itemMaoDireita, Item itemMaoEsquerda, Item itemPe) {
        this.descricao = descricao;
        this.itemMaoDireita = itemMaoDireita;
        this.itemMaoEsquerda = itemMaoEsquerda;
        this.itemPe = itemPe;
    }

    //Métodos getters
    public String getDescricao() {
        return descricao;
    }

    public Item getItemMaoDireita() {
        return itemMaoDireita;
    }

    public Item getItemMaoEsquerda() {
        return itemMaoEsquerda;
    }

    public Item getItemPe() {
        return itemPe;
    }
    
    //Métodos setters
    public void setItemMaoDireita(Item maoDireitaJogador) {
        itemMaoDireita = maoDireitaJogador;
    }

    public void setItemMaoEsquerda(Item maoEsquerdaJogador) {
        itemMaoEsquerda = maoEsquerdaJogador;
    }

    public void setItemPe(Item peJogador) {
        itemPe = peJogador;
    }

     // Método para visualizar a classe instanciada e seus atributos
    public String toString() {
        String classeInformation = "CLASSE\n" + 
        "Descrição: " + descricao + "\n" + 
        "Item na mão direita: " + itemMaoDireita + "\n" + 
        "Item na mão esquerda: " + itemMaoEsquerda + "\n" + 
        "Item no pé: " + itemPe + "\n";
        
        return classeInformation; 
    }
}
