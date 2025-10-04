/*
Kunci jawaban untuk Mobil.java
+
class Mobil extends Kendaraan {
    // STATIC VARIABLE khusus untuk Mobil
    private static int totalMobil = 0;

    // INSTANCE VARIABLE
    private int jumlahPintu;
    private String jenisTransmisi;

    // Constructor dengan keyword SUPER dan THIS
    public Mobil(String merk, int tahun, double hargaSewa, int jumlahPintu, String jenisTransmisi) {
        super(merk, tahun, hargaSewa);  // SUPER() memanggil constructor parent
        this.jumlahPintu = jumlahPintu;       // THIS untuk atribut sendiri
        this.jenisTransmisi = jenisTransmisi;
        totalMobil++;  // Increment static variable khusus Mobil
    }

    // Override method hitungTotalSewa dengan biaya tambahan 10%
    @Override
    public double hitungTotalSewa(int jumlahHari) {
        // Menggunakan THIS untuk akses atribut dari parent (protected)
        return this.hargaSewa * jumlahHari * 1.1;
    }

    // Method overloading untuk Mobil: dengan driver
    public double hitungTotalSewa(int jumlahHari, boolean denganDriver) {
        // Memanggil method overload sendiri dengan THIS
        double total = this.hitungTotalSewa(jumlahHari);
        if (denganDriver) {
            total += (100000 * jumlahHari); // Biaya driver Rp 100.000/hari
        }
        return total;
    }

    // Method yang memanggil method parent dengan SUPER
    public double hitungSewaStandard(int jumlahHari) {
        // SUPER memanggil method parent (tanpa tambahan 10%)
        return super.hitungTotalSewa(jumlahHari);
    }

    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        System.out.println("\n=== MOBIL ===");
        super.tampilkanInfo();  // SUPER memanggil method parent
        // THIS untuk akses atribut sendiri
        System.out.println("Jumlah Pintu: " + this.jumlahPintu);
        System.out.println("Jenis Transmisi: " + this.jenisTransmisi);
    }

    // Method untuk demo THIS dan SUPER
    public void bandingkanHarga(int jumlahHari) {
        System.out.println("\n--- Perbandingan Harga " + this.merk + " ---");
        System.out.println("Harga Standard (parent): Rp " + super.hitungTotalSewa(jumlahHari));
        System.out.println("Harga Mobil (+10%): Rp " + this.hitungTotalSewa(jumlahHari));
    }

    // STATIC METHOD khusus untuk Mobil
    public static int getTotalMobil() {
        return totalMobil;
    }

    public static void tampilkanInfoMobil() {
        System.out.println("Total Mobil Terdaftar: " + totalMobil);
    }
}

*/
