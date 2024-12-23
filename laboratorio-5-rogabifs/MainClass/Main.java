package MainClass;

import Models.Classes.*;
import Singletons.Jogo;
import Views.JogadorView;
import Views.MasmorraView;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = Jogo.getInstanceJogo();
        String jogadoresXML = "/Users/ronaldgabriel/Documents/MC322/laboratorio-4/.idea/arquivosXML/jogadores.xml";
        String monstrosXML = "/Users/ronaldgabriel/Documents/MC322/laboratorio-4/.idea/arquivosXML/monstros.xml";
        String itensXML = "/Users/ronaldgabriel/Documents/MC322/laboratorio-4/.idea/arquivosXML/itens.xml";

        LerItens lerItens = new LerItens();
        LerJogadores lerJogadores = new LerJogadores();
        LerMonstros lerMonstros = new LerMonstros();

        lerItens.lerArquivo(jogo, itensXML);
        lerJogadores.lerArquivo(jogo, jogadoresXML);
        lerMonstros.lerArquivo(jogo, monstrosXML);

        JogadorView jogadorView = new JogadorView();

        jogo.loopDeJogo();

    }
}
