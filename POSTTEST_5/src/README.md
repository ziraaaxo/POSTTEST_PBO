# LAPORAN PRAKTIKUM
# PEMROGRAMAN BERBASIS OBJEK

## Posttest 5

### Sistem Pendataan Karyawan di Perusahaan

---

## Identitas

NIM : 2409106016
Nama : Azira Faradina
Mata Kuliah : Pemrograman Berorientasi Objek

---

## Deskripsi Program

Program ini merupakan pengembangan dari posttest sebelumnya dengan menerapkan konsep abstraction dan penggunaan interface pada sistem pendataan karyawan.

Program tetap memiliki fitur utama:

* Menambahkan data karyawan
* Menampilkan data karyawan
* Mengupdate data karyawan
* Menghapus data karyawan

Selain itu, program juga dikembangkan dengan penambahan atribut divisi serta perbaikan alur update agar lebih spesifik dan mudah digunakan.

---

## Konsep yang Digunakan

### 1. Abstraction

Abstraction digunakan untuk menyembunyikan detail implementasi dan hanya menampilkan fungsi utama dari suatu objek.

Pada program ini, abstraction diterapkan dengan mengubah class `Karyawan` menjadi abstract class.

```java id="m3aq9u"
abstract class Karyawan
```

Class ini tidak dapat dibuat objek secara langsung, tetapi digunakan sebagai parent bagi class turunan.

---

### 2. Abstract Method

Pada class `Karyawan` terdapat method abstract:

```java id="mzz0gj"
public abstract void read();
public abstract String getInfo();
```

Method ini wajib diimplementasikan oleh subclass dan digunakan untuk menampilkan data sesuai jenis karyawan.

---

### 3. Interface

Program menggunakan interface bernama `InfoTambahan`:

```java id="2b6t1z"
public interface InfoTambahan {
    String getInfoTambahan();
    void tampilTambahan();
}
```

Interface ini digunakan untuk menangani informasi tambahan yang berbeda pada setiap jenis karyawan.

---

### 4. Implementasi Interface

Interface diimplementasikan pada dua subclass:

* `KaryawanTetap` → menampilkan bonus dan total gaji
* `KaryawanKontrak` → menampilkan durasi kontrak

Dengan adanya interface, setiap class memiliki cara masing-masing dalam menampilkan informasi tambahan tanpa mengganggu struktur utama program.

---

## Perbaikan Fitur Update

Pada versi sebelumnya, update hanya berdasarkan ID sehingga dapat terjadi konflik jika terdapat ID yang sama pada jenis karyawan yang berbeda.

Pada versi ini, ditambahkan langkah pemilihan jenis karyawan terlebih dahulu, sehingga proses update menjadi lebih spesifik dan tidak terjadi kesalahan pemilihan data.

---

## Contoh Output

```text id="o9j8t6"
===== DATA KARYAWAN =====
Jenis    : Karyawan Tetap
ID       : 1
Nama     : Azira
Divisi   : HRD
Jabatan  : Manager
Gaji     : 60,000,000
Bonus    : 20,000,000
Total    : 80,000,000
---------------------------
```

---

## Kesimpulan

Dengan penerapan abstraction dan interface, program menjadi lebih terstruktur karena setiap bagian memiliki tanggung jawab yang jelas.

Abstract class digunakan sebagai dasar struktur program, sedangkan interface digunakan untuk menangani variasi perilaku pada setiap subclass.

Penambahan atribut divisi dan perbaikan fitur update membuat program lebih realistis dan mudah digunakan.

Secara keseluruhan, program menjadi lebih fleksibel, rapi, dan sesuai dengan prinsip pemrograman berorientasi objek.
