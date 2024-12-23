package Models.Classes;
import Models.Enums.ResultadoEnum;

public class CampoDeBatalha {
    static int generateRandomNumbers() {
        int min = 1;
        int max = 6;
        int randomNumber = (int)(Math.random() * (max - min + 1)) + min;

        return randomNumber;
    }
    static ResultadoEnum batalharContraMonstro(Monstro monstro, Jogador jogador) {
        if (jogador.poderJogador() > monstro.getPoder()) {
            jogador.getInventario().setLimiteInventario(monstro.getQuantidadeDeTesouros());
            return ResultadoEnum.VITORIA;
        } else if (jogador.poderJogador() < monstro.getPoder()) {
            int randomNumber = generateRandomNumbers();
            if (randomNumber == 5 || randomNumber == 6) {
                return ResultadoEnum.EMPATE;
            } else {
                jogador.setNivel(jogador.getNivel() - monstro.getNiveisPerdidos());
                return ResultadoEnum.DERROTA;
            }
        } else {
            return ResultadoEnum.EMPATE;
        }
    }
}
