package Task5_05;

public class Table extends Furniture{

    public Table(String name, double price) {
        super(name, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Столик - "+this.name+", "+this.price+" грн.");
    }
}
