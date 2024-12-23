package MainClass;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import Models.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Monstro monstro1 = new Monstro("Monstro1", 5, 2, 3);
        Monstro monstro2 = new Monstro("Monstro2", 7, 3, 2);
        LinkedList<Monstro>  monstros = new LinkedList<Monstro>();
        monstros.add(monstro1);
        monstros.add(monstro2);

        LinkedList<ClasseEnum> classeItem1 = new LinkedList<ClasseEnum>();
        LinkedList<ClasseEnum> classeItem2 =  new LinkedList<ClasseEnum>();
        Item item1 = new Item("Item1", 3, 1, TipoItemEnum.PE,false,classeItem1);
        Item item2 = new Item("Item2", 3, 1, TipoItemEnum.PE,false,classeItem1);
        LinkedList<Item> items = new LinkedList<Item>();
        items.add(item1);
        items.add(item2);
        BauDeTesouros bauDeTesouros = new BauDeTesouros(4, items);

        Masmorra masmorra = new Masmorra(monstros, bauDeTesouros);

        Item item3 = new Item("Item3", 3, 1, TipoItemEnum.PE,false,classeItem2);
        Item item4 = new Item("Item4", 3, 1, TipoItemEnum.PE,false,classeItem2);
        LinkedList<Item> inventarioJogador = new LinkedList<Item>();
        inventarioJogador.add(item3);
        inventarioJogador.add(item4);
        Inventario inventario = new Inventario(10,inventarioJogador);

        Jogador jogador = new Jogador("Jogador1", 10, RacaEnum.HUMANO,ClasseEnum.MAGO,inventario);


        boolean continuarJogo = true;
        while (continuarJogo) {
            System.out.println("Ações possíveis do jogador:");
            System.out.println("1. Listar os itens do inventário");
            System.out.println("2. Equipar itens do inventário");
            System.out.println("3. Vender itens do inventário para subir um nível");
            System.out.println("4. Ver poder total, nível e itens equipados");
            System.out.println("5. Passar para abrir a porta");
            System.out.print("Escolha uma ação: ");

            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    jogador.getInventario().listarInventario();
                    break;
                case 2:
                    jogador.getInventario().listarInventario();
                    System.out.println("Escolha um item para equipar:");
                    String nome = scanner.next();
                    if (jogador.getInventario().acessarItem(nome) == null)
                        System.out.println("Não existe o item");
                    else {
                        if (jogador.getInventario().acessarItem(nome).getTipo() == TipoItemEnum.CABECA) {
                            jogador.setItemCabeca(jogador.getInventario().acessarItem(nome));
                            System.out.println("Item equipado!");
                        } else if (jogador.getInventario().acessarItem(nome).getTipo() == TipoItemEnum.CORPO) {
                            jogador.setItemCorpo(jogador.getInventario().acessarItem(nome));
                            System.out.println("Item equipado!");

                        } else if (jogador.getInventario().acessarItem(nome).getTipo() == TipoItemEnum.PE) {
                            jogador.setItemPe(jogador.getInventario().acessarItem(nome));
                            System.out.println("Item equipado!");

                        } else if (jogador.getInventario().acessarItem(nome).getTipo() == TipoItemEnum.MAO)
                            if (jogador.getItemMaoDireita() == null && jogador.getItemMaoDireita() == null) {
                                jogador.setItemMaoDireita(jogador.getInventario().acessarItem(nome));
                                System.out.println("Item equipado!");

                            } else if (jogador.getItemMaoEsquerda() == null) {
                                jogador.setItemMaoEsquerda(jogador.getInventario().acessarItem(nome));
                                System.out.println("Item equipado!");

                            } else if (jogador.getItemMaoDireita() == null) {
                                jogador.setItemMaoDireita(jogador.getInventario().acessarItem(nome));
                                System.out.println("Item equipado!");

                            } else
                                System.out.println("Não há mãos vazias");
                    }
                    break;
                case 3:

                    System.out.println("Escolha um item para vender:");
                    int indiceItemVender = scanner.nextInt();
//                    jogador.venderItens(jogador.getInventario().acessarItem("nome"));
                    break;
                case 4:
                    System.out.println("Poder Total: " + jogador.poderJogador());
                    System.out.println("Nível: " + jogador.getNivel());
                    System.out.println("Itens Equipados:");
                    System.out.println("Item mao direita: " + jogador.getItemMaoDireita());
                    System.out.println("Item mao esquerda: " + jogador.getItemMaoEsquerda());
                    System.out.println("Item cabeca: " + jogador.getItemCabeca());
                    System.out.println("Item corpo: " + jogador.getItemCorpo());
                    System.out.println("Item pe: " + jogador.getItemPe());
                    break;
                case 5:
                    int aleatorio = random.nextInt(2);
                    if (aleatorio == 1) {
                        masmorra.abrirPortaItem(jogador);
                        System.out.println("Porta Item aberta!");
                        System.out.println("Voce pode scolher 2 itens aleatórios do baú");
                        System.out.println("1. Escolher");
                        System.out.println("2. Voltar");
                        int escolha2 = scanner.nextInt();
                        switch (escolha2) {
                            case 1:
                                masmorra.getTesouros().pegarItensAleatorios(2);
                                System.out.println("Itens aleatorios adquiridos!");
                                break;
                            case 2:
                                //
                                break;
                            default:
                                System.out.println("Escolha invalida.");
                                break;
                        }
                    } else {
                        masmorra.abrirPortaMonstro(jogador);
                    }
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
            System.out.print("Deseja continuar o jogo? (s/n): ");
            String continuar = scanner.next();
            continuarJogo = continuar.equalsIgnoreCase("s");
        }

        scanner.close();
    }
}
