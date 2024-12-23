package Models;
import java.util.LinkedList;

public class Item {
    //Define os atributos da classe Item
    final String nome;
    private int bonusPoder;
    private int valor;
    private TipoItemEnum tipo; // Arrumar com o tipo TipoItem
    private boolean itemGrande;
    LinkedList<ClasseEnum> classesCompativeis;
    LinkedList<RacaEnum> racasCompativeis;

    //Inicia os valores da classe
    public Item(String nome, int bonusPoder, int valor, TipoItemEnum tipo, boolean itemGrande, LinkedList<ClasseEnum> classesCompativeis) {
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

    public TipoItemEnum getTipo() {
        return tipo;
    }

    public boolean hasItemGrande() {
        return itemGrande;
    }

    public LinkedList<ClasseEnum> getClassesCompativeis() {
        return classesCompativeis;
    }

    public LinkedList<RacaEnum> getRacasCompativeis() { return  racasCompativeis; }

    //Métodos setters
    public void setBonusPoder(int bonusPoderItem) {
        bonusPoder = bonusPoderItem;
    }

    public void setValor(int valorItem) {
        valor = valorItem;
    }

    public void setTipo(TipoItemEnum tipoItem) {
        tipo = tipoItem;
    }

    public void setItemGrande() {
        if(!hasItemGrande())
            this.itemGrande = true;
        System.out.println("Já possui 1 item grande");
    }

    public void setClassesCompativeis(LinkedList<ClasseEnum> classes) {
        this.classesCompativeis = classes;
    }

    public void setRacasCompativeis(LinkedList<RacaEnum> racasCompativeis) {
        this.racasCompativeis = racasCompativeis;
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
