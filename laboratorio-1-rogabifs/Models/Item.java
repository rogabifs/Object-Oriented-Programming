package Models;

public class Item {
    //Define os atributos da classe Item
    private String nome;
    private int bonusPoder;
    private int valor;
    private String tipo;

    //Inicia os valores da classe
    public Item(String nome, int bonusPoder, int valor, String tipo) {
        this.nome = nome;
        this.bonusPoder = bonusPoder;
        this.valor = valor;
        this.tipo = tipo;
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

    //Métodos setters
    public void setNome(String nomeItem) {
        nome = nomeItem;
    }

    public void setBonusPoder(int bonusPoderItem) {
        bonusPoder = bonusPoderItem;
    }

    public void setValor(int valorItem) {
        valor = valorItem;
    }

    public void setTipo(String tipoItem) {
        tipo = tipoItem;
    }

    // Método para visualizar a classe instanciada e seus atributos
    public String toString() {
        String classeInformation = "ITEM\n" + 
        "Nome: " + nome + "\n" + 
        "Bônus de Poder: " + bonusPoder + "\n" + 
        "Valor: " + valor + "\n" + 
        "Tipo: " + tipo + "\n";
        return classeInformation; 
    }
}
