public class MainApp {
    public static void main(String[] args){
        TransportasiAir transportasiAir = new TransportasiAir(4, 20000);
        Sampan sampan = new Sampan(20, 50000, 2);
        Kapal kapal = new Kapal(50, 100000, "Diesel");

        transportasiAir.informasi();
        transportasiAir.berlayar();
        transportasiAir.berlabuh();

        System.out.println();

        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(4);

        System.out.println();

        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);
        kapal.berlabuh();

    }
}
