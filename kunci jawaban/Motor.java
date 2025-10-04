/*
Kunci jawaban untuk Motor.java
+
class Motor extends Kendaraan {
    // STATIC VARIABLE khusus untuk Motor
    private static int totalMotor = 0;

    // INSTANCE VARIABLE
    private String jenisMotor;

    // Constructor dengan keyword SUPER dan THIS
    public Motor(String merk, int tahun, double hargaSewa, String jenisMotor) {
        super(merk, tahun, hargaSewa);  // SUPER() memanggil constructor parent
        this.jenisMotor = jenisMotor;   // THIS untuk atribut sendiri
        totalMotor++;  // Increment static variable khusus Motor
    }

    // Method overloading untuk Motor: dengan helm tambahan
    public double hitungTotalSewa(int jumlahHari, int jumlahHelm) {
        // Memanggil method parent dengan SUPER
        double total = super.hitungTotalSewa(jumlahHari);
        total += (jumlahHelm * 5000 * jumlahHari); // Biaya helm Rp 5.000/helm/hari
        return total;
    }

    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        System.out.println("\n=== MOTOR ===");
        super.tampilkanInfo();  // SUPER memanggil method parent
        // THIS untuk akses atribut sendiri
        System.out.println("Jenis Motor: " + this.jenisMotor);
    }

    // Method untuk demo THIS
    public void infoLengkap() {
        System.out.println("\nInformasi Motor " + this.merk + ":");
        System.out.println("- Jenis: " + this.jenisMotor);
        System.out.println("- Tahun: " + this.tahun);  // akses protected dari parent
        System.out.println("- Harga: Rp " + this.hargaSewa);
    }

    // STATIC METHOD khusus untuk Motor
    public static int getTotalMotor() {
        return totalMotor;
    }

    public static void tampilkanInfoMotor() {
        System.out.println("Total Motor Terdaftar: " + totalMotor);
    }
}

*/
