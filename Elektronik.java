public class Elektronik extends Produk {
    private int garansi;
    private String merk;
    
    public Elektronik(String nama, double harga, int stok, int garansi, String merk) {
        super(nama, harga, stok);
        this.garansi = garansi;
        this.merk = merk;
    }
    
    public int getGaransi() {
        return garansi;
    }
    
    public String getMerk() {
        return merk;
    }

}
    @Override
    public void tampilInfo() {
        System.out.println("Elektronik");
        System.out.println("Merk : " + merk);
        System.out.println("Garansi : " + garansi + " bulan");
        System.out.println("----------");
    }
    
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.15;
    }
    public double hitungDiskon(int jumlahBeli) {
        if (jumlahBeli >= 5) {
            return hitungTotalHarga(jumlahBeli) * 0.10;
        }
        return 0;
    }