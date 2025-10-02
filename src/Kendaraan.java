class Kendaraan {
    // STATIC VARIABLE - dibagi oleh semua objek
    protected static int totalKendaraan = 0;
    protected static double totalPendapatan = 0;

    // INSTANCE VARIABLE - unik untuk setiap objek
    protected String merk;
    protected int tahun;
    protected double hargaSewa;

    // Constructor dengan keyword THIS
    public Kendaraan(String merk, int tahun, double hargaSewa) {
        this.merk = merk;           // this.merk = atribut class, merk = parameter
        this.tahun = tahun;         // this untuk membedakan atribut dan parameter
        this.hargaSewa = hargaSewa;
        totalKendaraan++;           // Increment static variable setiap objek dibuat
    }

    // Method overloading #1: hitungTotalSewa dengan 1 parameter
    public double hitungTotalSewa(int jumlahHari) {
        double total = this.hargaSewa * jumlahHari;
        totalPendapatan += total;  // Tambahkan ke static variable
        return total;
    }

    // Method overloading #2: hitungTotalSewa dengan 2 parameter (ada diskon)
    public double hitungTotalSewa(int jumlahHari, double diskon) {
        // Memanggil method overload lain dengan THIS
        double total = this.hitungTotalSewa(jumlahHari);  // this.methodName()
        return total - (total * diskon / 100);
    }

    // Method overloading #3: hitungTotalSewa dengan 3 parameter (diskon + asuransi)
    public double hitungTotalSewa(int jumlahHari, double diskon, double biayaAsuransi) {
        // Memanggil method overload lain dengan THIS
        double totalSetelahDiskon = this.hitungTotalSewa(jumlahHari, diskon);
        return totalSetelahDiskon + biayaAsuransi;
    }

    // Method untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Merk: " + this.merk);
        System.out.println("Tahun: " + this.tahun);
        System.out.println("Harga Sewa per Hari: Rp " + this.hargaSewa);
    }

    // Method tambahan untuk demo THIS
    public void updateHarga(double hargaSewa) {
        this.hargaSewa = hargaSewa;  // this.hargaSewa = atribut, hargaSewa = parameter
        System.out.println("Harga sewa " + this.merk + " diupdate menjadi: Rp " + this.hargaSewa);
    }

    // STATIC METHOD - bisa dipanggil tanpa membuat objek
    public static int getTotalKendaraan() {
        return totalKendaraan;
    }

    public static double getTotalPendapatan() {
        return totalPendapatan;
    }

    public static void tampilkanStatistik() {
        System.out.println("\n========== STATISTIK RENTAL ==========");
        System.out.println("Total Kendaraan Terdaftar: " + totalKendaraan);
        System.out.println("Total Pendapatan: Rp " + totalPendapatan);
        System.out.println("======================================");
    }

    public static void resetStatistik() {
        totalKendaraan = 0;
        totalPendapatan = 0;
        System.out.println("Statistik telah direset!");
    }
}