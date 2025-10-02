public class Main {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("   SISTEM RENTAL KENDARAAN");
        System.out.println("====================================");

        // DEMO STATIC - Panggil static method SEBELUM membuat objek
        System.out.println("\n--- SEBELUM MEMBUAT OBJEK ---");
        System.out.println("Total Kendaraan: " + Kendaraan.getTotalKendaraan());
        Mobil.tampilkanInfoMobil();
        Motor.tampilkanInfoMotor();

        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("Toyota Avanza", 2022, 300000, 4, "Manual");
        Mobil mobil2 = new Mobil("Honda Jazz", 2023, 350000, 4, "Automatic");

        // Membuat objek Motor
        Motor motor1 = new Motor("Honda Beat", 2021, 75000, "Matic");
        Motor motor2 = new Motor("Yamaha R15", 2023, 150000, "Sport");

        // DEMO STATIC - Setelah membuat objek
        System.out.println("\n--- SETELAH MEMBUAT 4 OBJEK ---");
        System.out.println("Total Kendaraan: " + Kendaraan.getTotalKendaraan());
        System.out.println("Total Mobil: " + Mobil.getTotalMobil());
        System.out.println("Total Motor: " + Motor.getTotalMotor());

        int jumlahHari = 3;

        // ===== DEMO THIS DAN SUPER =====

        // 1. Demo tampilkanInfo() yang menggunakan super
        mobil1.tampilkanInfo();
        System.out.println("Total Sewa " + jumlahHari + " Hari: Rp " + mobil1.hitungTotalSewa(jumlahHari));

        // 2. Demo bandingkanHarga() - membandingkan super vs this
        mobil1.bandingkanHarga(jumlahHari);

        // 3. Demo hitungSewaStandard() - memanggil method parent dengan super
        System.out.println("\nSewa Standard (tanpa markup): Rp " + mobil1.hitungSewaStandard(jumlahHari));

        // 4. Demo Motor dengan super dan this
        motor1.tampilkanInfo();
        System.out.println("Total Sewa " + jumlahHari + " Hari: Rp " + motor1.hitungTotalSewa(jumlahHari));
        System.out.println("Total dengan 2 Helm: Rp " + motor1.hitungTotalSewa(jumlahHari, 2));

        // 5. Demo method infoLengkap() yang menggunakan this
        motor1.infoLengkap();

        System.out.println("\n====================================");
        System.out.println("   DEMO METHOD OVERLOADING");
        System.out.println("====================================");

        // Demonstrasi method overloading dengan this
        System.out.println("\nMobil Toyota Avanza:");
        System.out.println("- Sewa 5 hari: Rp " + mobil1.hitungTotalSewa(5));
        System.out.println("- Sewa 5 hari dengan driver: Rp " + mobil1.hitungTotalSewa(5, true));
        System.out.println("- Sewa 5 hari tanpa driver: Rp " + mobil1.hitungTotalSewa(5, false));

        System.out.println("\n====================================");
        System.out.println("   DEMO UPDATE HARGA (THIS)");
        System.out.println("====================================");

        // Demo updateHarga() yang menggunakan this
        System.out.println("\nSebelum update:");
        System.out.println("Harga mobil2: Rp " + mobil2.hargaSewa);
        mobil2.updateHarga(400000);
        System.out.println("Setelah update:");
        System.out.println("Harga mobil2: Rp " + mobil2.hargaSewa);

        System.out.println("\n====================================");
        System.out.println("   DEMO STATIC METHOD & VARIABLE");
        System.out.println("====================================");

        // Panggil static method untuk menampilkan statistik
        Kendaraan.tampilkanStatistik();

        // Tambah beberapa transaksi untuk update totalPendapatan
        System.out.println("\n--- SIMULASI TRANSAKSI ---");
        double sewa1 = mobil1.hitungTotalSewa(5);
        System.out.println("Transaksi 1: Mobil " + mobil1.merk + " selama 5 hari = Rp " + sewa1);

        double sewa2 = motor1.hitungTotalSewa(3);
        System.out.println("Transaksi 2: Motor " + motor1.merk + " selama 3 hari = Rp " + sewa2);

        double sewa3 = mobil2.hitungTotalSewa(7);
        System.out.println("Transaksi 3: Mobil " + mobil2.merk + " selama 7 hari = Rp " + sewa3);

        // Tampilkan statistik setelah transaksi
        Kendaraan.tampilkanStatistik();

        System.out.println("\n--- INFO PER KATEGORI ---");
        Mobil.tampilkanInfoMobil();
        Motor.tampilkanInfoMotor();
    }
}