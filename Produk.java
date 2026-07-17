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
