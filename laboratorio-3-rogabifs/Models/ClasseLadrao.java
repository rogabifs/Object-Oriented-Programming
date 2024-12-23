package Models;

public class ClasseLadrao extends Classe {
    public ClasseLadrao(String descricao, Item itemMaoDireita, Item itemMaoEsquerda, Item itemPe) {
        super(descricao, itemMaoDireita, itemMaoEsquerda, itemPe);
    }
    private Item itemCorpo;

    //Métodos getters
    public String getDecricao = ClasseLadrao.super.getDescricao();
    public Item getItemMãoDireita = ClasseLadrao.super.getItemMaoDireita();
    public Item getItemMaoEsquerda = ClasseLadrao.super.getItemMaoEsquerda();
    public Item getItemPe = ClasseLadrao.super.getItemPe();
    public Item getItemCorpo() {
        return itemCorpo;
    }

    //Métodos setters
    public void setItemMaoDireita(Item maoDireita) {
        ClasseLadrao.this.setItemMaoDireita(maoDireita);
    }

    public void setItemMaoEsquerda(Item maoEsquerda) {
        ClasseLadrao.this.setItemMaoEsquerda(maoEsquerda);
    }

    public void setItemPe(Item pe) {
        ClasseLadrao.this.setItemPe(pe);
    }

    public void setItemCorpo(Item cabecaItem) {
        this.itemCorpo = cabecaItem;
    }

    public String toString() {
        String classeInformation = "CLASSE\n" + 
        "Descrição: " + descricao + "\n" + 
        "Item na mão direita: " + getItemMãoDireita + "\n" + 
        "Item na mão esquerda: " + getItemMaoEsquerda + "\n" + 
        "Item no pé: " + getItemPe + "\n" +
        "Item no corpo: " + itemCorpo + "\n";
        
        return classeInformation; 
    }
}
