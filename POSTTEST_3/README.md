# LAPORAN PRAKTIKUM
# PEMROGRAMAN BERBASIS OBJEK

## Posttest 3

### Sistem Pendataan Karyawan di Perusahaan

---

## Identitas

NIM : 2409106016
Nama : Azira Faradina
Mata Kuliah : Pemrograman Berorientasi Objek

---

## Deskripsi Program

Program ini merupakan pengembangan dari Posttest sebelumnya dengan menambahkan konsep **Inheritance** pada sistem pendataan karyawan.

Program mampu melakukan:

* Tambah data karyawan tetap
* Tambah data karyawan kontrak
* Menampilkan data

---

## Konsep yang Digunakan

### 1. Inheritance

Inheritance adalah proses pewarisan atribut dan method dari superclass ke subclass.

Pada program ini:

* `Karyawan` sebagai superclass
* `KaryawanTetap` dan `KaryawanKontrak` sebagai subclass

Relasi yang digunakan adalah **is-a relationship**:

* KaryawanTetap adalah Karyawan
* KaryawanKontrak adalah Karyawan

---

### 2. Tipe Inheritance

Program ini menggunakan **Hierarchical Inheritance**, yaitu satu superclass memiliki lebih dari satu subclass.

---

### 3. Penggunaan Keyword

* `extends` → untuk pewarisan
* `super` → memanggil constructor superclass
* `@Override` → override method

---

### Screenshot Output

1. Menu Program

   ![Menu Program](../assets/Posttest_2/Menu.png)
2. Tambah Karyawan

   ![create_data](../assets/Posttest_3/create_1.png)
   ![create_data_2](../assets/Posttest_3/create_2.png)
3. Tampilkan Karyawan

   ![read_data](../assets/Posttest_3/read.png)

---

## Kesimpulan

Dengan menerapkan inheritance, program menjadi lebih terstruktur dan tidak perlu mengulang atribut yang sama. Setiap jenis karyawan dapat memiliki karakteristik masing-masing tanpa mengubah struktur utama.
