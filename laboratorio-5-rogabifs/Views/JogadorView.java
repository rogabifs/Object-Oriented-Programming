package Views;

import Controllers.JogadorController;
import Models.Classes.Jogador;

public class JogadorView {

        private JogadorController jogadorController;
        public JogadorView() {
                this.jogadorController = jogadorController;
        }
        public void listarInventario() {
           jogadorController.getJogadorModel().getInventario().listarInventario();
        }


        public void printJogadorDetails(Jogador jogador) {
                System.out.println(jogador.toString());
        }
}
