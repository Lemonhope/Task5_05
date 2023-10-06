package Task5_05;

public class Sofa extends Furniture{
    public Sofa(String name, double price) {
        super(name, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Диван - "+this.name+", "+this.price+" грн.");
    }
}
