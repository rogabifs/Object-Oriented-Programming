package Models.Classes;

import Models.Interfaces.I_Arquivo;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.LinkedList;

public class LerMonstros implements I_Arquivo {
    @Override
    public void lerArquivo(Jogo jogo, String path) {
        LinkedList<Monstro> monstros = new LinkedList<Monstro>();

        try {
            File file = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("Monstro");
            for (int i = 0; i < nList.getLength(); i++) {
                Element monstroElement = (Element) nList.item(i);

                String nome = monstroElement.getElementsByTagName("nome").item(0).getTextContent();
                int poder = Integer.parseInt(monstroElement.getElementsByTagName("poder").item(0).getTextContent());
                int tesouros = Integer.parseInt(monstroElement.getElementsByTagName("tesouros").item(0).getTextContent());
                int niveisPerdidos = Integer.parseInt(monstroElement.getElementsByTagName("niveisPerdidos").item(0).getTextContent());


                Monstro monstro = new Monstro(nome,poder,tesouros,niveisPerdidos);
                monstros.add(monstro);
            }
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
        jogo.setListaMonstros(monstros);
    }
}
