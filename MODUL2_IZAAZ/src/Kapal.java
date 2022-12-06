public class Kapal extends TransportasiAir{
    protected String mesin;

    public Kapal(int jumlahkursi, int biaya, String mesin){
        super(jumlahkursi,biaya);
        this.mesin = mesin;
    }
    public void informasi(){
        System.out.println("Transportasi Air jenis kapal dengan kursi berjumlah "+this.jumlahkursi+" ditetapkan dengan biaya sebesar Rp. "+this.biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi air jenis kapal sedang berlayar menggunkan mesin "+this.mesin+" dengan kecepatan yang tidak stabil");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi air jenis kapal sedang berlayar menggunkan mesin "+this.mesin+" dengan kecepatan stabil di kisaran "+kecepatan+" knot");
    }
    public void berlabuh(){
        System.out.println("ransportasi air jenis kapal berlabuh di pantai");
    }
}
