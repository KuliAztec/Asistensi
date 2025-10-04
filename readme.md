# SOAL UJIAN TENGAH SEMESTER
## PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK

---

## **STUDI KASUS: SISTEM RENTAL KENDARAAN**

**CV. Berkah Jaya Transport** adalah perusahaan rental kendaraan yang menyewakan berbagai jenis kendaraan untuk keperluan transportasi pelanggan. Perusahaan ini memiliki armada yang terdiri dari mobil dan motor dengan berbagai tipe dan spesifikasi.

Sebagai programmer, Anda diminta untuk membuat sistem informasi rental kendaraan menggunakan konsep **Pemrograman Berorientasi Objek (OOP)** dengan bahasa Java.

---

## **DESKRIPSI SISTEM**

### **A. Informasi Kendaraan (Parent Class)**

Setiap kendaraan yang tersedia untuk disewa memiliki informasi dasar berikut:
- **Merk kendaraan** (contoh: Toyota, Honda, Yamaha)
- **Tahun pembuatan** (contoh: 2022, 2023)
- **Harga sewa per hari** (dalam Rupiah)

Perusahaan juga perlu mencatat **statistik bisnis** secara keseluruhan:
- **Total kendaraan** yang terdaftar dalam sistem
- **Total pendapatan** dari semua transaksi sewa

### **B. Jenis Kendaraan**

Perusahaan memiliki 2 kategori kendaraan:

#### **1. MOBIL**
Mobil memiliki informasi tambahan:
- **Jumlah pintu** (contoh: 2 pintu, 4 pintu)
- **Jenis transmisi** (Manual atau Automatic)

**Ketentuan Harga:**
- Harga sewa mobil dikenakan **biaya tambahan 10%** dari harga dasar
- Pelanggan dapat memilih opsi **sewa dengan driver** dengan tambahan biaya Rp 100.000 per hari

#### **2. MOTOR**
Motor memiliki informasi tambahan:
- **Jenis motor** (Sport, Matic, atau Manual)

**Ketentuan Harga:**
- Harga sewa motor sesuai dengan harga dasar (tanpa tambahan)
- Pelanggan dapat menyewa **helm tambahan** dengan biaya Rp 5.000 per helm per hari

### **C. Fitur Perhitungan Sewa**

Sistem harus dapat menghitung biaya sewa dengan berbagai skenario:

1. **Sewa Standar**: Hitung biaya berdasarkan jumlah hari
2. **Sewa dengan Diskon**: Hitung biaya dengan potongan diskon (dalam persen)
3. **Sewa dengan Diskon dan Asuransi**: Hitung biaya dengan diskon dan tambahan biaya asuransi

### **D. Fitur Statistik**

Sistem harus dapat menampilkan:
- Total semua kendaraan yang terdaftar
- Total mobil yang terdaftar
- Total motor yang terdaftar
- Total pendapatan dari semua transaksi sewa
- Laporan statistik lengkap

---

## **TUGAS ANDA**

Buatlah program Java dengan ketentuan sebagai berikut:

### **1. Class `Kendaraan` (Parent Class)**

**Atribut:**
- `merk` (String, protected)
- `tahun` (int, protected)
- `hargaSewa` (double, protected)
- `totalKendaraan` (int, static)
- `totalPendapatan` (double, static)

**Constructor:**
- Inisialisasi semua atribut instance
- Increment `totalKendaraan` setiap kali objek dibuat
- Gunakan keyword **THIS** untuk membedakan atribut dan parameter

**Method:**
- `hitungTotalSewa(int jumlahHari)` - hitung sewa standar
- `hitungTotalSewa(int jumlahHari, double diskon)` - hitung dengan diskon
- `hitungTotalSewa(int jumlahHari, double diskon, double biayaAsuransi)` - hitung dengan diskon dan asuransi
- `tampilkanInfo()` - tampilkan informasi kendaraan
- `updateHarga(double hargaSewa)` - update harga sewa
- **Static methods:**
  - `getTotalKendaraan()` - return total kendaraan
  - `getTotalPendapatan()` - return total pendapatan
  - `tampilkanStatistik()` - tampilkan statistik lengkap
  - `resetStatistik()` - reset semua statistik

> **Implementasikan METHOD OVERLOADING** pada method `hitungTotalSewa`

### **2. Class `Mobil` (Child Class - extends Kendaraan)**

**Atribut:**
- `jumlahPintu` (int, private)
- `jenisTransmisi` (String, private)
- `totalMobil` (int, static)

**Constructor:**
- Gunakan keyword **SUPER** untuk memanggil constructor parent
- Gunakan keyword **THIS** untuk inisialisasi atribut sendiri
- Increment `totalMobil`

**Method:**
- **Override** `hitungTotalSewa(int jumlahHari)` - tambahkan markup 10%
- **Overload** `hitungTotalSewa(int jumlahHari, boolean denganDriver)` - tambah biaya driver jika true
- **Override** `tampilkanInfo()` - tampilkan info mobil (gunakan `super.tampilkanInfo()`)
- `hitungSewaStandard(int jumlahHari)` - panggil method parent dengan **SUPER**
- `bandingkanHarga(int jumlahHari)` - bandingkan harga parent vs child
- **Static method:**
  - `getTotalMobil()` - return total mobil
  - `tampilkanInfoMobil()` - tampilkan info mobil

### **3. Class `Motor` (Child Class - extends Kendaraan)**

**Atribut:**
- `jenisMotor` (String, private)
- `totalMotor` (int, static)

**Constructor:**
- Gunakan keyword **SUPER** untuk memanggil constructor parent
- Gunakan keyword **THIS** untuk inisialisasi atribut sendiri
- Increment `totalMotor`

**Method:**
- **Overload** `hitungTotalSewa(int jumlahHari, int jumlahHelm)` - tambah biaya helm
- **Override** `tampilkanInfo()` - tampilkan info motor (gunakan `super.tampilkanInfo()`)
- `infoLengkap()` - tampilkan informasi lengkap motor
- **Static method:**
  - `getTotalMotor()` - return total motor
  - `tampilkanInfoMotor()` - tampilkan info motor

### **4. Class `Main` (Testing)**

Buatlah program testing yang melakukan:
1. Menampilkan statistik SEBELUM membuat objek (gunakan static method)
2. Membuat minimal 2 objek Mobil dan 2 objek Motor
3. Menampilkan statistik SETELAH membuat objek
4. Menampilkan informasi setiap kendaraan
5. Simulasi berbagai perhitungan sewa:
   - Sewa standar
   - Sewa dengan driver (untuk mobil)
   - Sewa dengan helm tambahan (untuk motor)
   - Sewa dengan diskon
   - Sewa dengan diskon dan asuransi
6. Menampilkan perbandingan harga (method parent vs child)
7. Update harga salah satu kendaraan
8. Simulasi transaksi untuk mengupdate total pendapatan
9. Menampilkan laporan statistik akhir

---

## **KONSEP OOP YANG HARUS DIIMPLEMENTASIKAN**

Pastikan program Anda mencakup:

- ✅ **Class dan Object** - minimal 3 class (1 parent, 2 child)
- ✅ **Inheritance** - gunakan keyword `extends`
- ✅ **Encapsulation** - gunakan access modifier (`private`, `protected`, `public`)
- ✅ **Method Overriding** - override method parent dengan `@Override`
- ✅ **Method Overloading** - buat method dengan nama sama tapi parameter berbeda
- ✅ **Keyword THIS** - gunakan untuk membedakan atribut dan parameter
- ✅ **Keyword SUPER** - gunakan untuk memanggil constructor dan method parent
- ✅ **Static Member** - implementasikan static variable dan static method

---

## **FORMAT PENGUMPULAN**

1. Buat 4 file terpisah:
   - `Kendaraan.java`
   - `Mobil.java`
   - `Motor.java`
   - `Main.java`

2. Setiap file harus memiliki:
   - **Komentar header** (nama, NIM, kelas)
   - **Komentar penjelasan** untuk setiap method
   - **Code yang rapi** dan mudah dibaca

3. Kompilasi dan jalankan program, tangkap screenshot output

---

## **CONTOH OUTPUT YANG DIHARAPKAN**

```
====================================
   SISTEM RENTAL KENDARAAN
====================================

--- SEBELUM MEMBUAT OBJEK ---
Total Kendaraan: 0
Total Mobil Terdaftar: 0
Total Motor Terdaftar: 0

--- SETELAH MEMBUAT 4 OBJEK ---
Total Kendaraan: 4
Total Mobil: 2
Total Motor: 2

=== MOBIL ===
Merk: Toyota Avanza
Tahun: 2022
Harga Sewa per Hari: Rp 300000.0
Jumlah Pintu: 4
Jenis Transmisi: Manual
Total Sewa 3 Hari: Rp 990000.0

--- Perbandingan Harga Toyota Avanza ---
Harga Standard (parent): Rp 900000.0
Harga Mobil (+10%): Rp 990000.0

...

========== STATISTIK RENTAL ==========
Total Kendaraan Terdaftar: 4
Total Pendapatan: Rp 2475000.0
======================================
```

---

## **CATATAN PENTING**

1. **WAJIB** menggunakan semua konsep OOP yang telah diajarkan
2. **DILARANG** menggunakan konsep yang belum diajarkan (contoh: interface, abstract, collection)
3. Kode harus **ORIGINAL**, jika terdeteksi plagiarisme akan mendapat nilai 0
4. Pastikan program dapat **COMPILE dan RUN** tanpa error
5. Gunakan **penamaan variable yang jelas** dan **konsisten**

---

**SELAMAT MENGERJAKAN!**

*Jika ada pertanyaan, silakan tanyakan kepada asisten praktikum.*