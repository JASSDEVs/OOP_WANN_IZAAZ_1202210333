public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkatt = new Perangkat("Lexar","IZ44Z",32,(float)3.80);
        Laptop laptopp = new Laptop("Samsung","CUM1N", 16, (float)3.20, false);
        Handphone handphonee = new Handphone("V-Gen","N4F41",8,(float)2.20,true);
        
        perangkatt.informasi();

        System.out.println();
        laptopp.information();
        laptopp.openGame("Tic-Tak");
        laptopp.sendEmail("izaazadjie@yahoo.com");
        laptopp.sendEmail("izaazadjie@gmail.com","tictak@yandex.ac.id");

        System.out.println();
        handphonee.information();
        handphonee.call(628212261);
        handphonee.sendSMS(628212261, 628245261);
        handphonee.sendSMS(628212261, 628442261,612453255);
    }
}