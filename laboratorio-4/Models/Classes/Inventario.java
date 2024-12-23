package Models.Classes;

import java.util.LinkedList;
import java.util.Objects;

public class Inventario {
     //Define os atributos da classe Inventario
    private int limiteInventario;
    private LinkedList<Item> items;


    //Métodos getters
    protected int getLimiteInventario() {
        return limiteInventario;
    }

    public LinkedList<Item> getItems() {
        return items;
    }

    //Métodos setters
    public void setLimiteInventario(int valueMax) {
        this.limiteInventario = valueMax;
    }

    public void setItems(LinkedList<Item> items) {
        this.items = items;
    }

    // Método para adicionar item ao inventario
    public boolean adicionarItem(Item item) {
        if(items.size() == limiteInventario) {return false;}
        else {
            items.add(item);
            return true;
        }
    }

    // Método para acessar um item do inventario
    public Item acessarItem(String nome) {
        for (Item item : items) {
            if (Objects.equals(item.nome, nome)) {
                return item;
            }
        }
        return null;
    }

    //Método para remover um item específico do inventário
    public void removerItem(String nome) {
        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).nome == nome)
            items.remove();
        }
    }

    //Método para remover uma lista de itens
    public void  removerItem(LinkedList<String> nomes) {
        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).nome == nomes.peek()) {
                items.remove();
            }
        }
    }

    //Método para imprimir cada item do inventário
    public void listarInventario() {
        if (getItems() != null) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Nenhum item encontrado");
        }
    }
}
