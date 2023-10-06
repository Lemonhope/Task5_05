package Task5_05;

public class Victorian extends DecorType{
    public Victorian() {
        this.decorName="Вікторіанський";
        this.numForSale=3;
        this.forSale[0]=new Chair("Тиха гавань", 2340);
        this.forSale[1]=new Sofa("Мудрість віків", 7340.57);
        this.forSale[2]=new Table("Місце роздумів", 4340);
    }

}
