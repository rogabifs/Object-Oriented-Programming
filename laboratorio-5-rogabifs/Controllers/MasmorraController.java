package Controllers;

import Models.Classes.CampoDeBatalha;
import Models.Classes.Jogador;
import Models.Classes.Masmorra;
import Models.Classes.Monstro;
import Singletons.BauDeTesouros;
import Views.MasmorraView;

import java.util.LinkedList;

public class MasmorraController {
    private Masmorra masmorraModel;
    private MasmorraView masmorraView;

    public MasmorraController(Masmorra masmorraModel, MasmorraView masmorraView) {
        this.masmorraModel = masmorraModel;
        this.masmorraView = masmorraView;
    }


    public Masmorra getMasmorraModel() {
        return masmorraModel;
    }

    public void setMonstros(LinkedList<Monstro> monstros) {
        masmorraModel.setMonstros(monstros);
    }

    public void setTesouros(BauDeTesouros tesouros) {
        masmorraModel.setTesouros(tesouros);
    }

    //Métodos Getters

    public BauDeTesouros getTesouros() {
        return masmorraModel.getTesouros();
    }

    public LinkedList<Monstro> getMonstros() {
        return masmorraModel.getMonstros();
    }


    public void viewUpdate() {
        masmorraView.printMasmorraDetails(masmorraModel);
    }
}
