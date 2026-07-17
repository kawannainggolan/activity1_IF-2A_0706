public abstract class Produk {
    protected String nama;
    protected double harga;
    protected int stok;
    
    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    
    public String getNama() {
        return nama;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public int getStok() {
        return stok;
    }
    
    public void setStok(int stok) {
        this.stok = stok;
    }

    public abstract void tampilInfo();
    
    public abstract double hitungPajak(double harga);
        public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }
        public Produk(String nama, double harga, int stok) {
        if (stok < 0) {
            throw new IllegalArgumentException("Stok tidak boleh negatif!");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif!");
        }
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    
    public void setStok(int stok) {
        if (stok < 0) {
            throw new IllegalArgumentException("Stok tidak boleh negatif!");
        }
        this.stok = stok;
    }
    
    public double hitungTotalHarga(int jumlahBeli) {
        if (jumlahBeli < 0) {
            throw new IllegalArgumentException("Jumlah beli tidak boleh negatif!");
        }
        return harga * jumlahBeli;
    }
        @Override
    public String toString() {
        return "Produk: " + nama + " | Harga: Rp " + harga + " | Stok: " + stok;
    }
