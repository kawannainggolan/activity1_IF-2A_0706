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

        @Override
    public void tampilInfo() {
        System.out.println("Makanan");
        System.out.println("Kategori : " + kategori);
        System.out.println("Kedaluwarsa : " + kedaluwarsa);
        System.out.println("----------");
    }
    
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.10;
    }

        public double hitungDiskon(int jumlahBeli) {
        if (jumlahBeli >= 10) {
            return hitungTotalHarga(jumlahBeli) * 0.05;
        }
        return 0;
    }
