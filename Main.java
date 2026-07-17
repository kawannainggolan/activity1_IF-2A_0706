import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        System.out.println("Sistem Manajemen Produk");
        System.out.println("=======================");
    }
}


public class Main {
    private static ArrayList<Produk> daftarProduk = new ArrayList<>();
    
    public static void main(String[] args) {
        System.out.println("Sistem Manajemen Produk");
        System.out.println("=======================");
        
        daftarProduk.add(new Makanan("Roti Tawar", 15000, 50, "2024-12-31", "Roti"));
        daftarProduk.add(new Makanan("Mie Instan", 3000, 100, "2025-06-30", "Makanan Siap Saji"));
        daftarProduk.add(new Elektronik("Laptop", 15000000, 10, 24, "Asus"));
        daftarProduk.add(new Elektronik("Smartphone", 5000000, 15, 12, "Samsung"));
        
        tampilkanSemuaProduk();
    }
    
    public static void tampilkanSemuaProduk() {
        if (daftarProduk.isEmpty()) {
            System.out.println("Belum ada produk.");
        } else {
            for (Produk p : daftarProduk) {
                p.tampilInfo();
            }
        }
    }
}
    public static void tambahProduk(Produk p) {
        daftarProduk.add(p);
        System.out.println("Produk berhasil ditambahkan: " + p.getNama());
    }
    
    public static void cariProduk(String nama) {
        boolean ditemukan = false;
        for (Produk p : daftarProduk) {
            if (p.getNama().equalsIgnoreCase(nama)) {
                p.tampilInfo();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Produk tidak ditemukan.");
        }
    }
    
    public static void hapusProduk(String nama) {
        Produk produkDihapus = null;
        for (Produk p : daftarProduk) {
            if (p.getNama().equalsIgnoreCase(nama)) {
                produkDihapus = p;
                break;
            }
        }
        if (produkDihapus != null) {
            daftarProduk.remove(produkDihapus);
            System.out.println("Produk berhasil dihapus: " + nama);
        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }
        public static void updateStok(String nama, int stokBaru) {
        for (Produk p : daftarProduk) {
            if (p.getNama().equalsIgnoreCase(nama)) {
                p.setStok(stokBaru);
                System.out.println("Stok produk " + nama + " diupdate menjadi " + stokBaru);
                return;
            }
        }
        System.out.println("Produk tidak ditemukan.");
    }
    
    public static double hitungTotalNilaiStok() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHarga() * p.getStok();
        }
        return total;
    }
    
    public static void beliProduk(String nama, int jumlah) {
        for (Produk p : daftarProduk) {
            if (p.getNama().equalsIgnoreCase(nama)) {
                if (p.getStok() >= jumlah) {
                    p.setStok(p.getStok() - jumlah);
                    double total = p.hitungTotalHarga(jumlah);
                    double pajak = p.hitungPajak(total);
                    
                    System.out.println("=== Detail Pembelian ===");
                    System.out.println("Produk: " + nama);
                    System.out.println("Jumlah: " + jumlah);
                    System.out.println("Total Harga: Rp " + total);
                    System.out.println("Pajak: Rp " + pajak);
                    System.out.println("Total Bayar: Rp " + (total + pajak));
                } else {
                    System.out.println("Stok tidak mencukupi. Stok tersedia: " + p.getStok());
                }
                return;
            }
        }
        System.out.println("Produk tidak ditemukan.");
    }