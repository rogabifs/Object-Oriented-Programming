package Models;

import java.util.LinkedList;

public class BauDeTesouros extends Inventario {
    public BauDeTesouros(int limiteInventario, LinkedList<Item> itens) {
        super(limiteInventario, itens);
    }
    private LinkedList<Item> itensListados = new LinkedList<Item>();

    

    public LinkedList<Item> getItensListados() {
        return itensListados;
    }

    private int generateRandomNumbers() {
        LinkedList<Item> itens = getInventario();
        int min = 0;
        int max = itens.size() - 1;
        int randomNumber = (int)(Math.random() * (max - min + 1)) + min;

        return randomNumber;
    }

    //Método para analisar se a array tem elementos repetidos ou não
    private boolean isRepeatingElement(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public LinkedList<Item> pegarItensAleatorios(int quantidade) {
        LinkedList<Item> itens = getInventario();
        LinkedList<Item> newItens = new LinkedList<Item>();
        int randomIndex = generateRandomNumbers();
        int count = 0;
        int[] aux = new int[quantidade];
        for(int i = randomIndex; i < itens.size(); i = generateRandomNumbers()) {
            if(count < quantidade && !isRepeatingElement(aux)) {
                Item item = itens.get(i);
                newItens.add(item);
                itens.remove(i);
                aux[count] = i;
                count++;
            } else if (count == quantidade) {
                break;
            } else if (isRepeatingElement(aux)) {
                continue;
            }
        }

        return newItens;
    }

    public Item acessarItemBau(String nome) {
        Item item = acessarItem(nome);
        removerItem(nome);

        return item;
    }

    public void listarItens() {
        int count = 0;
        int aux = 100;
        int randomIndex = generateRandomNumbers();
        LinkedList<Item> itens = getInventario();
        for(int i = randomIndex; i < itens.size(); i = generateRandomNumbers()) {
            if(count < 2 && i != aux) {
                Item item = itens.get(i);
                itensListados.add(itens.get(i));
                item.toString();
                count++;
                aux = i;
            } else if (count == 2) {
                break;
            } else if (i == aux) {
                continue;
            }
        }
    }
}
