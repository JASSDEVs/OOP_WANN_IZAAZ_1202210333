package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        System.out.println("SELAMAT DATANG DI RESTORAN EAD");
        System.out.println("SILAHKAN REGISTER TERLEBIH DAHULU");
        // TODO Create Menu
        Menu menuu = new Menu();
        String menusatu = menuu.menu("Sate","Makanan",10000);
        String menudua =menuu.menu("Mie Goreng","Makanan",5000);
        String menutiga =menuu.menu("Es teh","Minuman",5000);
        
        // System.out.println(menutiga);
        // TODO Insert Menu to Database

        // TODO Display Main Menu and User must be Register First
        System.out.println("=====================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("No Handphone : ");
        String tlp = scanner.nextLine();
        System.out.println("\nREGISTER SUCCESSFUL");
        System.out.println("Nama : "+nama);
        System.out.println("No Handphone : "+tlp);
        System.out.println("=====================================");

        // TODO Create User from register in Main Menu
        
        // TODO Display Menu
        Database.insertmenu(menusatu,menudua,menutiga);

    }
}
