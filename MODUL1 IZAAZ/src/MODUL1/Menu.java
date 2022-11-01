package MODUL1;

public class Menu {
    String name;
    String category;
    int price;
    
    String menu(String name, String category, int price){
        this.name = name;
        this.category =  category;
        this.price = price;
        return name +" ("+ category+") " + "Rp " + price;
        // System.out.println(name);
        // return category;
    }

    // TODO Create Attribute of Menu; Name, Category, and Price then Create Setter

}
