package MainClass;

import Models.Item;
import Models.Jogador;
import Models.Monstro;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Messi", 10, "Argentino", "Atacante", "CapaceteGênio", "Camisa 10", "Luva Direita", "Luva Esquerda", "ChuteiraDecisiva");
        Monstro monstro = new Monstro("CR7", 7, 5, 0);
        Item item = new Item("Bola de ouro", 1000, 60, "Ouro");

        Jogador jogador2 = new Jogador(null, 0, null, null, null, null, null, null, null);
        jogador2.setNome("Neymar");
        jogador2.setNivel(10);
        jogador2.setRaca("Brasil");
        jogador2.setClasse("Atacante");
        jogador2.setItemCabeString("Moicano");
        jogador2.setItemCorpo("Camisa 11");
        jogador2.setItemMaoDireita("Munhequeira");
        jogador2.setItemPe("Chuteira Nike");

        String informacoesDoJogador = jogador.toString();
        String informacoesDoJogador2 = jogador2.toString();
        String informacoesDoMonstro = monstro.toString();
        String informacoesDoItem = item.toString();
        System.out.println(informacoesDoJogador);
        System.out.println(informacoesDoJogador2);
        System.out.println(informacoesDoMonstro);
        System.out.println(informacoesDoItem);
    }
}
