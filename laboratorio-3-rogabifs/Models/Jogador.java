package Models;

import java.util.LinkedList;


public class Jogador {

    // Define os atributos da classe Jogador
    final String nome;
    private int nivel;
    private RacaEnum raca;
    private ClasseEnum classe;
    private Inventario inventario;
    private Item itemCabeca;
    private Item itemCorpo;
    private Item itemMaoDireita;
    private Item itemMaoEsquerda;
    private Item itemPe;
   

    // Inicializa os valores da classe
    public Jogador(String nome, int nivel, RacaEnum raca, ClasseEnum classe, Inventario inventario) {
        this.nome = nome;
        this.nivel = nivel;
        this.classe = classe;
        this.raca = raca;
        this.inventario = inventario;
    }
    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public RacaEnum getRaca() {
        return raca;
    }

    public ClasseEnum getClasse() {
        return classe;
    }

    public Inventario getInventario() {
        return inventario;
   }

    public Item getItemCabeca() { return itemCabeca; }

    public Item getItemCorpo() { return itemCorpo;}

    public Item getItemMaoDireita() { return itemMaoDireita; }

    public Item getItemMaoEsquerda() { return itemMaoEsquerda; }

    public Item getItemPe() { return itemPe; }


    // Métodos setters
    public void setNivel(int nivelJogador) {
        nivel = nivelJogador;
    }

    public void setRaca(RacaEnum racaJogador) {
        raca = racaJogador;
    }

    public void setClasse(ClasseEnum classeJogador) {
       classe = classeJogador;
    }

    public void setInventario(Inventario inventarioJogador) {
        inventario = inventarioJogador;
    }

    public void setItemCabeca(Item itemCabecaJogador) {itemCabeca = itemCabecaJogador;}

    public void setItemCorpo(Item itemCorpoJogador) {itemCorpo = itemCorpoJogador;}

    public void setItemMaoDireita(Item itemMaoDireitaJogador) {itemMaoDireita = itemMaoDireitaJogador;}

    public void setItemMaoEsquerda(Item itemMaoEsquerdaJogador) {itemMaoEsquerda = itemMaoEsquerdaJogador;}

    public void setItemPe(Item itemPeJogador) {itemPe = itemPeJogador;}

    // Método para visualizar a classe instanciada e seus atributos
    public String toString() {
        String classeInformation = "JOGADOR\n" + 
        "Nome: " + nome + "\n" + 
        "Nível: " + nivel + "\n" + 
        "Raça: " + raca + "\n" + 
        "Classe: " + classe + "\n" + 
        "Inventário: " + inventario + "\n";

        return classeInformation;

    
    }

    //Método que irá retornar o poder do jogador

    private int somaDosValoresItens() {
        int somaTotal = 0;
        LinkedList<Item> colecao = inventario.getInventario();
        for (int i = 0; i < colecao.size(); i++) {
             somaTotal += colecao.get(i).getValor();
        }
        return somaTotal;
    }
    public int poderJogador() {
        int somaDosItens = somaDosValoresItens();
        int poderJogador = nivel + somaDosItens;
        return poderJogador;
    }

    public boolean venderItens(LinkedList<Item> itensParaVender) {
        return false; //Terminar a funcao
    }
}