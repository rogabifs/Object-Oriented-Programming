package MainClass;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import Models.Classes.*;
import Models.Enums.ClasseEnum;
import Models.Enums.RacaEnum;
import Models.Enums.TipoItemEnum;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        String jogadoresXML = "/Users/ronaldgabriel/Documents/MC322/laboratorio-4/.idea/arquivosXML/jogadores.xml";
        String monstrosXML = "/Users/ronaldgabriel/Documents/MC322/laboratorio-4/.idea/arquivosXML/monstros.xml";
        String itensXML = "/Users/ronaldgabriel/Documents/MC322/laboratorio-4/.idea/arquivosXML/itens.xml";

        LerItens lerItens = new LerItens();
        LerJogadores lerJogadores = new LerJogadores();
        LerMonstros lerMonstros = new LerMonstros();

        lerItens.lerArquivo(jogo, itensXML);
        lerJogadores.lerArquivo(jogo, jogadoresXML);
        lerMonstros.lerArquivo(jogo, monstrosXML);

        jogo.loopDeJogo();

    }
}
