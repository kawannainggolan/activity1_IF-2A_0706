import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Produk> daftarProduk = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("SISTEM MANAJEMEN PRODUK");
        System.out.println("=======================");
        
        tambahProduk(new Makanan("Roti Tawar", 15000, 50, "2024-12-31", "Roti"));
        tambahProduk(new Makanan("Mie Instan", 3000, 100, "2025-06-30", "Makanan Siap Saji"));
        tambahProduk(new Elektronik("Laptop", 15000000, 10, 24, "Asus"));
        tambahProduk(new Elektronik("Smartphone", 5000000, 15, 12, "Samsung"));
        
        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Semua Produk");
            System.out.println("2. Tambah Produk");
            System.out.println("3. Cari Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Update Stok");
            System.out.println("6. Beli Produk");
            System.out.println("7. Total Nilai Stok");
            System.out.println("8. Demo Overloading Makanan");
            System.out.println("9. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1: tampilkanSemuaProduk(); break;
                case 2: tambahProdukInteraktif(); break;
                case 3: 
                    System.out.print("Masukkan nama produk: ");
                    cariProduk(scanner.nextLine()); 
                    break;
                case 4:
                    System.out.print("Masukkan nama produk: ");
                    hapusProduk(scanner.nextLine()); 
                    break;
                case 5:
                    System.out.print("Masukkan nama produk: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan stok baru: ");
                    updateStok(nama, scanner.nextInt()); 
                    break;
                case 6:
                    System.out.print("Masukkan nama produk: ");
                    String namaBeli = scanner.nextLine();
                    System.out.print("Masukkan jumlah: ");
                    beliProduk(namaBeli, scanner.nextInt()); 
                    break;
                case 7:
                    System.out.println("Total nilai stok: Rp " + hitungTotalNilaiStok()); 
                    break;
                case 8: demoOverloading(); break;
                case 9: System.out.println("Terima kasih!"); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 9);
    }
    
    public static void tambahProdukInteraktif() {
        System.out.println("Jenis produk: 1. Elektronik, 2. Makanan");
        System.out.print("Pilih jenis: ");
        int jenis = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        System.out.print("Stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine();
        
        if (jenis == 1) {
            System.out.print("Merk: ");
            String merk = scanner.nextLine();
            System.out.print("Garansi (bulan): ");
            int garansi = scanner.nextInt();
            tambahProduk(new Elektronik(nama, harga, stok, garansi, merk));
        } else if (jenis == 2) {
            System.out.print("Kategori: ");
            String kategori = scanner.nextLine();
            System.out.print("Kedaluwarsa (YYYY-MM-DD): ");
            String kedaluwarsa = scanner.nextLine();
            tambahProduk(new Makanan(nama, harga, stok, kedaluwarsa, kategori));
        } else {
            System.out.println("Jenis tidak valid!");
        }
    }
    
    public static void demoOverloading() {
        System.out.println("\n=== DEMO OVERLOADING MAKANAN ===");
        Makanan m = new Makanan("Demo Makanan", 10000, 100, "2025-12-31", "Demo");
        System.out.println("Beli 5 item: Diskon = " + m.hitungDiskon(5));
        System.out.println("Beli 10 item: Diskon = " + m.hitungDiskon(10));
        System.out.println("Beli 10 item dengan diskon 15%: Diskon = " + m.hitungDiskon(10, 15));
    }
}
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
    

public class Main {
    private static ArrayList<Produk> daftarProduk = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("SISTEM MANAJEMEN PRODUK");
        System.out.println("=======================");
        
        tambahProduk(new Makanan("Roti Tawar", 15000, 50, "2024-12-31", "Roti"));
        tambahProduk(new Makanan("Mie Instan", 3000, 100, "2025-06-30", "Makanan Siap Saji"));
        tambahProduk(new Elektronik("Laptop", 15000000, 10, 24, "Asus"));
        tambahProduk(new Elektronik("Smartphone", 5000000, 15, 12, "Samsung"));
        
        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Semua Produk");
            System.out.println("2. Tambah Produk");
            System.out.println("3. Cari Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Update Stok");
            System.out.println("6. Beli Produk");
            System.out.println("7. Total Nilai Stok");
            System.out.println("8. Demo Overloading Makanan");
            System.out.println("9. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1: tampilkanSemuaProduk(); break;
                case 2: tambahProdukInteraktif(); break;
                case 3: 
                    System.out.print("Masukkan nama produk: ");
                    cariProduk(scanner.nextLine()); 
                    break;
                case 4:
                    System.out.print("Masukkan nama produk: ");
                    hapusProduk(scanner.nextLine()); 
                    break;
                case 5:
                    System.out.print("Masukkan nama produk: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan stok baru: ");
                    updateStok(nama, scanner.nextInt()); 
                    break;
                case 6:
                    System.out.print("Masukkan nama produk: ");
                    String namaBeli = scanner.nextLine();
                    System.out.print("Masukkan jumlah: ");
                    beliProduk(namaBeli, scanner.nextInt()); 
                    break;
                case 7:
                    System.out.println("Total nilai stok: Rp " + hitungTotalNilaiStok()); 
                    break;
                case 8: demoOverloading(); break;
                case 9: System.out.println("Terima kasih!"); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 9);
    }
    
    public static void tambahProdukInteraktif() {
        System.out.println("Jenis produk: 1. Elektronik, 2. Makanan");
        System.out.print("Pilih jenis: ");
        int jenis = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        System.out.print("Stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine();
        
        if (jenis == 1) {
            System.out.print("Merk: ");
            String merk = scanner.nextLine();
            System.out.print("Garansi (bulan): ");
            int garansi = scanner.nextInt();
            tambahProduk(new Elektronik(nama, harga, stok, garansi, merk));
        } else if (jenis == 2) {
            System.out.print("Kategori: ");
            String kategori = scanner.nextLine();
            System.out.print("Kedaluwarsa (YYYY-MM-DD): ");
            String kedaluwarsa = scanner.nextLine();
            tambahProduk(new Makanan(nama, harga, stok, kedaluwarsa, kategori));
        } else {
            System.out.println("Jenis tidak valid!");
        }
    }
    
    public static void demoOverloading() {
        System.out.println("\n=== DEMO OVERLOADING MAKANAN ===");
        Makanan m = new Makanan("Demo Makanan", 10000, 100, "2025-12-31", "Demo");
        System.out.println("Beli 5 item: Diskon = " + m.hitungDiskon(5));
        System.out.println("Beli 10 item: Diskon = " + m.hitungDiskon(10));
        System.out.println("Beli 10 item dengan diskon 15%: Diskon = " + m.hitungDiskon(10, 15));
    }
}