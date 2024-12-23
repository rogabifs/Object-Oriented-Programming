package Models.Classes;

import Models.Enums.ClasseEnum;
import Models.Enums.RacaEnum;
import Models.Enums.TipoItemEnum;
import Models.Interfaces.I_Arquivo;
import Singletons.Jogo;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.LinkedList;

public class LerItens implements I_Arquivo {
    @Override
    public void lerArquivo(Jogo jogo, String path) {
        LinkedList<Item> Items = new LinkedList<Item>();

        try {
            File file = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("Item");
            for (int i = 0; i < nList.getLength(); i++) {
                Element itemElement = (Element) nList.item(i);

                String nome = itemElement.getElementsByTagName("nome").item(0).getTextContent();
                int bonusPoder = Integer.parseInt(itemElement.getElementsByTagName("bonusPoder").item(0).getTextContent());
                int valor = Integer.parseInt(itemElement.getElementsByTagName("valor").item(0).getTextContent());
                TipoItemEnum tipo = TipoItemEnum.valueOf(itemElement.getElementsByTagName("tipo").item(0).getTextContent());
                boolean itemGrande = Boolean.parseBoolean(itemElement.getElementsByTagName("itemGrande").item(0).getTextContent());

                //------------Resolver a partir daq.----------------
                NodeList classesCompativeisNodeList = itemElement.getElementsByTagName("classesCompativeis").item(0).getChildNodes();
                LinkedList<ClasseEnum> classesCompativeis = new LinkedList<ClasseEnum>();
                for (int j = 0; j < classesCompativeisNodeList.getLength(); j++) {
                    if (classesCompativeisNodeList.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        String classValue = ((Element) classesCompativeisNodeList.item(j)).getTextContent().trim();
                        classesCompativeis.add(ClasseEnum.valueOf(classValue));
                    }
                }

                NodeList racasCompativeisNodeList = itemElement.getElementsByTagName("racasCompativeis").item(0).getChildNodes();
                LinkedList<RacaEnum> racasCompativeis = new LinkedList<>();
                for (int j = 0; j < racasCompativeisNodeList.getLength(); j++) {
                    if (racasCompativeisNodeList.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        String racaValue = ((Element) racasCompativeisNodeList.item(j)).getTextContent().trim();
                        racasCompativeis.add(RacaEnum.valueOf(racaValue));
                    }
                }

                Item item = new Item(nome, bonusPoder, valor, tipo,itemGrande,classesCompativeis, racasCompativeis);
                Items.add(item);
            }
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
        jogo.setListaItem(Items);
    }
}
