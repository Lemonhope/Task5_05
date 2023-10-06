package Task5_05;

public class Modern extends DecorType{
    public Modern() {
        this.decorName="Модерн";
        this.numForSale=3;
        this.forSale[0]=new Chair("Стар шіп", 1340);
        this.forSale[1]=new Sofa("Гіпер портал", 5340.17);
        this.forSale[2]=new Table("Пульт керування", 4340);
    }

}
