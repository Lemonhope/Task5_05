package Task5_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Який варіант набору Ви хотіли б придбати ?");
        System.out.println("1 -> Ар-деко\n" + "2 -> Вікторіанський\n" + "3 -> Модерн");
        Scanner scanner=new Scanner(System.in);
        int typeDecor=scanner.nextInt();
        System.out.println("Ви обрали варіант: "+typeDecor);
        switch (typeDecor){
            case 1:{
                ArDeco arDeco=new ArDeco();
                // добавимо полицю
                Furniture shelf=new Shelf("Мармурова полиця", 1244);
                arDeco.addFurniture(shelf);
                arDeco.showFurnitureInfo();
                break;
            }
            case 2:{
                Victorian victor=new Victorian();
                victor.showFurnitureInfo();
                break;
            }
            case 3:{
                Modern modern=new Modern();
                modern.showFurnitureInfo();
                break;
            }
            default:{
                System.out.println("Не існує такого варіанту декору.");
                break;
            }

        }
    }
}
