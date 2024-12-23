package Models;
import java.util.LinkedList;

public class Item {
    //Define os atributos da classe Item
    final String nome;
    private int bonusPoder;
    private int valor;
    private String tipo;
    private boolean itemGrande;
    LinkedList<Classe> classesCompativeis;

    //Inicia os valores da classe
    public Item(String nome, int bonusPoder, int valor, String tipo, boolean itemGrande, LinkedList<Classe> classesCompativeis) {
        this.nome = nome;
        this.bonusPoder = bonusPoder;
        this.valor = valor;
        this.tipo = tipo;
        this.itemGrande = itemGrande;
        this.classesCompativeis = classesCompativeis;
    }

    //Métodos getters
    public String getNome() {
        return nome;
    }

    public int getBonusPoder() {
        return bonusPoder;
    }

    public int getValor() {
        return valor;
    }
    public String getTipo() {
        return tipo;
    }

    public boolean hasItemGrande() {
        return itemGrande;
    }

    public LinkedList<Classe> getClassesCompativeis() {
        return classesCompativeis;
    }

    //Métodos setters
    public void setBonusPoder(int bonusPoderItem) {
        bonusPoder = bonusPoderItem;
    }

    public void setValor(int valorItem) {
        valor = valorItem;
    }

    public void setTipo(String tipoItem) {
        tipo = tipoItem;
    }

    public void setItemGrande() {
        if(!hasItemGrande())
            this.itemGrande = true;
        System.out.println("Já possui 1 item grande");
    }

    public void setClassesCompativeis(LinkedList<Classe> classes) {
        this.classesCompativeis = classes;
    }


    // Método para visualizar a classe instanciada e seus atributos
    public String toString() {
        String classeInformation = "ITEM\n" + 
        "Nome: " + nome + "\n" + 
        "Bônus de Poder: " + bonusPoder + "\n" + 
        "Valor: " + valor + "\n" + 
        "Tipo: " + tipo + "\n" +
        "Possui item grande? " + itemGrande + "\n" +
        "Classes compativeis: " + classesCompativeis+ "\n";

        return classeInformation; 
    }
}
