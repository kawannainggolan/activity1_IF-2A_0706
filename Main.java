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