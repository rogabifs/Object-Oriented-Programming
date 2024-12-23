package MainClass;

import java.util.LinkedList;
import Models.Classe;
import Models.Inventario;
import Models.Item;
import Models.Jogador;
import Models.Raca;
import Models.Monstro;

public class Main {
    public static void main(String[] args) { 
        Item itemMaoDireita = new Item("Luva direita", 50, 100, "Item para mao", false,null ); //Seta o item com seus atributos. Observe que o uma vez que o atributo "nome" é setado, ele não pode mais ser alterado.
        Raca argentino = new Raca("Argentino", 2); //Seta uma raça com seus atributos
        Classe barcelonista = new Classe("Muito torcedor do barcelona", itemMaoDireita, null, null); // Seta um valor do tipo Classe
        LinkedList<Item> colecaoDeItens = new LinkedList<Item>(); // Seta a lista ligada à qual irá armazenar os itens
        Inventario inventarioMessi = new Inventario(3, colecaoDeItens); //Seta o inventário com a colecao de itens
        Jogador messi= new Jogador("Messi", 10, argentino, barcelonista, inventarioMessi); // Cria o Jogador "Messi" com seus atributos, incluindo Raca, Classe e inventário 
        LinkedList<Classe> classesCompativeis = new LinkedList<Classe>(); // Seta uma lista ligada para armazenar as classes compatíveis
        classesCompativeis.add(barcelonista); // Atriubui a classe barcelonista à uma lista de classes compativeis
        Item itemMaoEsquerda = new Item("Luva esquerda", 5, 5, "Item para mao", false, null); // Seta um item para um jogador
        itemMaoEsquerda.setClassesCompativeis(classesCompativeis); // Adiciona uma classe compativel ao itemMaoEsquerda 
        inventarioMessi.adicionarItem(itemMaoEsquerda); // Adiciona o item ao jogador "Messi"

        Monstro cr7 = new Monstro("CR7", 0, 0, 0); // Setando o monstro CR7 com seus atributos
        cr7.setPoder(7); // Atribuindo o poder 7 ao monstro CR7

        System.out.println(messi.toString()); // Imprimi as insformaçoes do jogador "Messi"
    }
}
