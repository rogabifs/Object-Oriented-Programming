package Controllers;

import Models.Classes.Inventario;
import Models.Classes.Item;
import Models.Classes.Jogador;
import Models.Enums.ClasseEnum;
import Models.Enums.RacaEnum;
import Views.JogadorView;

public class JogadorController {
    private Jogador jogadorModel;
    private JogadorView jogadorView;

    public JogadorController(Jogador jogadorModel, JogadorView jogadorView) {
        this.jogadorModel = jogadorModel;
        this.jogadorView = jogadorView;
    }

    public Jogador getJogadorModel() {
        return jogadorModel;
    }
    public String getNomeJogador() {
        return jogadorModel.getNome();
    }

    public Inventario getInventarioJogador() {
        return jogadorModel.getInventario();
    }

    public int getPoderJogador() {
        return jogadorModel.poderJogador();

    }

    public int getNivelJogadpr() {
        return jogadorModel.getNivel();
    }

    public RacaEnum getRacaJogadpr() {
        return jogadorModel.getRaca();
    }

    public ClasseEnum getClasseJogadpr() {
        return jogadorModel.getClasse();
    }

    public Item getItemCabecaJogadpr() {
        return jogadorModel.getItemCabeca();
    }

    public  Item getItemCorpoJogadpr() {
        return jogadorModel.getItemCorpo();
    }

    public Item getItemMaoDireitaJogador() {
        return jogadorModel.getItemMaoDireita();
    }

    public  Item getItemMaoEsquerdaJogador() {
        return jogadorModel.getItemMaoEsquerda();
    }

    public  Item getItemPeJogador() {
        return jogadorModel.getItemPe();
    }

    public void setNivelJogadpr(int nivel) {
        jogadorModel.setNivel(nivel);
    }

    public void setRaca(RacaEnum racaJogador) {
        jogadorModel.setRaca(racaJogador);
    }

    public void setClasse(ClasseEnum classeJogador) {
        jogadorModel.setClasse(classeJogador);
    }

    public void setInventario(Inventario inventarioJogador) {
        jogadorModel.setInventario(inventarioJogador);
    }

    public void setItemCabeca(Item itemCabecaJogador) {jogadorModel.setItemCabeca(itemCabecaJogador);}

    public void setItemCorpo(Item itemCorpoJogador) {jogadorModel.setItemCorpo(itemCorpoJogador);}

    public void setItemMaoDireita(Item itemMaoDireitaJogador) {jogadorModel.setItemMaoDireita(itemMaoDireitaJogador);}

    public void setItemMaoEsquerda(Item itemMaoEsquerdaJogador) {jogadorModel.setItemMaoEsquerda(itemMaoEsquerdaJogador);}

    public void setItemPe(Item itemPeJogador) {jogadorModel.setItemPe(itemPeJogador);}

    public void updateView() {
        jogadorView.printJogadorDetails(jogadorModel);
    }

}
