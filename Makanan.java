public class Makanan extends Produk {
    private String kedaluwarsa;
    private String kategori;
    
    public Makanan(String nama, double harga, int stok, String kedaluwarsa, String kategori) {
        super(nama, harga, stok);
        this.kedaluwarsa = kedaluwarsa;
        this.kategori = kategori;
    }
    
    public String getKedaluwarsa() {
        return kedaluwarsa;
    }
    
    public String getKategori() {
        return kategori;
    }
}