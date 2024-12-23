package Models;

public class ClasseGuerreiro extends Classe {
    public ClasseGuerreiro(String descricao, Item itemMaoDireita, Item itemMaoEsquerda, Item itemPe) {
        super(descricao, itemMaoDireita, itemMaoEsquerda, itemPe);
    }
    private Item itemCorpo;
    private Item itemCabeca;

    //Métodos getters
    public String getDecricao = ClasseGuerreiro.super.getDescricao();
    public Item getItemMãoDireita = ClasseGuerreiro.super.getItemMaoDireita();
    public Item getItemMaoEsquerda = ClasseGuerreiro.super.getItemMaoEsquerda();
    public Item getItemPe = ClasseGuerreiro.super.getItemPe();
    public Item getItemCorpo() {
        return itemCorpo;
    }

    public Item getItemCabeca() {
        return itemCabeca;
    }

    //Métodos setters
    public void setItemMaoDireita(Item maoDireita) {
        ClasseGuerreiro.this.setItemMaoDireita(maoDireita);
    }

    public void setItemMaoEsquerda(Item maoEsquerda) {
        ClasseGuerreiro.this.setItemMaoEsquerda(maoEsquerda);
    }

    public void setItemPe(Item pe) {
        ClasseGuerreiro.this.setItemPe(pe);
    }

    public void setItemCorpo(Item cabecaItem) {
        this.itemCorpo = cabecaItem;
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
        "Item no corpo: " + itemCorpo + "\n" +
        "Item na cabeça: " + itemCabeca + "\n";
        
        return classeInformation; 
    }
}
