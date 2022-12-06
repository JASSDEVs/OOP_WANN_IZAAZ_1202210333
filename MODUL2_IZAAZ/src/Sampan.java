public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahkursi, int biaya, int layar){
        super(jumlahkursi,biaya);
        this.layar = layar;
    }
    public void informasi(){
        System.out.println("Transportasi Air jenis sampan dengan kursi berjumlah "+this.jumlahkursi+" ditetapkan dengan biaya sebesar Rp. "+this.biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi air jenis sampan sedang berlayar menggunakan "+this.layar+" layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi air jenis sampan sedang berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi air jenis sampan sedang berlabuh di pantai menggunakan "+jangkar+" jangkar");
    }
}

