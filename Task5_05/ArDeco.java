package Task5_05;

public class ArDeco extends DecorType{
    public ArDeco() {
        this.decorName="Ар-деко";
        this.numForSale=3;
        this.forSale[0]=new Chair("Луї Сюе", 3500.60);
        this.forSale[1]=new Sofa("Розписана квітка", 4940.11);
        this.forSale[2]=new Table("Водоспад", 6100);
    }

}
