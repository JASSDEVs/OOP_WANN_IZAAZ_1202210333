public class Handphone extends Perangkat{
    protected boolean fingerprint;

    public Handphone(String drive,String user, int ram, float processor, boolean fingerprint){
        super(drive,user, ram, processor);
        this.fingerprint = fingerprint;
    }
    public void information(){
        if(fingerprint == true){
            System.out.println("Handphone "+ this.user+" memiliki drive tipe " + this.drive + " dengan RAM sebesar "+ this.ram + " GB dan processor secepat " + this.processor + " Ghz. Selain itu handphone ini memiliki Fingerprint" );
        }else{
            System.out.println("Handphone "+ this.user+" memiliki drive tipe " + this.drive + " dengan RAM sebesar "+ this.ram + " GB dan processor secepat " + this.processor + " Ghz. Selain itu handphone ini TIDAK memiliki Fingerprint");
        }
    }
    public void sendSMS(int no_hp){
        System.out.println("Handphone mengirim pesan ke No " + no_hp);
    }
    public void call(int no_hp){
        System.out.println("Handphone memanggil ke No " + no_hp);
    }
    public void sendSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim pesan ke No " + no_hp1 + "dan ke No " + no_hp2);
    }
    public void sendSMS(int no_hp1, int no_hp2, int no_hp3){
        System.out.println("Handphone No " + no_hp1 + " telah mendapatkan pesan dari No "+ no_hp2 + "dan diteruskan ke No " + no_hp3);
    }
}