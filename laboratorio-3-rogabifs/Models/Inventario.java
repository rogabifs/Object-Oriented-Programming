package Models;

import java.util.LinkedList;
import java.util.Objects;

public class Inventario {
     //Define os atributos da classe Inventario
    private int limiteInventario;
    private LinkedList<Item> inventario;

    public Inventario(int limiteInventario, LinkedList<Item> inventario) {
        this.limiteInventario = limiteInventario;
        this.inventario = inventario;
    }

    //Métodos getters
    protected int getLimiteInventario() {
        return limiteInventario;
    }

    public LinkedList<Item> getInventario() {
        return inventario;
    }

    //Métodos setters
    public void setLimiteInventario(int valueMax) {
        limiteInventario = valueMax;
    }

    public void setInventario(LinkedList<Item> inventario) {
        this.inventario = inventario;
    }

    public boolean adicionarItem(Item item) {
        if(inventario.size() == limiteInventario) {return false;}
        else {
            inventario.add(item);
            return true;
        }
    }

    // Método para acessar um item do inventario
    public Item acessarItem(String nome) {
        for (Item item : inventario) {
            if (Objects.equals(item.nome, nome)) {
                return item;
            }
        }
        return null;
    }

    //Método para remover um item específico do inventário
    public void removerItem(String nome) {
        for(int i = 0; i < inventario.size(); i++) {
            if(inventario.get(i).nome == nome)
            inventario.remove();
        }
    }

    //Método para remover uma lista de itens
    public void  removerItem(LinkedList<String> nomes) {
        for(int i = 0; i < inventario.size(); i++) {
            if(inventario.get(i).nome == nomes.peek()) {
                inventario.remove();
            }
        }
    }

    //Método para imprimir cada item do inventário
    public void listarInventario() {
        for (Item item : inventario) {
            System.out.println(item);
        }
    }
}
