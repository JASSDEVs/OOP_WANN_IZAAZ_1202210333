public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;
    protected String user;

    public Perangkat(String drive,String user, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
        this.user = user;
    }
    public void informasi(){
        System.out.println("Perangkat " + this.user +" memiliki drive tipe " + this.drive + "dengan RAM sebesar "+ this.ram + "GB dan processor secepat " + this.processor + "Ghz.");
    }
}