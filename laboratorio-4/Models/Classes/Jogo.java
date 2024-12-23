package Models.Classes;

import Models.Enums.ClasseEnum;
import Models.Enums.TipoItemEnum;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private Masmorra masmorra;
    private LinkedList<Jogador> jogadores;
    private LinkedList<Monstro> monstros;
    private LinkedList<Item> items;

    // public Jogo(Masmorra masmorra, LinkedList<Jogador> jogadores) {
    //     this.masmorra = masmorra;
    //     this.jogadores = jogadores;
    // }

    public void setListaJogadores(LinkedList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void setListaMonstros(LinkedList<Monstro> monstros) {
        this.monstros = monstros;
    }

    public void setMasmorra(Masmorra masmorra) {
        this.masmorra = masmorra;
    }

    public void setListaItem(LinkedList<Item> items) {
        this.items = items;
    }

    public LinkedList<Jogador> getJogadores() {
        return jogadores;
    }

    public Masmorra getMasmorra() {
        return masmorra;
    }

    public LinkedList<Monstro> getMonstros() {
        return monstros;
    }

    public LinkedList<Item> getItens() {
        return items;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private void set5itensParaCadaJogador(LinkedList<Jogador> jogadores, BauDeTesouros bauDeTesouros, int quantidade) {
        LinkedList<Item> itensIniciados = new LinkedList<>();
        for (int j = 0; j < quantidade; j++) {
           itensIniciados.add(bauDeTesouros.getItems().get(j));  
        }
        for (int i = 0; i < jogadores.size(); i++) {
            jogadores.get(i).getInventario().setItems(itensIniciados);
        }
    }

    public void loopDeJogo() {
        LinkedList<Monstro> monstros = getMonstros();
        LinkedList<Jogador> jogadores = getJogadores();
        LinkedList<Item> items = getItens();
        
        
        BauDeTesouros bauDeTesouros = new BauDeTesouros(10, items);
        bauDeTesouros.setItems(items);
        

        Masmorra masmorra = new Masmorra(monstros, bauDeTesouros);
        setMasmorra(masmorra);
        masmorra.setTesouros(bauDeTesouros);
        

        set5itensParaCadaJogador(jogadores, bauDeTesouros, 5);

        boolean continuarJogo = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (continuarJogo) {
            System.out.println("Escolha o jogador:");
                for (int i = 0; i < jogadores.size(); i++) {
                    System.out.println((i + 1) + ". " + jogadores.get(i).getNome());
                }
            int escolhaJogador = scanner.nextInt();
            int indiceJogador = escolhaJogador;

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
                    if (indiceJogador >= 1 && indiceJogador <= jogadores.size()) {
                        Jogador jogadorSelecionado = jogadores.get(indiceJogador - 1);
                        System.out.println("----------INVENTARIO DE " + jogadorSelecionado.getNome() + "-------------");
                        jogadorSelecionado.getInventario().listarInventario();
                    } 
                    break;
                case 2:
                    if(indiceJogador >= 1 && indiceJogador <= jogadores.size()) {
                        Jogador jogadorSelecionado = jogadores.get(indiceJogador - 1);
                        jogadorSelecionado.getInventario().listarInventario();
                        if (jogadorSelecionado.getInventario().getItems() != null) {
                            System.out.println("Escolha um item para equipar:");
                            String nome = scanner.next();
                            if (jogadorSelecionado.getInventario().acessarItem(nome) == null)
                                System.out.println("Não existe o item");
                            else {
                                if (jogadorSelecionado.getInventario().acessarItem(nome).getTipo() == TipoItemEnum.CABECA) {
                                    jogadorSelecionado.setItemCabeca(jogadorSelecionado.getInventario().acessarItem(nome));
                                    System.out.println("Item equipado!");
                                } else if (jogadorSelecionado.getInventario().acessarItem(nome).getTipo() == TipoItemEnum.CORPO) {
                                    jogadorSelecionado.setItemCorpo(jogadorSelecionado.getInventario().acessarItem(nome));
                                    System.out.println("Item equipado!");

                                } else if (jogadorSelecionado.getInventario().acessarItem(nome).getTipo() == TipoItemEnum.PE) {
                                    jogadorSelecionado.setItemPe(jogadorSelecionado.getInventario().acessarItem(nome));
                                    System.out.println("Item equipado!");

                                } else if (jogadorSelecionado.getInventario().acessarItem(nome).getTipo() == TipoItemEnum.MAO)
                                    if (jogadorSelecionado.getItemMaoDireita() == null && jogadorSelecionado.getItemMaoDireita() == null) {
                                        jogadorSelecionado.setItemMaoDireita(jogadorSelecionado.getInventario().acessarItem(nome));
                                        System.out.println("Item equipado!");

                                    } else if (jogadorSelecionado.getItemMaoEsquerda() == null) {
                                        jogadorSelecionado.setItemMaoEsquerda(jogadorSelecionado.getInventario().acessarItem(nome));
                                        System.out.println("Item equipado!");

                                    } else if (jogadorSelecionado.getItemMaoDireita() == null) {
                                        jogadorSelecionado.setItemMaoDireita(jogadorSelecionado.getInventario().acessarItem(nome));
                                        System.out.println("Item equipado!");

                                    } else
                                        System.out.println("Não há mãos vazias");
                            }
                        } else {
                            System.out.println("Não há nada para equipar.");
                        }
                    }
                    break;
                case 3:
                    Jogador jogador = jogadores.get(indiceJogador - 1);
                    jogador.venderItens(jogador.getInventario().getItems());
                    System.out.println("Itens vendidos!");
                    break;
                case 4:
                    if(indiceJogador >= 1 && indiceJogador <= jogadores.size()) {
                        Jogador jogadorSelecionado = jogadores.get(indiceJogador - 1);
                        System.out.println("Poder Total: " + jogadorSelecionado.poderJogador());
                        System.out.println("Nível: " + jogadorSelecionado.getNivel());
                        System.out.println("Itens Equipados:");
                        System.out.println("Item mao direita: " + jogadorSelecionado.getItemMaoDireita());
                        System.out.println("Item mao esquerda: " + jogadorSelecionado.getItemMaoEsquerda());
                        System.out.println("Item cabeca: " + jogadorSelecionado.getItemCabeca());
                        System.out.println("Item corpo: " + jogadorSelecionado.getItemCorpo());
                        System.out.println("Item pe: " + jogadorSelecionado.getItemPe());
                    }
                    break;
                case 5:
                    if(indiceJogador >= 1 && indiceJogador <= jogadores.size()) {
                        System.out.println("Seu destino será escolhido aleatoriamente...");
                        Jogador jogadorSelecionado = jogadores.get(indiceJogador - 1);
                        int aleatorio = random.nextInt(10);
                        if (aleatorio % 2 == 0) {
                            System.out.println("A porta da itens será aberta!");
                            masmorra.abrirPortaItem(jogadorSelecionado);
                            System.out.println("Porta Item aberta!");
                            System.out.println("Voce pode scolher 2 itens aleatórios do baú");
                            System.out.println("1. Escolher");
                            System.out.println("2. Voltar");
                            int escolha2 = scanner.nextInt();
                            switch (escolha2) {
                                case 1:
                                    if (jogadorSelecionado.getInventario().getItems() != null)
                                        jogadorSelecionado.getInventario().getItems().add(masmorra.getTesouros().pegarItensAleatorios(2).element());
                                    else
                                        jogadorSelecionado.getInventario().setItems(masmorra.getTesouros().pegarItensAleatorios(2));
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
                            System.out.println("Monstros foram soltos. Boa sorte!");
                            masmorra.abrirPortaMonstro(jogadorSelecionado);
                        System.out.println("Valor IMPAR");
                        }
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
