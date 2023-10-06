package Task5_05;

public class Shelf extends Furniture{
    public Shelf(String name, double price) {
        super(name, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Полиця - "+this.name+", "+this.price+" грн.");
    }
}
