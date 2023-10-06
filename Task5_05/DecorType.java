package Task5_05;

public abstract class DecorType {
    protected String decorName;
    protected Furniture[] forSale=new Furniture[10];
    protected int numForSale;

    public void showFurnitureInfo() {
        double sumPrice=0;
        System.out.println("Детальний опис:");
        for (int i = 0; i < this.numForSale; i++) {
            this.forSale[i].showInfo();
            sumPrice += this.forSale[i].getPrice();
        }
        System.out.println("Загальна сума: "+sumPrice);
    }

    public void addFurniture(Furniture newFurn) {
        this.forSale[numForSale++]=newFurn;
    }

    public String getDecorName() {
        return decorName;
    }
    
}
