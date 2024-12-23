package Models;

public class ClasseMago extends Classe {
    public ClasseMago(String descricao, Item itemMaoDireita, Item itemMaoEsquerda, Item itemPe) {
        super(descricao, itemMaoDireita, itemMaoEsquerda, itemPe);
    }
    private Item itemCabeca;

    //Métodos getters
    public String getDecricao = ClasseMago.super.getDescricao();
    public Item getItemMãoDireita = ClasseMago.super.getItemMaoDireita();
    public Item getItemMaoEsquerda = ClasseMago.super.getItemMaoEsquerda();
    public Item getItemPe = ClasseMago.super.getItemPe();
    public Item getItemCabeca() {
        return itemCabeca;
    }

    //Métodos setters
    public void setItemMaoDireita(Item maoDireita) {
        ClasseMago.this.setItemMaoDireita(maoDireita);
    }

    public void setItemMaoEsquerda(Item maoEsquerda) {
        ClasseMago.this.setItemMaoEsquerda(maoEsquerda);
    }

    public void setItemPe(Item pe) {
        ClasseMago.this.setItemPe(pe);
    }

    public void setItemCabeca(Item cabecaItem) {
        this.itemCabeca = cabecaItem;
    }

    public String toString() {
        String classeInformation = "CLASSE\n" + 
        "Descrição: " + descricao + "\n" + 
        "Item na mão direita: " + getItemMãoDireita + "\n" + 
        "Item na mão esquerda: " + getItemMaoEsquerda + "\n" + 
        "Item no pé: " + getItemPe + "\n" +
        "Item na cabeça: " + itemCabeca + "\n";
        
        return classeInformation; 
    }
}
