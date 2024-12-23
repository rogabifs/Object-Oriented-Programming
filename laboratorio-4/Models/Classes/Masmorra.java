package Models.Classes;

import java.util.LinkedList;

public  class Masmorra {
    private LinkedList<Monstro> monstros;
    private BauDeTesouros tesouros;

    public Masmorra(LinkedList<Monstro> monstros, BauDeTesouros tesouros) {
        this.monstros = monstros;
        this.tesouros = tesouros;
    }

    //Métodos Setters
    public void setMonstros(LinkedList<Monstro> monstros) {
        this.monstros = monstros;
    }

    public void setTesouros(BauDeTesouros tesouros) {
        this.tesouros = tesouros;
    }

    //Métodos Getters

    public BauDeTesouros getTesouros() {
        return tesouros;
    }

    public LinkedList<Monstro> getMonstros() {
        return monstros;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // Método abrirPortaMonstro
    public void abrirPortaMonstro(Jogador jogador) {
        for (Monstro monstro : monstros) {
            CampoDeBatalha.batalharContraMonstro(monstro, jogador);
        }
    }

    //Método abrirPortaItem
    public void abrirPortaItem(Jogador jogador) {
        tesouros.listarItensAleatorios();
        for(int i = 0; i < tesouros.getItems().size(); i++) {
            for(int j = 0; j < tesouros.getItensListados().size(); j++) {
                if(tesouros.getItems().get(i).equals(tesouros.getItensListados().get(j))) {
                    tesouros.acessarItemBau(tesouros.getItems().get(i).nome);
                }
            }
        }
    }
}