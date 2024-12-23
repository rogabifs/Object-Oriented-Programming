package Models.Classes;

import Models.Enums.ClasseEnum;
import Models.Enums.RacaEnum;
import Models.Interfaces.I_Arquivo;
import Singletons.Jogo;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.LinkedList;

public class LerJogadores implements I_Arquivo {
    @Override
    public void lerArquivo(Jogo jogo, String path) {
        LinkedList<Jogador> jogadores = new LinkedList<Jogador>();

        try {
            File file = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("Jogador");

            for (int i = 0; i < nList.getLength(); i++) {
                Element jogadorElement = (Element) nList.item(i);

                String nome = jogadorElement.getElementsByTagName("nome").item(0).getTextContent();
                int nivel = Integer.parseInt(jogadorElement.getElementsByTagName("nivel").item(0).getTextContent());
                RacaEnum raca = RacaEnum.valueOf(jogadorElement.getElementsByTagName("raca").item(0).getTextContent());
                ClasseEnum classe = ClasseEnum.valueOf(jogadorElement.getElementsByTagName("classe").item(0).getTextContent());

                Jogador jogador = new Jogador(nome, nivel, raca, classe,new Inventario());
                jogadores.add(jogador);
            }
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
        jogo.setListaJogadores(jogadores);
    }
}


