package Task5_05;

public class Chair extends Furniture{
    public Chair(String name, double price) {
        super(name, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Крісло - "+this.name+", "+this.price+" грн.");
    }
}
