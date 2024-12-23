package Models;

import java.util.LinkedList;

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
        Item itemResult = null;
        for(int i = 0; i < inventario.size(); i++) {
            if(inventario.get(i).nome == nome) {
                itemResult = inventario.get(i);
            } else {
                return null;
            }
        }
        return itemResult;
    }

    //Método para remover um item específico do inventário
    public void removerItem(String nome) {
        for(int i = 0; i < inventario.size(); i++) {
            if(inventario.get(i).nome == nome)
            inventario.remove();
        }
    }

    //Método para imprimir cada item do inventário
    public void listarInventario() {
        for(int i = 0; i < inventario.size(); i++) {
            inventario.get(i).toString();
        }
    }
}
