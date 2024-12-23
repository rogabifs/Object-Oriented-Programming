package Models;

import java.util.LinkedList;


public class Jogador {

    // Define os atributos da classe Jogador
    final String nome;
    private int nivel;
    private Raca raca;
    private Classe classe; 
    private Inventario inventario; 
   

    // Inicializa os valores da classe
    public Jogador(String nome, int nivel, Raca raca, Classe classe, Inventario inventario) {
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

    public Raca getRaca() {
        return raca;
    }

    public Classe getClasse() {
        return classe;
    }

   public Inventario getInventario() {
        return inventario;
   }

    // Métodos setters
    public void setNivel(int nivelJogador) {
        nivel = nivelJogador;
    }

    public void setRaca(Raca racaJogador) {
        raca = racaJogador;
    }

    public void setClasse(Classe classeJogador) {
       classe = classeJogador;
    }

    public void setInventario(Inventario inventarioJogador) {
        inventario = inventarioJogador;
    }


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
}