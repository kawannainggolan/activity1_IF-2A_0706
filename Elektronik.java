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
