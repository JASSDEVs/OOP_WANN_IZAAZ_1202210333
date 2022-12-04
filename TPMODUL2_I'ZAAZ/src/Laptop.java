public class Laptop extends Perangkat{
    protected boolean webcam;

    public Laptop(String drive, String user, int ram, float processor, boolean webcam){
        super(drive,user, ram, processor);
        this.webcam = webcam;
    }
    public void information(){
        if(webcam == true){
            System.out.println("Laptop "+ this.user+" memiliki drive tipe " + this.drive + " dengan RAM sebesar "+ this.ram + "GB dan processor secepat " + this.processor + "Ghz. laptop ini memiliki Webcam");
        }else{
            System.out.println("Laptop "+ this.user+" memiliki drive tipe " + this.drive + " dengan RAM sebesar "+ this.ram + "GB dan processor secepat " + this.processor + "Ghz. laptop ini TIDAK memiliki Webcam");
        }
    }
    public void sendEmail(String email){
        System.out.println("Laptop telah mengirim Email ke " + email);
    }
    public void openGame(String game){
        System.out.println("Laptop telah membuka game " + game);
    }
    public void sendEmail(String email, String email1){
        System.out.println("Laptop telah mengirim Email ke " + email + " dan ke " + email1);
    }
}