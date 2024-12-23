package Models.Classes;

import java.util.LinkedList;
import java.util.Random;

public class BauDeTesouros extends Inventario {
    public BauDeTesouros(int limiteInventario, LinkedList<Item> items) {
        super();
    }
    private LinkedList<Item> itensListados = new LinkedList<Item>();


    public LinkedList<Item> getItensListados() {
        return itensListados;
    }

    private int generateRandomNumbers() {
        LinkedList<Item> itens = getItems();
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
        LinkedList<Item> itens = getItems();
        LinkedList<Item> newItens = new LinkedList<>();
        int[] aux = new int[quantidade];
        int count = 0;

        while (count < quantidade && itens.size() > 0) {
            int randomIndex = generateRandomNumbers();
            Item item = itens.get(randomIndex);
            if (!newItens.contains(item)) {
                newItens.add(item);
                itens.remove(randomIndex);
                aux[count] = randomIndex;
                count++;
            }
        }

        return newItens;
    }


    public Item acessarItemBau(String nome) {
        Item item = acessarItem(nome);
        removerItem(nome);

        return item;
    }

    private int GenerateRandomNumbers() {
        LinkedList<Item> itens = getItems();
        int min = 1;
        int max = itens.size() - 1;
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;
    }

    public void listarItensAleatorios() {
        int count = 0;
        LinkedList<Item> itens = getItems();
        int aux = -1;  // Inicializa com um valor impossível

        while (count < 2 && !itens.isEmpty()) {
            int randomIndex = GenerateRandomNumbers();
            if (randomIndex != aux) {
                Item item = itens.get(randomIndex-1);
                if (!itensListados.contains(item)) {
                    itensListados.add(item);
                    System.out.println(item); // Imprime a representação do item
                    count++;
                    aux = randomIndex; // Atualiza o índice para evitar repetição
                }
            }
        }
    }
}
